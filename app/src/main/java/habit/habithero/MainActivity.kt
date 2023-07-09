package habit.habithero

import android.app.AlarmManager
import android.app.AlertDialog
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import androidx.core.app.NotificationManagerCompat
import habit.habithero.Database.HabitDatabase
import habit.habithero.Models.Habit
import habit.habithero.Utilities.NotificationReceiver
import habit.habithero.Utilities.ResetCheckedStatusReceiver
import habit.habithero.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var database: HabitDatabase
    private val mainScope = CoroutineScope(Dispatchers.Main)
    private lateinit var notificationManager: NotificationManager
    private val NOTIFICATION_PERMISSION_REQUEST_CODE = 1001
    private var requestedNotificationPermission = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Binds "MainActivity" to "activity_main" and sets it as content view
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initializes notification manager and sets up notification permission
        notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationPermissionSetup()

        // Schedules daily notifications, will only show notifications if permission is granted
        setDailyNotifications()

        // Resets the checkboxes at midnight
        resetCheckboxes()

        // Initializes UI
        initUI()

        // Initializes database
        database = HabitDatabase.getDataBase(this)

        // Changes character
        mainScope.launch {
            changeCharacter()
        }
    }

    private fun initUI() {
        // Adds button that takes user to "AddHabitActivity"
        val btnAddHabit = binding.btnAddHabit
        btnAddHabit.setOnClickListener {
            val intent = Intent(this, AddHabitActivity::class.java)
            startActivity(intent)
        }

        // Adds button that takes user to "SeeTasksActivity"
        val btnSeeTasks = binding.btnSeeTasks
        btnSeeTasks.setOnClickListener {
            val intent = Intent(this, SeeTasksActivity::class.java)
            startActivity(intent)
        }

        // Adds button that takes user to "ManageTasksActivity"
        val btnManageHabits = binding.btnManageHabits
        btnManageHabits.setOnClickListener {
            val intent = Intent(this, ManageHabitsActivity::class.java)
            startActivity(intent)
        }
    }

    private fun notificationPermissionSetup() {
        // Checks if notifications are previously requested
        /*
        - Uses getPreferences() since the preference is only used in "MainActivity"
        - Gets the boolean from the key-value pair with "notification_permission_requested" as key, returns false by default
         */
        val sharedPreferences = getPreferences(Context.MODE_PRIVATE)

        requestedNotificationPermission = sharedPreferences.getBoolean("notification_permission_requested", false)

        // Requests notification permission if it has not previously been requested
        // If permission has not been requested before, request it
        if (!requestedNotificationPermission) {
            val notificationManager = NotificationManagerCompat.from(this)

            // Checks that the notifications aren't already granted permission
            val notificationsEnabled = notificationManager.areNotificationsEnabled()

            if (!notificationsEnabled) {
                showPermissionWindow()
            }

            // Sets requestedNotificationPermission to true, so the user won't be asked every time they open MainActivity
            val editPreference = sharedPreferences.edit()
            editPreference.putBoolean("notification_permission_requested", true)
            editPreference.apply()
        }
    }

    private fun resetCheckboxes() {
        // Creates an Intent for the "NotificationReceiver" in Utilities
        val intent = Intent(this, ResetCheckedStatusReceiver::class.java)
        // PendingIntent allows the app to send notifications, even if the app isn't running
        /*
        - PendingIntent.FLAG_UPDATE_CURRENT: keeps PendingIntent if it exists, replace data with new data
        - PendingIntent.FLAG_MUTABLE: makes intent mutable
        - PendingIntent.FLAG_IMMUTABLE: makes intent immutable
         */
        val pendingIntent = PendingIntent.getBroadcast(
            this,
            0,
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) PendingIntent.FLAG_MUTABLE else PendingIntent.FLAG_IMMUTABLE
        )

        // Sets 18:00 as fire time for notification
        val calendar = Calendar.getInstance()
        calendar.apply {
            timeInMillis = System.currentTimeMillis()
            set(Calendar.HOUR_OF_DAY, 0)
            set(Calendar.MINUTE, 0)
            set(Calendar.SECOND, 0)
        }

        // Declares and initializes an AlarmManager
        val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager

        // Sets the alarm to repeat daily
        alarmManager.setRepeating(
            AlarmManager.RTC_WAKEUP, calendar.timeInMillis, AlarmManager.INTERVAL_DAY, pendingIntent
        )
    }

    private fun setDailyNotifications() {
        // Creates an Intent for the "NotificationReceiver" in Utilities
        val intent = Intent(this, NotificationReceiver::class.java)
        // PendingIntent allows the app to send notifications, even if the app isn't running
        /*
        - PendingIntent.FLAG_UPDATE_CURRENT: keeps PendingIntent if it exists, replace data with new data
        - PendingIntent.FLAG_MUTABLE: makes intent mutable
        - PendingIntent.FLAG_IMMUTABLE: makes intent immutable
         */
        val pendingIntent = PendingIntent.getBroadcast(
            this,
            0,
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) PendingIntent.FLAG_MUTABLE else PendingIntent.FLAG_IMMUTABLE
        )

        // Sets 18:00 as fire time for notification
        val calendar = Calendar.getInstance()
        calendar.apply {
            timeInMillis = System.currentTimeMillis()
            set(Calendar.HOUR_OF_DAY, 18)
            set(Calendar.MINUTE, 0)
            set(Calendar.SECOND, 0)
        }

        // Declares and initializes an AlarmManager
        val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager

        // Sets the alarm to repeat daily
        alarmManager.setRepeating(
            AlarmManager.RTC_WAKEUP, calendar.timeInMillis, AlarmManager.INTERVAL_DAY, pendingIntent
        )
    }

    // Asks the user for permission, and guides them to their notification settings if they accept
    private fun showPermissionWindow() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Notification Permission")
            .setMessage("Habit Hero wants to remind you of your daily tasks. Do you want notifications?")
            .setPositiveButton("Grant") { dialog, _ ->
                dialog.dismiss()
                changeNotificationSettings()
            }
            .setNegativeButton("Deny") { dialog, _ ->
                dialog.dismiss()
            }
            .setCancelable(false)
            .show()
    }

    private fun changeNotificationSettings() {
        val intent = Intent(Settings.ACTION_APP_NOTIFICATION_SETTINGS)
        intent.putExtra(Settings.EXTRA_APP_PACKAGE, packageName)
        startActivityForResult(intent, NOTIFICATION_PERMISSION_REQUEST_CODE)
    }

    // Returns a list of today's tasks. Is "suspend", so needs to be called from corountine.
    suspend fun readData(): List<Habit> {
        lateinit var habits: List<Habit>
        // withContext ensures the database is retrieved on a background thread
        withContext(Dispatchers.IO) {
            habits = database.getHabitDao().getToday()
        }
        return habits
    }

    // Returns the amount of checked items
    suspend fun getCheckedAmount(): Int {
        var checkedAmount: Int = 0
        val data: List<Habit> = readData()
        for (i in 0 until data.size) {
            if (data[i].isChecked) {
                checkedAmount++
            }
        }
        return checkedAmount
    }

    // Changes image of character
    suspend fun changeCharacter() {
        val data: List<Habit> = readData()
        val notCheckedAmount: Int = data.size - getCheckedAmount()
        when (notCheckedAmount) {
            1 -> { binding.imgView.setImageResource(R.drawable.character) }
            0 -> { binding.imgView.setImageResource(R.drawable.smiling_character) }
            else -> { binding.imgView.setImageResource(R.drawable.sad_character) }
        }
    }
}


