package habit.habithero.Models;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\bR&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lhabit/habithero/Models/HabitViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allHabits", "Landroidx/lifecycle/LiveData;", "", "Lhabit/habithero/Models/Habit;", "getAllHabits", "()Landroidx/lifecycle/LiveData;", "setAllHabits", "(Landroidx/lifecycle/LiveData;)V", "repository", "Lhabit/habithero/Database/HabitRepository;", "resetHabitCheckedStatus", "", "updateHabit", "habit", "app_release"})
public final class HabitViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    private final habit.habithero.Database.HabitRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.LiveData<java.util.List<habit.habithero.Models.Habit>> allHabits;
    
    public HabitViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<habit.habithero.Models.Habit>> getAllHabits() {
        return null;
    }
    
    public final void setAllHabits(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<java.util.List<habit.habithero.Models.Habit>> p0) {
    }
    
    public final void updateHabit(@org.jetbrains.annotations.NotNull
    habit.habithero.Models.Habit habit) {
    }
    
    public final void resetHabitCheckedStatus() {
    }
}