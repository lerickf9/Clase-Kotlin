package com.erickcode.androidfirst.todoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.erickcode.androidfirst.R

class CategoriesAdapter (private val categories:List<TaskCategory>, private val onItemSelected:(Int) -> Unit ): RecyclerView.Adapter<CategoriesViewHolder>(){

    //onCreateViewHolder crea una nueva vista pasando nueva informacion
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task_category, parent, false)
        return CategoriesViewHolder(view)
    }

    override fun getItemCount(): Int = categories.size


    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        holder.render(categories[position], onItemSelected)
    }

}