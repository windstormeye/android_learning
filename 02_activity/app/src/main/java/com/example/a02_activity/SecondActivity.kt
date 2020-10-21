package com.example.a02_activity

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    companion object {
        fun actionStart(context: Context, data1: String, data2: String) {
//            val intent = Intent(context, SecondActivity::class.java)
//            intent.putExtra("param1", data1)
//            intent.putExtra("param2", data1)
            val intent = Intent(context, SecondActivity::class.java).apply {
                putExtra("param1", data1)
                putExtra("param2", data2)
            }
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

//        val extraData = intent.getStringExtra("extra_data")
//        Log.d("SecondActivity", "extra data is $extraData")

        button2.setOnClickListener {
            returnBackData()
        }
    }

    private fun returnBackData() {
        val intent = Intent()
        intent.putExtra("data_return", "data from second activity")
        setResult(Activity.RESULT_OK, intent)
        setResult(Activity.RESULT_CANCELED, intent)
        finish()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        returnBackData()
    }
}