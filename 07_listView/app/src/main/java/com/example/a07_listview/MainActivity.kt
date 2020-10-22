package com.example.a07_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val girlList = ArrayList<Girl>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initGirls()
//        val  adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datas)
        val adapter = GirlAdapter(this, R.layout.girl_item, girlList)
        listView.adapter = adapter
    }

    private fun initGirls() {
        repeat(2) {
            girlList.add(Girl("1号小姐姐", avatar = R.drawable.girl))
            girlList.add(Girl("2号小姐姐", avatar = R.drawable.girl))
            girlList.add(Girl("3号小姐姐", avatar = R.drawable.girl))
            girlList.add(Girl("4号小姐姐", avatar = R.drawable.girl))
            girlList.add(Girl("5号小姐姐", avatar = R.drawable.girl))
            girlList.add(Girl("6号小姐姐", avatar = R.drawable.girl))
            girlList.add(Girl("7号小姐姐", avatar = R.drawable.girl))
        }
    }
}