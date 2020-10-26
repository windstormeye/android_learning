package com.example.a08_recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.a07_listview.Girl

class GirlAdapter(val girls: List<Girl>): RecyclerView.Adapter<GirlAdapter.ViewHolder>() {

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val girlImage: ImageView = view.findViewById(R.id.girlAvatar)
        val girlName: TextView = view.findViewById(R.id.nameText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.girl_item, parent, false)
        val viewHolder = ViewHolder(view)
        viewHolder.itemView.setOnClickListener {
            val position = viewHolder.adapterPosition
            val girl = girls[position]
            Toast.makeText(parent.context, "itemViewClick ${girl.name}", Toast.LENGTH_SHORT).show()
        }
        viewHolder.girlImage.setOnClickListener {
            val position = viewHolder.adapterPosition
            val girl = girls[position]
            Toast.makeText(parent.context, "girlAvatarClick ${girl.name}", Toast.LENGTH_SHORT).show()
        }

        return viewHolder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val girl = girls[position]
        holder.girlImage.setImageResource(girl.avatar)
        holder.girlName.text = girl.name
    }

    override fun getItemCount() = girls.size

}