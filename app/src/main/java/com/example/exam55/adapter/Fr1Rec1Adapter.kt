package com.example.exam55.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exam55.R
import com.example.exam55.model.Categories

class Fr1Rec1Adapter(var context: Context, var items: ArrayList<Categories>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_fr1_rec1, parent, false)
        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val cat = items[position]

        if (holder is CategoryViewHolder) {
            var iv_image = holder.iv_image
            var tv_category = holder.tv_category

            iv_image.setImageResource(cat.image)
            tv_category.text = cat.category
        }

    }

    class CategoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var iv_image: ImageView
        var tv_category: TextView

        init {
            iv_image = view.findViewById(R.id.iv_categories)
            tv_category = view.findViewById(R.id.tv_categories)
        }
    }
}