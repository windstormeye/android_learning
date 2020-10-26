package com.example.a08_recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a07_listview.Girl
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val girlList = ArrayList<Girl>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initGirls()

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        recycleView.layoutManager = layoutManager
        val adapter = GirlAdapter(girlList)
        recycleView.adapter = adapter
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
            girlList.add(Girl("7号小姐姐", avatar = R.drawable.girl))
            girlList.add(Girl("7号小姐姐", avatar = R.drawable.girl))
            girlList.add(Girl("7号小姐姐", avatar = R.drawable.girl))
            girlList.add(Girl("7号小姐姐", avatar = R.drawable.girl))
            girlList.add(Girl("7号小姐姐", avatar = R.drawable.girl))
            girlList.add(Girl("7号小姐姐", avatar = R.drawable.girl))
            girlList.add(Girl("7号小姐姐", avatar = R.drawable.girl))
            girlList.add(Girl("7号小姐姐", avatar = R.drawable.girl))
            girlList.add(Girl("7号小姐姐", avatar = R.drawable.girl))

        }
    }
}