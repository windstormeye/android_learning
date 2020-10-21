package com.example.a02_activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
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