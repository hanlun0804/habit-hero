package habit.habithero;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\u0011\u0010\u0013\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\b\u0010\u001c\u001a\u00020\u0010H\u0002J\b\u0010\u001d\u001a\u00020\u0010H\u0002J\b\u0010\u001e\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lhabit/habithero/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "NOTIFICATION_PERMISSION_REQUEST_CODE", "", "binding", "Lhabit/habithero/databinding/ActivityMainBinding;", "database", "Lhabit/habithero/Database/HabitDatabase;", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "notificationManager", "Landroid/app/NotificationManager;", "requestedNotificationPermission", "", "changeCharacter", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changeNotificationSettings", "getCheckedAmount", "initUI", "notificationPermissionSetup", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "readData", "", "Lhabit/habithero/Models/Habit;", "resetCheckboxes", "setDailyNotifications", "showPermissionWindow", "app_release"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private habit.habithero.databinding.ActivityMainBinding binding;
    private habit.habithero.Database.HabitDatabase database;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope mainScope = null;
    private android.app.NotificationManager notificationManager;
    private final int NOTIFICATION_PERMISSION_REQUEST_CODE = 1001;
    private boolean requestedNotificationPermission = false;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initUI() {
    }
    
    private final void notificationPermissionSetup() {
    }
    
    private final void resetCheckboxes() {
    }
    
    private final void setDailyNotifications() {
    }
    
    private final void showPermissionWindow() {
    }
    
    private final void changeNotificationSettings() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object readData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<habit.habithero.Models.Habit>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getCheckedAmount(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object changeCharacter(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}