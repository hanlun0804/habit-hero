package habit.habithero;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\t\u001a\u00020\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\rH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\nH\u0002J\u0012\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0015\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lhabit/habithero/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lhabit/habithero/databinding/ActivityMainBinding;", "database", "Lhabit/habithero/Database/HabitDatabase;", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "changeCharacter", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCheckedAmount", "", "initUI", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "readData", "", "Lhabit/habithero/Models/Habit;", "resetCheckboxes", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private habit.habithero.databinding.ActivityMainBinding binding;
    private habit.habithero.Database.HabitDatabase database;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope mainScope = null;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initUI() {
    }
    
    private final void resetCheckboxes() {
    }
    
    private final java.lang.Object readData(kotlin.coroutines.Continuation<? super java.util.List<habit.habithero.Models.Habit>> $completion) {
        return null;
    }
    
    private final java.lang.Object getCheckedAmount(kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    private final java.lang.Object changeCharacter(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}