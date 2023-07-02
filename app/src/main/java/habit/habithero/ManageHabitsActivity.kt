package habit.habithero

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import habit.habithero.Adapter.TaskAdapter
import habit.habithero.Database.HabitDatabase
import habit.habithero.Database.HabitRepository
import habit.habithero.Models.Habit
import habit.habithero.Models.HabitViewModel
import habit.habithero.databinding.ActivityManageHabitsBinding
import kotlinx.coroutines.launch

class ManageHabitsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityManageHabitsBinding
    private lateinit var database: HabitDatabase
    lateinit var adapter: TaskAdapter
    lateinit var repository: HabitRepository
    lateinit var viewModel: HabitViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Binds ManageHabitsActivity to activity_manage_habtis
        binding = ActivityManageHabitsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initiates database, repository and viewmodel
        database = HabitDatabase.getDataBase(this)
        repository = HabitRepository(database.getHabitDao())
        viewModel = ViewModelProvider(this,
            ViewModelProvider.AndroidViewModelFactory.getInstance(application)).get(HabitViewModel::class.java)

        // Initiates UI
        initUI()

        // Displays data in recyclerview
        lifecycleScope.launch {
            displayData(readData())
        }
    }

    private fun initUI() {
        // Adds button that takes user to main screen
        val btnBack = binding.fabBack
        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        // Spesifies that the adapter in activity_manage_habits has a fixed size and has a gridlayout with 1 in width
        binding.rvManageItems.setHasFixedSize(true)
        binding.rvManageItems.layoutManager = StaggeredGridLayoutManager(1, LinearLayout.VERTICAL)
        // Initialize the adapter and sets the adapter in activity_manage_habits to current adapter
        adapter = TaskAdapter(this, R.layout.manage_item)
        binding.rvManageItems.adapter = adapter

    }

    // Returns LiveData<List<Habit>> with all habits added to database
    private fun readData(): LiveData<List<Habit>> {
        val liveDataHabits: LiveData<List<Habit>> = database.getHabitDao().getAll()
        return liveDataHabits
    }

    // Displays data from database
    private fun displayData(liveHabits: LiveData<List<Habit>>) {
        // Uses the observe function to display the LiveData.
        // Gives asynchronous data updates, so it's possible to handle the data from the database data
        liveHabits.observe(this) { habits ->
            val habitList: List<Habit> = habits ?: emptyList()
            adapter.updateList(habitList)
        }
    }
}