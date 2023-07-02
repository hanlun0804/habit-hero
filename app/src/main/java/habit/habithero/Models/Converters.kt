package habit.habithero.Models

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter

@ProvidedTypeConverter
class Converters {
    @TypeConverter
    fun fromStringList(value: List<String>): String {
        return value.joinToString(",")
    }

    @TypeConverter
    fun toStringList(value: String): List<String> {
        return value.split(",")
    }

    @TypeConverter
    fun fromIntList(dayList: MutableList<Int>): String {
        return dayList.joinToString(",")
    }

    @TypeConverter
    fun toIntList(dayString: String): MutableList<Int> {
        return dayString.split(",").filter { it.isNotEmpty() }.map { it.trim().toInt() }.toMutableList()
    }
}