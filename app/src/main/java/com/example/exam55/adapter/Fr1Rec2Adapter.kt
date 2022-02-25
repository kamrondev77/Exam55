package com.example.exam55.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exam55.R
import com.example.exam55.model.Restaurants

class Fr1Rec2Adapter(var context: Context, var items: ArrayList<Restaurants>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_fr1_rec2, parent, false)
        return RestaurantsViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var res = items[position]

        if (holder is RestaurantsViewHolder) {
            var iv_image = holder.image
            var tv_name = holder.name

            iv_image.setImageResource(res.image)
            tv_name.text = res.name
        }

    }

    class RestaurantsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var image: ImageView
        var name: TextView

        init {
            image = view.findViewById(R.id.im_restaurants)
            name = view.findViewById(R.id.tv_name)
        }
    }
}