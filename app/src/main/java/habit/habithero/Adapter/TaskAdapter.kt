package habit.habithero.Adapter

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import habit.habithero.Database.HabitDatabase
import habit.habithero.Models.Habit
import habit.habithero.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class TaskAdapter(private val context: Context, private val layoutResourceId: Int) : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {
    private val HabitsList = ArrayList<Habit>()
    private val FullList = ArrayList<Habit>()
    var database: HabitDatabase = HabitDatabase.getDataBase(context)


    // Returns a TaskViewHolder as defined in the inner class
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        return TaskViewHolder(
            LayoutInflater.from(context).inflate(layoutResourceId, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return HabitsList.size
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        // Defines how elements should be displayed and handled in the recycling view, based on which activity it is connected to
        if (layoutResourceId == R.layout.habit_item) {
            val currentHabit = HabitsList[position]
            holder.title.text = currentHabit.title
            holder.checkbox.isChecked = currentHabit.isChecked
            holder.checkbox.setOnCheckedChangeListener(null)
            holder.checkbox.setOnCheckedChangeListener { _, isChecked ->
                currentHabit.isChecked = isChecked
                updateHabitInDatabase(currentHabit)
            }
        } else if (layoutResourceId == R.layout.manage_item) {
            val currentHabit = HabitsList[position]
            holder.titleManage.text = currentHabit.title
            // Displays a confirmation request when user clicks x
            holder.btnX.setOnClickListener {
                val builder = AlertDialog.Builder(context)
                builder.setTitle("Habit will be permanently deleted")
                    .setMessage("Are you sure you want to delete this habit?")
                    .setPositiveButton("Yes") { dialog, _ ->
                        removeItem(currentHabit)
                        dialog.dismiss()
                    }
                    .setNegativeButton("No") { dialog, _ ->
                        dialog.dismiss()
                    }
                    .setCancelable(false)
                    .show()
            }
        }

    }

    private fun removeItem(habit: Habit) {
        val position = HabitsList.indexOf(habit)
        HabitsList.removeAt(position)
        notifyItemRemoved(position)
        // Deletes habit from database on a background thread
        GlobalScope.launch(Dispatchers.IO) {
            database.getHabitDao().delete(habit)
        }
    }

    private fun updateHabitInDatabase(habit: Habit) {
        // Accesses the database on a background thread
        GlobalScope.launch(Dispatchers.IO) {
            database.getHabitDao().update(habit)
        }
    }

    // Updates list
    fun updateList(newList: List<Habit>){

        FullList.clear()
        FullList.addAll(newList)

        HabitsList.clear()
        HabitsList.addAll(FullList)
        notifyDataSetChanged()

    }

    // Defines an inner class that has elements connected to activity_manage_habits and activity_see_tasks to be used in TaskAdapter
    inner class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val title = itemView.findViewById<TextView>(R.id.tvHabitTitleItem)
        val titleManage = itemView.findViewById<TextView>(R.id.tvManageTitleItem)
        val checkbox = itemView.findViewById<CheckBox>(R.id.cbDone)
        val btnX = itemView.findViewById<ImageButton>(R.id.btnX)

    }
}