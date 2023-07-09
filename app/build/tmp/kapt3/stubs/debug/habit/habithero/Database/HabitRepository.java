package habit.habithero.Database;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0016R\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lhabit/habithero/Database/HabitRepository;", "Lhabit/habithero/Database/HabitDao;", "habitDao", "(Lhabit/habithero/Database/HabitDao;)V", "allHabits", "Landroidx/lifecycle/LiveData;", "", "Lhabit/habithero/Models/Habit;", "getAllHabits", "()Landroidx/lifecycle/LiveData;", "delete", "", "habit", "deleteAll", "getAll", "getChecked", "getToday", "insert", "update", "app_debug"})
public final class HabitRepository implements habit.habithero.Database.HabitDao {
    @org.jetbrains.annotations.NotNull
    private final habit.habithero.Database.HabitDao habitDao = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<habit.habithero.Models.Habit>> allHabits = null;
    
    public HabitRepository(@org.jetbrains.annotations.NotNull
    habit.habithero.Database.HabitDao habitDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<habit.habithero.Models.Habit>> getAllHabits() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.LiveData<java.util.List<habit.habithero.Models.Habit>> getAll() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.util.List<habit.habithero.Models.Habit> getToday() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.util.List<habit.habithero.Models.Habit> getChecked() {
        return null;
    }
    
    @java.lang.Override
    public void insert(@org.jetbrains.annotations.NotNull
    habit.habithero.Models.Habit habit) {
    }
    
    @java.lang.Override
    public void delete(@org.jetbrains.annotations.NotNull
    habit.habithero.Models.Habit habit) {
    }
    
    @java.lang.Override
    public void deleteAll() {
    }
    
    @java.lang.Override
    public void update(@org.jetbrains.annotations.NotNull
    habit.habithero.Models.Habit habit) {
    }
}