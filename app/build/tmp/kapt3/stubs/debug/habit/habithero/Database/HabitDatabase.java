package habit.habithero.Database;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lhabit/habithero/Database/HabitDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getHabitDao", "Lhabit/habithero/Database/HabitDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {habit.habithero.Models.Habit.class}, version = 2)
@androidx.room.TypeConverters(value = {habit.habithero.Models.Converters.class})
public abstract class HabitDatabase extends androidx.room.RoomDatabase {
    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private static volatile habit.habithero.Database.HabitDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull
    public static final habit.habithero.Database.HabitDatabase.Companion Companion = null;
    
    public HabitDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract habit.habithero.Database.HabitDao getHabitDao();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lhabit/habithero/Database/HabitDatabase$Companion;", "", "()V", "INSTANCE", "Lhabit/habithero/Database/HabitDatabase;", "getDataBase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final habit.habithero.Database.HabitDatabase getDataBase(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}