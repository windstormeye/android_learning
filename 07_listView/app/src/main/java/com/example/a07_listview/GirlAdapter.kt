package com.example.a07_listview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GirlAdapter(activity: Activity, val avatarId: Int, data: List<Girl>): ArrayAdapter<Girl>(activity, avatarId, data) {

    inner class ViewHolder(val girlImage: ImageView, val girlName: TextView)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View
        val viewHolder: ViewHolder
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(avatarId, parent, false)
            val avatarImage: ImageView = view.findViewById(R.id.girlAvatar)
            val girlText: TextView = view.findViewById(R.id.nameText)
            viewHolder = ViewHolder(avatarImage, girlText)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        val girl = getItem(position)

        if (girl != null) {
            viewHolder.girlImage.setImageResource(girl.avatar)
            viewHolder.girlName.text = girl.name
        }
        return view
    }
}