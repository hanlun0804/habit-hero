package habit.habithero;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\u0012\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0014H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lhabit/habithero/SeeTasksActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lhabit/habithero/Adapter/TaskAdapter;", "getAdapter", "()Lhabit/habithero/Adapter/TaskAdapter;", "setAdapter", "(Lhabit/habithero/Adapter/TaskAdapter;)V", "binding", "Lhabit/habithero/databinding/ActivitySeeTasksBinding;", "database", "Lhabit/habithero/Database/HabitDatabase;", "viewModel", "Lhabit/habithero/Models/HabitViewModel;", "getViewModel", "()Lhabit/habithero/Models/HabitViewModel;", "setViewModel", "(Lhabit/habithero/Models/HabitViewModel;)V", "displayData", "", "habits", "", "Lhabit/habithero/Models/Habit;", "initUI", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "readData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTodayStatus", "app_release"})
public final class SeeTasksActivity extends androidx.appcompat.app.AppCompatActivity {
    private habit.habithero.databinding.ActivitySeeTasksBinding binding;
    private habit.habithero.Database.HabitDatabase database;
    public habit.habithero.Models.HabitViewModel viewModel;
    public habit.habithero.Adapter.TaskAdapter adapter;
    
    public SeeTasksActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final habit.habithero.Models.HabitViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull
    habit.habithero.Models.HabitViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final habit.habithero.Adapter.TaskAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull
    habit.habithero.Adapter.TaskAdapter p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initUI() {
    }
    
    private final java.lang.Object readData(kotlin.coroutines.Continuation<? super java.util.List<habit.habithero.Models.Habit>> $completion) {
        return null;
    }
    
    private final void updateTodayStatus() {
    }
    
    private final void displayData(java.util.List<habit.habithero.Models.Habit> habits) {
    }
}