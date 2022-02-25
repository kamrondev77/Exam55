package com.example.exam55.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exam55.R
import com.example.exam55.model.Search
import com.google.android.material.imageview.ShapeableImageView

class Fr4Adapter(var context: Context, var items: ArrayList<Search>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_fragment4, parent, false)
        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val cat = items[position]

        if (holder is CategoryViewHolder) {
            var iv_image = holder.iv_image
            var tv_name = holder.tv_name

            iv_image.setImageResource(cat.profile)
            tv_name.text = cat.name
        }

    }

    class CategoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var iv_image: ImageView
        var tv_name: TextView

        init {
            iv_image = view.findViewById(R.id.iv_search)
            tv_name = view.findViewById(R.id.tv_name)
        }
    }
}