package com.example.nonton_movie9.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.example.nonton_movie9.Data
import com.example.nonton_movie9.R

class TvShowAdapter (private val tvshowList: ArrayList<Data>) :
    RecyclerView.Adapter<TvShowAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = tvshowList[position]
        holder.itemName.text = currentItem.name
        holder.itemDetail.text = currentItem.detail
        holder.itemPoster.setImageResource(currentItem.poster)
    }

    override fun getItemCount(): Int {
        return tvshowList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemName: TextView = itemView.findViewById(R.id.tv_title)
        val itemDetail: TextView = itemView.findViewById(R.id.tv_desc)
        val itemPoster: ShapeableImageView = itemView.findViewById(R.id.poster)
    }




    }