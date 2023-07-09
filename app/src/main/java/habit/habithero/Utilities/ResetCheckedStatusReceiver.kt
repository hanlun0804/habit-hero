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
import habit.habithero.Models.Habit
import habit.habithero.Models.HabitViewModel
import habit.habithero.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ResetCheckedStatusReceiver : BroadcastReceiver() {
    private lateinit var database: HabitDatabase
    private var mainActivity: MainActivity = MainActivity()

    override fun onReceive(context: Context?, intent: Intent?) {
        resetCheckboxes(context)
    }

    private fun resetCheckboxes(context: Context?) {
        Log.d("MYAPP", "ResetReceiver")
        // Initialize the HabitDatabase
        database = context?.let { HabitDatabase.getDataBase(it) }!!
        // Initiates viewmodel
        // viewModel = HabitViewModel(application)

        // Creates a coroutine scope to access database background thread
        val coroutineScope = CoroutineScope(Dispatchers.IO)
        coroutineScope.launch {
            lateinit var habits: List<Habit>
            // Data from database is retrieved on background thread
            withContext(Dispatchers.IO) {
                habits = database.getHabitDao().getChecked()
            }

            if (!habits.isNullOrEmpty()) {
                for (habit in habits) {
                    habit.isChecked = false
                    // Updates habit
                    // viewModel.updateHabit(habit)
                    updateHabitInDatabase(habit)
                }
            }
            mainActivity.changeCharacter()
        }
    }

    private fun updateHabitInDatabase(habit: Habit) {
        // Accesses the database on a background thread
        GlobalScope.launch(Dispatchers.IO) {
            database.getHabitDao().update(habit)
        }
    }

}