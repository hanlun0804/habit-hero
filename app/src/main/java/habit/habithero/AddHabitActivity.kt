package habit.habithero

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import habit.habithero.Database.HabitDatabase
import habit.habithero.Models.Habit
import habit.habithero.Models.HabitViewModel
import habit.habithero.databinding.ActivityAddHabitBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

class AddHabitActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddHabitBinding
    private lateinit var llTimesDay: View
    private lateinit var llDays: View
    private lateinit var llDate: View
    private lateinit var selectedFrequencyItem: String
    private lateinit var selectedCategoryItem: String
    private lateinit var habitTitle: String
    private lateinit var database: HabitDatabase
    lateinit var viewModel: HabitViewModel
    private lateinit var habit: Habit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Binds "AddHabitActivity" and "activity_add_habit"
        binding = ActivityAddHabitBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initiates viewmodel
        viewModel = HabitViewModel(application)

        // Declares and initiates an array of checkboxes
        val checkboxes = arrayOf(
            binding.cbMon, binding.cbTue, binding.cbWed, binding.cbThu,
            binding.cbFri, binding.cbSat, binding.cbSun,
        )

        // Initiates UI
        initUI(checkboxes)
    }

    private fun initUI(checkboxes: Array<CheckBox>) {
        // Initiates views that pop up after sFrequency is chosen
        llTimesDay = binding.llTimesDay
        llDays = binding.llDays
        llDate = binding.llDate

        // Adds button that takes user to main screen
        val btnBack = binding.fabBack
        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        initiateSpinners()

        // Adds the add habit-button
        val btnAddHabit = binding.fabAddHabit
        btnAddHabit.setOnClickListener {
            habitTitle = binding.tietEnterHabit.text.toString()

            if (habitTitle.isNotEmpty() &&
                !selectedCategoryItem.equals(null) &&
                !selectedCategoryItem.equals("Select option") &&
                !selectedFrequencyItem.equals(null) &&
                !selectedFrequencyItem.equals("Select option")) {

                val repeatOnDay: MutableList<Int> = mutableListOf()
                var repeatOnDate: Int = 0
                var etnsTimesDay: Int = 1

                if (selectedFrequencyItem.equals("Several days a week")) {
                    for (checkbox in checkboxes) {
                        if (checkbox.isChecked) {
                            val lowercaseDay = checkbox.text.toString().lowercase()
                            val day = when (lowercaseDay) {
                                "sunday" -> Calendar.SUNDAY
                                "monday" -> Calendar.MONDAY
                                "tuesday" -> Calendar.TUESDAY
                                "wednesday" -> Calendar.WEDNESDAY
                                "thursday" -> Calendar.THURSDAY
                                "friday" -> Calendar.FRIDAY
                                "saturday" -> Calendar.SATURDAY
                                else -> throw IllegalArgumentException("Invalid day of the week")
                            }
                            repeatOnDay.add(day)
                        }
                    }
                } else if (selectedFrequencyItem.equals("Once per month")) {
                    val repeatOnDateString = binding.etnsDate.text.toString()
                    if (repeatOnDateString.isNotEmpty()) {
                        repeatOnDate = repeatOnDateString.toInt()
                    } else {
                        Toast.makeText(this@AddHabitActivity, "Please enter date", Toast.LENGTH_SHORT).show()
                        return@setOnClickListener
                    }
                } else if (selectedFrequencyItem.equals("Once per day")) {
                    for (checkbox in checkboxes) {
                        val lowercaseDay = checkbox.text.toString().lowercase()
                        val day = when (lowercaseDay) {
                            "sunday" -> Calendar.SUNDAY
                            "monday" -> Calendar.MONDAY
                            "tuesday" -> Calendar.TUESDAY
                            "wednesday" -> Calendar.WEDNESDAY
                            "thursday" -> Calendar.THURSDAY
                            "friday" -> Calendar.FRIDAY
                            "saturday" -> Calendar.SATURDAY
                            else -> throw IllegalArgumentException("Invalid day of the week")
                        }
                        repeatOnDay.add(day)
                    }
                } else if (selectedFrequencyItem.equals("Several times a day")) {
                    for (checkbox in checkboxes) {
                        val lowercaseDay = checkbox.text.toString().lowercase()
                        val day = when (lowercaseDay) {
                            "sunday" -> Calendar.SUNDAY
                            "monday" -> Calendar.MONDAY
                            "tuesday" -> Calendar.TUESDAY
                            "wednesday" -> Calendar.WEDNESDAY
                            "thursday" -> Calendar.THURSDAY
                            "friday" -> Calendar.FRIDAY
                            "saturday" -> Calendar.SATURDAY
                            else -> throw IllegalArgumentException("Invalid day of the week")
                        }
                        repeatOnDay.add(day)
                    }
                    val etnsTimesDayString = binding.etnsTimesDay.text.toString()
                    if (etnsTimesDayString.isNotEmpty()) {
                        etnsTimesDay = etnsTimesDayString.toInt()
                    } else {
                        Toast.makeText(this@AddHabitActivity, "Please enter frequency", Toast.LENGTH_SHORT).show()
                        return@setOnClickListener
                    }
                } else {
                    return@setOnClickListener
                }

                // Adds an instance of the habit per time a day it should be done (1 by default), so they can be handled seperatly
                for (i in 1..etnsTimesDay) {
                    writeData(null, habitTitle, selectedCategoryItem, repeatOnDate, repeatOnDay, etnsTimesDay)
                }
                // Guides the user back to the main screen
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                // Instructs user to enter data if data is not satisfactory
                Toast.makeText(this@AddHabitActivity, "Please enter required data", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            // Notifies user the data is added
            Toast.makeText(this@AddHabitActivity, "Data was entered to database", Toast.LENGTH_SHORT).show()
        }
    }

    private fun initiateSpinners() {
        // Adds and populates spinners
        val sCategory = binding.sCategory
        val categoryItems = arrayOf(
            "Select option", "Mental health", "Physical health", "Education", "Work", "Cleaning", "Productivity",
            "Relationships", "Financial", "Other"
        )
        val categoryAdapter = ArrayAdapter(this, R.layout.custom_spinner_item, categoryItems)
        categoryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        sCategory.adapter = categoryAdapter

        val sFrequency = binding.sFrequency
        val frequencyItems = arrayOf(
            "Select option", "Several times a day", "Once per day", "Several days a week", "Once per month"
        )
        val frequencyAdapter = ArrayAdapter(this, R.layout.custom_spinner_item, frequencyItems)
        frequencyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        sFrequency.adapter = frequencyAdapter


        // Sets the selectedCategoryItem
        sCategory.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                selectedCategoryItem = parent.getItemAtPosition(position).toString()
            }
            // Added because it is required, but "Select option" is selected by default, which is handeled seperatly
            override fun onNothingSelected(p0: AdapterView<*>?) { }
        }

        // Handle the visibility of views when items in sFrequency is chosen and sets the selectedFrequncyItem
        sFrequency.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                selectedFrequencyItem = parent.getItemAtPosition(position).toString()
                llTimesDay.visibility = View.GONE
                llDays.visibility = View.GONE
                llDate.visibility = View.GONE
                when (selectedFrequencyItem) {
                    "Several times a day" -> llTimesDay.visibility = View.VISIBLE
                    "Several days a week" -> llDays.visibility = View.VISIBLE
                    "Once per month" -> llDate.visibility = View.VISIBLE
                }
            }
            // Added because it is required, but "Select option" is selected by default, which is handeled seperatly
            override fun onNothingSelected(p0: AdapterView<*>?) { }
        }
    }

    private fun writeData(id: Int?, habitTitle: String, selectedCategoryItem: String, repeatOnDate: Int, repeatOnDay: MutableList<Int>, etnsTimesDay: Int) {
        // Initializes database
        database = HabitDatabase.getDataBase(this)
        // Creates habit with input parameters
        habit = Habit(id, habitTitle, selectedCategoryItem, repeatOnDate, repeatOnDay, etnsTimesDay)

        // Starts a corountine so database can be gotten on a background IO thread
        GlobalScope.launch(Dispatchers.IO) {
            // Inserts habit to database using function defined in HabitDao
            database.getHabitDao().insert(habit)
        }

        // Updates database
        updateTodayStatus()
    }

    // Updates which habits should be added on the current date
    private fun updateTodayStatus() {
        // Declares and initializes variables used for dealing with time
        val currTime = Date()
        val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        val formattedDate = dateFormat.format(currTime)
        val parsedDate = dateFormat.parse(formattedDate)
        val calendar = Calendar.getInstance()
        calendar.time = parsedDate
        val month = calendar.get(Calendar.MONTH)
        val date = calendar.get(Calendar.DAY_OF_MONTH)
        val day = calendar.get(Calendar.DAY_OF_WEEK)

        // Starts a corountine
        lifecycleScope.launch {
            lateinit var habits: List<Habit>
            // Data from database is retrieved on background thread
            withContext(Dispatchers.IO) {
                habits = database.getHabitDao().getToday()
            }
            if (!habits.isNullOrEmpty()) {
                for (habit in habits) {
                    var tempDate: Int = date
                    // Checks if it should be repeated on a spesific date (0 by default)
                    if (habit.repeatOnDate == 0) {
                        habit.isToday = habit.repeatOnDay.contains(day)
                    } else {
                        // Sets that it should be displayed on the last day of the month
                        if (month == 2) {
                            if (habit.repeatOnDate > 28) {
                                tempDate = 28
                            }
                        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                            if (habit.repeatOnDate > 30) {
                                tempDate = 30
                            }
                        }
                        habit.isToday = (habit.repeatOnDate == tempDate)
                    }
                    // Updates habit
                    viewModel.updateHabit(habit)
                }
            }
        }
    }
}