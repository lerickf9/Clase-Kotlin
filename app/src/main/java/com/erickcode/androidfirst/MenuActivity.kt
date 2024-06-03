package com.erickcode.androidfirst

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.erickcode.androidfirst.firstapp.FirstAppActivity
import com.erickcode.androidfirst.imccalculator.ImcCalculatorActivity
import com.erickcode.androidfirst.todoapp.ToDoActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnSaludarApp = findViewById<Button>(R.id.btnSaludarApp)
        val btnImcApp = findViewById<Button>(R.id.btnIMCApp)
        val btnToDo= findViewById<Button>(R.id.btnToDo)

        btnToDo.setOnClickListener { navigateToToDoApp() }

        btnImcApp.setOnClickListener{ navigateToImcApp() }

        btnSaludarApp.setOnClickListener{ navigateToSaludarApp() }


    }

    private fun navigateToToDoApp() {
        val intent = Intent(this, ToDoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludarApp(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}