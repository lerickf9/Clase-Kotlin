package com.erickcode.androidfirst.todoapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.erickcode.androidfirst.R
import com.erickcode.androidfirst.todoapp.TaskCategory.*

class ToDoActivity : AppCompatActivity() {

    private val categories = listOf(
        Business,
        Personal,
        Other
    )

    private val tasks = mutableListOf(
            Task("Prueba Business", Business),
            Task("Prueba Business", Personal),
            Task("Prueba Business", Other)
    )

    private lateinit var rvCategories: RecyclerView
    private lateinit var categoriesAdapter : CategoriesAdapter

    private lateinit var rvTask: RecyclerView
    private lateinit var taskAdapter: TasksAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_to_do)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initComponents()
        initUI()
    }

    private fun initComponents() {
        rvCategories = findViewById(R.id.rvCategories)
        rvTask = findViewById(R.id.rvTasks)
    }
    private fun initUI() {
        categoriesAdapter = CategoriesAdapter(categories)
        rvCategories.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategories.adapter = categoriesAdapter

        taskAdapter = TasksAdapter(tasks)
        rvTask.layoutManager = LinearLayoutManager(this)
        rvTask.adapter = taskAdapter
    }
}