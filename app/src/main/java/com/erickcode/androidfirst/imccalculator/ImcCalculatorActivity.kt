package com.erickcode.androidfirst.imccalculator

import android.icu.text.DecimalFormat
import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.erickcode.androidfirst.R
import com.google.android.material.slider.RangeSlider

class ImcCalculatorActivity : AppCompatActivity() {

    private var isMaleSeleted:Boolean= true
    private var isFemaleSeleted:Boolean= false


    private lateinit var viewMale:CardView
    private lateinit var viewFemale:CardView
    private lateinit var tvHeight:TextView
    private lateinit var rsHeight: RangeSlider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_imc_calculator)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initComponents()
        initListeners()
        initUI()
    }



    private fun initComponents(){
        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFemale)
        tvHeight = findViewById(R.id.tvHeight)
        rsHeight = findViewById(R.id.rsHeight)

    }
    @RequiresApi(Build.VERSION_CODES.N)
    private fun initListeners() {
        viewMale.setOnClickListener{
            changeGender()
            setGenderColor()
        }
        viewFemale.setOnClickListener{
            changeGender()
            setGenderColor()
        }
        rsHeight.addOnChangeListener{ _, value, _ ->
            val df = DecimalFormat("#.##")
            val result = df.format(value)
            tvHeight.text = "$result cm"
        }
    }
    private fun changeGender(){
        isMaleSeleted = !isMaleSeleted
        isFemaleSeleted = !isFemaleSeleted
    }

    private fun setGenderColor(){

        viewMale.setCardBackgroundColor(getBackgroundColor(isMaleSeleted))
        viewFemale.setCardBackgroundColor(getBackgroundColor(isFemaleSeleted))
    }

    private fun getBackgroundColor(isSelectedComponent: Boolean): Int{

        val colorReference = if(isSelectedComponent){
            R.color.background_component_selected
        }else{
            R.color.background_component
        }
        return ContextCompat.getColor(this, colorReference)
    }
    private fun initUI() {
        setGenderColor()

    }
}