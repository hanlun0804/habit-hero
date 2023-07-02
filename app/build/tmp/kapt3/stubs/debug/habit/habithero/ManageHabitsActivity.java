package habit.habithero;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001cH\u0002J\b\u0010\u001f\u001a\u00020\u001aH\u0002J\u0012\u0010 \u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\u0014\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001cH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006$"}, d2 = {"Lhabit/habithero/ManageHabitsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lhabit/habithero/Adapter/TaskAdapter;", "getAdapter", "()Lhabit/habithero/Adapter/TaskAdapter;", "setAdapter", "(Lhabit/habithero/Adapter/TaskAdapter;)V", "binding", "Lhabit/habithero/databinding/ActivityManageHabitsBinding;", "database", "Lhabit/habithero/Database/HabitDatabase;", "repository", "Lhabit/habithero/Database/HabitRepository;", "getRepository", "()Lhabit/habithero/Database/HabitRepository;", "setRepository", "(Lhabit/habithero/Database/HabitRepository;)V", "viewModel", "Lhabit/habithero/Models/HabitViewModel;", "getViewModel", "()Lhabit/habithero/Models/HabitViewModel;", "setViewModel", "(Lhabit/habithero/Models/HabitViewModel;)V", "displayData", "", "liveHabits", "Landroidx/lifecycle/LiveData;", "", "Lhabit/habithero/Models/Habit;", "initUI", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "readData", "app_debug"})
public final class ManageHabitsActivity extends androidx.appcompat.app.AppCompatActivity {
    private habit.habithero.databinding.ActivityManageHabitsBinding binding;
    private habit.habithero.Database.HabitDatabase database;
    public habit.habithero.Adapter.TaskAdapter adapter;
    public habit.habithero.Database.HabitRepository repository;
    public habit.habithero.Models.HabitViewModel viewModel;
    
    public ManageHabitsActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final habit.habithero.Adapter.TaskAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull
    habit.habithero.Adapter.TaskAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final habit.habithero.Database.HabitRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull
    habit.habithero.Database.HabitRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final habit.habithero.Models.HabitViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull
    habit.habithero.Models.HabitViewModel p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initUI() {
    }
    
    private final androidx.lifecycle.LiveData<java.util.List<habit.habithero.Models.Habit>> readData() {
        return null;
    }
    
    private final void displayData(androidx.lifecycle.LiveData<java.util.List<habit.habithero.Models.Habit>> liveHabits) {
    }
}