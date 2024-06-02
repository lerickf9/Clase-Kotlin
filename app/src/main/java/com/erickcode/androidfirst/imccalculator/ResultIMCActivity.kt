package com.erickcode.androidfirst.imccalculator

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.erickcode.androidfirst.R
import com.erickcode.androidfirst.imccalculator.ImcCalculatorActivity.Companion.IMC_KEY

class ResultIMCActivity : AppCompatActivity() {

    private lateinit var tvResult: TextView
    private lateinit var tvIMC: TextView
    private lateinit var tvDescripcion: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result_imcactivity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val result = intent.extras?.getDouble(IMC_KEY) ?: -1.0
        initComponents()
        initUI(result)
    }

    private fun initUI(result:Double) { // Bajo peso
        when(result){
            in 0.00..18.50 ->{ // Bajo peso
                tvIMC
                tvResult
                tvDescripcion
            }
            in 18.51..24.99 ->{ // Normal
                tvIMC
                tvResult
                tvDescripcion
            }
            in 25.00..29.99 ->{ // Sobrepeso
                tvIMC
                tvResult
                tvDescripcion
            }
            in 30.00..99.00 ->{ // Obesidad

            }
            else -> {
                tvIMC.text = ("Error")
                tvResult.text = ("Error")
                tvDescripcion.text = ("Error")
            }
        }
    }

    private fun initComponents() {
        tvIMC = findViewById(R.id.tvIMC)
        tvResult = findViewById(R.id.tvResult)
        tvDescripcion = findViewById(R.id.tvDescripcion)
    }
}