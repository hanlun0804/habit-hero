package habit.habithero.Database

import androidx.lifecycle.LiveData
import habit.habithero.Models.Habit

class HabitRepository(private val habitDao: HabitDao) : HabitDao {
    // Defines methods necessary to retrieve and handle data from the database
    val allHabits : LiveData<List<Habit>> = habitDao.getAll()
    override fun getAll(): LiveData<List<Habit>> {
        return habitDao.getAll()
    }

    override fun getToday(): List<Habit> {
        return habitDao.getToday()
    }

    override fun getChecked(): List<Habit> {
        return habitDao.getChecked()
    }
    override fun insert(habit : Habit) {
        habitDao.insert(habit)
    }

    override fun delete(habit: Habit) {
        habitDao.delete(habit)
    }

    override fun deleteAll() {
        habitDao.deleteAll()
    }

    override fun update(habit : Habit) {
        habitDao.update(habit)
    }
}