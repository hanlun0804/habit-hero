package habit.habithero.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import habit.habithero.Models.Converters
import habit.habithero.Models.Habit

@Database(entities = [Habit :: class], version = 2)
@TypeConverters(Converters::class)
abstract class HabitDatabase : RoomDatabase() {
    abstract fun getHabitDao() : HabitDao

    // Uses a companion object because database should be static and not connected to individual instances
    companion object {

        // Guarantees that attempts to read the database gets updated information
        @Volatile
        private var INSTANCE : HabitDatabase? = null

        fun getDataBase(context : Context): HabitDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            // If tempInstance equals null, database is built
            // Uses custom converters to convert certain datatypes to data possible to store in the database
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    HabitDatabase::class.java,
                    "habit_database"
                ).addTypeConverter(Converters()).fallbackToDestructiveMigration().build()
                INSTANCE = instance
                return instance
            }
        }
    }
}