package habit.habithero.Utilities

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import android.util.Log
import androidx.core.app.NotificationCompat
import habit.habithero.Database.HabitDatabase
import habit.habithero.MainActivity
import habit.habithero.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class NotificationReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        showNotification(context)
    }

    private fun showNotification(context: Context?) {
        Log.d("MYAPP", "NotificationReceiver")

        val notificationManager = context?.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        // Creates a coroutine scope to access database background thread
        val coroutineScope = CoroutineScope(Dispatchers.IO)
        coroutineScope.launch {
            // Accesses database and checks if there are tasks to be done today
            val database = HabitDatabase.getDataBase(context)
            val tasksCount = database.getHabitDao().getToday().count { !it.isChecked }

            Log.d("MYAPP", "Task count: $tasksCount")

            withContext(Dispatchers.Main) {
                if (tasksCount > 0) {
                    Log.d("MYAPP", "Gets into if")
                    // Creates an intent to launch the MainActivity when the notification is clicked
                    val intent = Intent(context, MainActivity::class.java)
                    // FLAG_ACTIVITY_CLEAR_TOP: handles the case where MainActivity already is open
                    // FLAG_ACTIVITY_SINGLE_TOP: handles the case where MainActivity is not open
                    intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP

                    val requestCode = System.currentTimeMillis().toInt() + 2

                    // PendingIntent allows getActivity() to perform in the future
                    val pendingIntent = PendingIntent.getActivity(
                        context,
                        requestCode,
                        intent,
                        PendingIntent.FLAG_UPDATE_CURRENT or if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) PendingIntent.FLAG_MUTABLE else PendingIntent.FLAG_IMMUTABLE
                    )

                    // Builds the notification
                    val notificationBuilder = NotificationCompat.Builder(context, "channelID")
                        .setSmallIcon(R.drawable.habit_icon)
                        .setContentTitle("You have more tasks")
                        .setContentText("Habit Hero needs you to do today's tasks!")
                        .setAutoCancel(true)
                        .setContentIntent(pendingIntent)
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT)

                    val managerId = System.currentTimeMillis().toInt() + 3
                    notificationManager.notify(managerId, notificationBuilder.build())
                }
            }
        }
    }

}