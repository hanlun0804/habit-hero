package habit.habithero

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import habit.habithero.Adapter.TaskAdapter
import habit.habithero.Database.HabitDatabase
import habit.habithero.Models.Habit
import habit.habithero.Models.HabitViewModel
import habit.habithero.databinding.ActivitySeeTasksBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

class SeeTasksActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySeeTasksBinding
    private lateinit var database: HabitDatabase
    lateinit var viewModel: HabitViewModel
    lateinit var adapter: TaskAdapter
    companion object {
        var tmpDate = 5
        fun setTempDate(newDate: Int) {
            tmpDate = newDate
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Binds SeeTasksActivity to activity_see_tasks
        binding = ActivitySeeTasksBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initiates viewModel
        viewModel = ViewModelProvider(this,
            ViewModelProvider.AndroidViewModelFactory.getInstance(application)).get(HabitViewModel::class.java)


        // Initiates UI
        initUI()

        // Initiate database
        database = HabitDatabase.getDataBase(this)

        // Starts displaying data
        lifecycleScope.launch {
            displayData(readData())
        }

    }

   /*
    override fun onResume() {
        super.onResume()

        // Updates isChecked
        resetIsChecked()
    }

    */

    private fun initUI() {
        // Adds button that takes user to main screen
        val btnBack = binding.fabBack
        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        // Spesifies that the adapter in activity_manage_habits has a fixed size and has a gridlayout with 1 in width
        binding.rvHabitItems.setHasFixedSize(true)
        binding.rvHabitItems.layoutManager = StaggeredGridLayoutManager(1, LinearLayout.VERTICAL)
        // Initialize the adapter and sets the adapter in activity_manage_habits to current adapter
        adapter = TaskAdapter(this, R.layout.habit_item)
        binding.rvHabitItems.adapter = adapter
    }

    // Returns list of the habits that should be displayed on the current date
    private suspend fun readData(): List<Habit> {
        // Updates which habits should be displayed on current date
        updateTodayStatus()
        lateinit var habits: List<Habit>
        // withContext ensures the database is retrieved on a background thread
        withContext(Dispatchers.IO) {
            habits = database.getHabitDao().getToday()
        }
        return habits
    }

    /*
    private fun resetIsChecked() {
        // Reset isChecked to 0 at midnight
        if (6 != tmpDate) {
            Log.d("MYAPP", "Date: ${6.toString()}")
            Log.d("MYAPP", "Temp: ${tmpDate.toString()}")
            setTempDate(6)
            viewModel.resetHabitCheckedStatus()
            Log.d("MYAPP", "Temp: ${tmpDate.toString()}")
            database
        }
    }

     */



    // Updates which habits should be added on the current date
    private fun updateTodayStatus() {
        // Declares and initializes variables used for dealing with time
        val currTime = Date()
        val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        val formattedDate = dateFormat.format(currTime)
        val parsedDate = dateFormat.parse(formattedDate)
        val calendar = Calendar.getInstance()
        calendar.time = parsedDate
        val month = calendar.get(Calendar.MONTH)
        val date = calendar.get(Calendar.DAY_OF_MONTH)
        val day = calendar.get(Calendar.DAY_OF_WEEK)

        // Starts a coroutine
        lifecycleScope.launch {
            lateinit var habits: List<Habit>
            // Data from database is retrieved on background thread
            withContext(Dispatchers.IO) {
                habits = database.getHabitDao().getToday()
            }

            if (!habits.isNullOrEmpty()) {
                for (habit in habits) {

                    var tempDate: Int = date
                    // Checks if it should be repeated on a specific date (0 by default)
                    if (habit.repeatOnDate == 0) {
                        habit.isToday = habit.repeatOnDay.contains(day)
                    } else {
                        // Sets that it should be displayed on the last day of the month
                        if (month == 2) {
                            if (habit.repeatOnDate > 28) {
                                tempDate = 28
                            }
                        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                            if (habit.repeatOnDate > 30) {
                                tempDate = 30
                            }
                        }
                        habit.isToday = (habit.repeatOnDate == tempDate)
                    }
                    // Updates habit
                    viewModel.updateHabit(habit)
                }
            }
        }
    }

    // Displays data in habits
    private fun displayData(habits: List<Habit>) {
        adapter.updateList(habits)
    }
}