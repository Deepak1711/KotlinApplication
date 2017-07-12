package com.example.deepak.kotlintrial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val listView= findViewById(R.id.listView) as ListView
       listView.adapter=Adapter(this)
    }
}
