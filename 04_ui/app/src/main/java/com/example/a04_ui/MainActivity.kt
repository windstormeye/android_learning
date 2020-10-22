package com.example.a04_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
//            imageView.setImageResource(R.drawable.img2)

//            if (progressBar.visibility == View.VISIBLE) {
//                progressBar.visibility = View.GONE
//            } else {
//                progressBar.visibility = View.VISIBLE
//            }

//            progressBar.progress += 10

            AlertDialog.Builder(this).apply {
                setTitle("出错了")
                setMessage("系统遇到了点问题")
                setCancelable(false)
                setPositiveButton("我知道了") { _, _ ->

                }
                setNegativeButton("取消") { _, _ ->

                }
                show()
            }
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button1 -> {
                val inputText = editText.text.toString()
                Toast.makeText(this, inputText, Toast.LENGTH_SHORT).show()
            }
        }
    }
}