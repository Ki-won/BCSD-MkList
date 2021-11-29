package com.example.listview_study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter

        class ViewActivity : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                val list = (1..100).toList()

        val listView = findViewById<View>(R.id.View_main)
        val adapter = ArrayAdapter<Int> {
            this,
            android.R.layout.simple_list_item_1
            list
        }

    }
}