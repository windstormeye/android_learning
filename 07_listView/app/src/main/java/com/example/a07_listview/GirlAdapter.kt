package com.example.a07_listview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class GirlAdapter(activity: Activity, val avatarId: Int, data: List<Girl>): ArrayAdapter<Girl>(activity, avatarId, data) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(context).inflate(avatarId, parent, false)
        val avatarImage: ImageView = view.findViewById(R.id.girlAvatar)
        val girlText: TextView = view.findViewById(R.id.nameText)
        val girl = getItem(position)

        if (girl != null) {
            avatarImage.setImageResource(girl.avatar)
            girlText.text = girl.name
        }
        return view
    }
}