package habit.habithero;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001b\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002\u00a2\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0018H\u0002J\u0012\u0010\u001e\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\u0018H\u0002JE\u0010\"\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010%\u001a\u00020$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\'2\u0006\u0010(\u001a\u00020$H\u0002\u00a2\u0006\u0002\u0010)R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006*"}, d2 = {"Lhabit/habithero/AddHabitActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lhabit/habithero/databinding/ActivityAddHabitBinding;", "database", "Lhabit/habithero/Database/HabitDatabase;", "habit", "Lhabit/habithero/Models/Habit;", "habitTitle", "", "llDate", "Landroid/view/View;", "llDays", "llTimesDay", "selectedCategoryItem", "selectedFrequencyItem", "viewModel", "Lhabit/habithero/Models/HabitViewModel;", "getViewModel", "()Lhabit/habithero/Models/HabitViewModel;", "setViewModel", "(Lhabit/habithero/Models/HabitViewModel;)V", "initUI", "", "checkboxes", "", "Landroid/widget/CheckBox;", "([Landroid/widget/CheckBox;)V", "initiateSpinners", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "updateTodayStatus", "writeData", "id", "", "repeatOnDate", "repeatOnDay", "", "etnsTimesDay", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;I)V", "app_debug"})
public final class AddHabitActivity extends androidx.appcompat.app.AppCompatActivity {
    private habit.habithero.databinding.ActivityAddHabitBinding binding;
    private android.view.View llTimesDay;
    private android.view.View llDays;
    private android.view.View llDate;
    private java.lang.String selectedFrequencyItem;
    private java.lang.String selectedCategoryItem;
    private java.lang.String habitTitle;
    private habit.habithero.Database.HabitDatabase database;
    public habit.habithero.Models.HabitViewModel viewModel;
    private habit.habithero.Models.Habit habit;
    
    public AddHabitActivity() {
        super();
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
    
    private final void initUI(android.widget.CheckBox[] checkboxes) {
    }
    
    private final void initiateSpinners() {
    }
    
    private final void writeData(java.lang.Integer id, java.lang.String habitTitle, java.lang.String selectedCategoryItem, int repeatOnDate, java.util.List<java.lang.Integer> repeatOnDay, int etnsTimesDay) {
    }
    
    private final void updateTodayStatus() {
    }
}