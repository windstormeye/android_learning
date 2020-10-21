package com.example.a02_activity

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.main_activity_layout.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_layout)

        Log.d("MainActivity", this.toString())

        button1.setOnClickListener {
//            Toast.makeText(this, "点击啦！", Toast.LENGTH_SHORT).show()
//            finish()

//            val intent = Intent(this, SecondActivity::class.java)
//            startActivity(intent)

//            val intent = Intent("com.example.a02_activity.ACTION_START")
//            intent.addCategory("com.example.a02_activity.PJ")
//            startActivity(intent)

//            val intent = Intent(Intent.ACTION_VIEW)
//            intent.data = Uri.parse("https://www.pjhubs.com")
//            startActivity(intent)

//            val intent = Intent(Intent.ACTION_DIAL)
//            intent.data = Uri.parse("tel:10086")
//            startActivity(intent)

//            val data = "PJHubs"
//            val intent = Intent(this, SecondActivity::class.java)
//            intent.putExtra("extra_data", data)
//            startActivity(intent)

//            val intent = Intent(this, SecondActivity::class.java)
//            startActivityForResult(intent, 1)

//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)

            SecondActivity.actionStart(this, "PJHubs", "Hello")

        }

//        val button1: Button = findViewById(R.id.button1)
//        button1.setOnClickListener {
//            Toast.makeText(this, "点击了按钮", Toast.LENGTH_SHORT).show()
//        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            1 -> if (resultCode == Activity.RESULT_OK || resultCode == Activity.RESULT_CANCELED) {
                val returnData = data?.getStringExtra("data_return")
                Log.d("data_return", "return data is $returnData")
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
//            R.id.add_item -> Toast.makeText(this, "点击了添加", Toast.LENGTH_SHORT).show()
            R.id.add_item -> Log.d("menu", "2333")
            R.id.remove_item -> Toast.makeText(this, "点击了移除", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}