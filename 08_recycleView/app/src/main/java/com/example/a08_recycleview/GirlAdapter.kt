package com.example.a08_recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a07_listview.Girl

class GirlAdapter(val girls: List<Girl>): RecyclerView.Adapter<GirlAdapter.ViewHolder>() {

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val girlImage: ImageView = view.findViewById(R.id.girlAvatar)
        val girlName: TextView = view.findViewById(R.id.nameText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.girl_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val girl = girls[position]
        holder.girlImage.setImageResource(girl.avatar)
        holder.girlName.text = girl.name
    }

    override fun getItemCount() = girls.size

}