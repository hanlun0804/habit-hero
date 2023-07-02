package habit.habithero.Adapter;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001!B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u001c\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0006H\u0016J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\nH\u0002J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\nH\u0002J\u0014\u0010\u001e\u001a\u00020\u00142\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0 R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lhabit/habithero/Adapter/TaskAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lhabit/habithero/Adapter/TaskAdapter$TaskViewHolder;", "context", "Landroid/content/Context;", "layoutResourceId", "", "(Landroid/content/Context;I)V", "FullList", "Ljava/util/ArrayList;", "Lhabit/habithero/Models/Habit;", "HabitsList", "database", "Lhabit/habithero/Database/HabitDatabase;", "getDatabase", "()Lhabit/habithero/Database/HabitDatabase;", "setDatabase", "(Lhabit/habithero/Database/HabitDatabase;)V", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeItem", "habit", "updateHabitInDatabase", "updateList", "newList", "", "TaskViewHolder", "app_release"})
public final class TaskAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<habit.habithero.Adapter.TaskAdapter.TaskViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    private final int layoutResourceId = 0;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<habit.habithero.Models.Habit> HabitsList = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<habit.habithero.Models.Habit> FullList = null;
    @org.jetbrains.annotations.NotNull
    private habit.habithero.Database.HabitDatabase database;
    
    public TaskAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, int layoutResourceId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final habit.habithero.Database.HabitDatabase getDatabase() {
        return null;
    }
    
    public final void setDatabase(@org.jetbrains.annotations.NotNull
    habit.habithero.Database.HabitDatabase p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public habit.habithero.Adapter.TaskAdapter.TaskViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    habit.habithero.Adapter.TaskAdapter.TaskViewHolder holder, int position) {
    }
    
    private final void removeItem(habit.habithero.Models.Habit habit) {
    }
    
    private final void updateHabitInDatabase(habit.habithero.Models.Habit habit) {
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull
    java.util.List<habit.habithero.Models.Habit> newList) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011\u00a8\u0006\u0014"}, d2 = {"Lhabit/habithero/Adapter/TaskAdapter$TaskViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lhabit/habithero/Adapter/TaskAdapter;Landroid/view/View;)V", "btnX", "Landroid/widget/ImageButton;", "kotlin.jvm.PlatformType", "getBtnX", "()Landroid/widget/ImageButton;", "checkbox", "Landroid/widget/CheckBox;", "getCheckbox", "()Landroid/widget/CheckBox;", "title", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "titleManage", "getTitleManage", "app_release"})
    public final class TaskViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView title = null;
        private final android.widget.TextView titleManage = null;
        private final android.widget.CheckBox checkbox = null;
        private final android.widget.ImageButton btnX = null;
        
        public TaskViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        public final android.widget.TextView getTitle() {
            return null;
        }
        
        public final android.widget.TextView getTitleManage() {
            return null;
        }
        
        public final android.widget.CheckBox getCheckbox() {
            return null;
        }
        
        public final android.widget.ImageButton getBtnX() {
            return null;
        }
    }
}