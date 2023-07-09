package habit.habithero.Database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.TypeConverters
import androidx.room.Update
import habit.habithero.Models.Converters
import habit.habithero.Models.Habit


@Dao
@TypeConverters(Converters::class)
interface HabitDao {

    @Query("SELECT * FROM habits_table")
    fun getAll() : LiveData<List<Habit>>

    @Query("SELECT * FROM habits_table WHERE isToday = 1")
    fun getToday() : List<Habit>

    @Query("SELECT * FROM habits_table WHERE isChecked = 1")
    fun getChecked() : List<Habit>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(habit : Habit)

    @Delete
    fun delete(habit : Habit)

    @Query("DELETE FROM habits_table")
    fun deleteAll()


    @Update
    fun update(habit: Habit)
}