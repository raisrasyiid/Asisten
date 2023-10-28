package com.example.myapps

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterPerpus(private val listPerpus:List<PerpusModel>) :
                    RecyclerView.Adapter<AdapterPerpus.ViewHolder>() {

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView){
        val image: ImageView = itemView.findViewById(R.id.imageViewBook)
        val title: TextView = itemView.findViewById(R.id.textViewTitle)
        val desc: TextView = itemView.findViewById(R.id.textViewDesc)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterPerpus.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.card_layout_perpus,parent,false)
        return AdapterPerpus.ViewHolder(view)
    }


    override fun onBindViewHolder(holder: AdapterPerpus.ViewHolder, position: Int) {
        val modelPerpus = listPerpus[position]

        holder.image.setImageResource(modelPerpus.image)
        holder.title.text = modelPerpus.title
        holder.desc.text = modelPerpus.desc
    }

    override fun getItemCount(): Int {
        return  listPerpus.size
    }
}