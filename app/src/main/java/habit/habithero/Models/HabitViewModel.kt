package habit.habithero.Models

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import habit.habithero.Database.HabitDatabase
import habit.habithero.Database.HabitRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class HabitViewModel(application: Application) : AndroidViewModel(application) {
    private val repository : HabitRepository
    var allHabits : LiveData<List<Habit>>

    init {
        val dao = HabitDatabase.getDataBase(application).getHabitDao()
        repository = HabitRepository(dao)
        allHabits = repository.allHabits
    }

    fun updateHabit(habit: Habit) {
        // Creates coroutine, accesses database to update habit on a background thread
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                repository.update(habit)
            }
        }
    }
}