package habit.habithero.Models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters


@Entity(tableName = "habits_table")
@TypeConverters(Converters::class)
data class Habit (
    @PrimaryKey(autoGenerate = true) val id : Int?,
    @ColumnInfo(name = "title") val title: String?,
    @ColumnInfo(name = "category") val category: String?,
    @ColumnInfo(name = "repeatOnDate") val repeatOnDate: Int = 0,
    @ColumnInfo(name = "repeatOnDay") val repeatOnDay: MutableList<Int> = mutableListOf(), // List is empty if days are not applicable
    @ColumnInfo(name = "timesADay") val timesADay: Int?,
    @ColumnInfo(name = "isChecked") var isChecked: Boolean = false,
    @ColumnInfo(name = "isToday") var isToday: Boolean = true
) : java.io.Serializable