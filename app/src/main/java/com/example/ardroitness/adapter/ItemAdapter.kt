package com.example.ardroitness.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ardroitness.R
import com.example.ardroitness.model.Artist


class ItemAdapter(
    private val context: Context,
    private val dataset: List<Artist>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val artName: TextView = view.findViewById(R.id.art_name)
        val artYear: TextView = view.findViewById(R.id.art_year)
        val artImage: ImageView = view.findViewById(R.id.art_image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.vertical_list, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.artName.text = context.resources.getString(item.stringResourceId)
        holder.artYear.text = context.resources.getString(item.stringYearId)
        holder.artImage.setImageResource(item.imageResourceId)
    }

    override fun getItemCount() = dataset.size

}