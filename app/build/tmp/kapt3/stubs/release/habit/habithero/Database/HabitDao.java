package habit.habithero.Database;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\r"}, d2 = {"Lhabit/habithero/Database/HabitDao;", "", "delete", "", "habit", "Lhabit/habithero/Models/Habit;", "deleteAll", "getAll", "Landroidx/lifecycle/LiveData;", "", "getToday", "insert", "update", "app_release"})
@androidx.room.Dao
@androidx.room.TypeConverters(value = {habit.habithero.Models.Converters.class})
public abstract interface HabitDao {
    
    @androidx.room.Query(value = "SELECT * FROM habits_table")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<habit.habithero.Models.Habit>> getAll();
    
    @androidx.room.Query(value = "SELECT * FROM habits_table WHERE isToday = 1")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<habit.habithero.Models.Habit> getToday();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull
    habit.habithero.Models.Habit habit);
    
    @androidx.room.Delete
    public abstract void delete(@org.jetbrains.annotations.NotNull
    habit.habithero.Models.Habit habit);
    
    @androidx.room.Query(value = "DELETE FROM habits_table")
    public abstract void deleteAll();
    
    @androidx.room.Update
    public abstract void update(@org.jetbrains.annotations.NotNull
    habit.habithero.Models.Habit habit);
}