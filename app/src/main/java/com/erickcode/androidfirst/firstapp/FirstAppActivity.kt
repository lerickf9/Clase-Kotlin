package com.erickcode.androidfirst.firstapp

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.erickcode.androidfirst.R
import com.erickcode.androidfirst.R.layout.activity_first_app

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(activity_first_app)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val etName = findViewById<AppCompatEditText>(R.id.etName)
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)


        btnStart.setOnClickListener{
            val name = etName.text.toString()
            if(name.isEmpty()){
                Log.i("Erick", "Botón pulsado ${name}")
            }

        }

    }
}