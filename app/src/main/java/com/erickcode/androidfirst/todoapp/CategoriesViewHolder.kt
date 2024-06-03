package com.erickcode.androidfirst.todoapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.erickcode.androidfirst.R

class CategoriesViewHolder (view: View): RecyclerView.ViewHolder(view){

    private val tvCategoryName:TextView = view.findViewById(R.id.tvCategoryName)
    private val divider:View = view.findViewById(R.id.divider)
        fun render (taskCategory: TaskCategory){
            tvCategoryName.text = "EJEMPLO"
        }

}