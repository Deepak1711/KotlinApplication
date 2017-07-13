package com.example.deepak.kotlintrial.View

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ExpandableListView
import com.example.deepak.kotlintrial.Adapter.ExpandableAdapter
import com.example.deepak.kotlintrial.R
import kotlinx.android.synthetic.main.activity_expandable.*

class ExpandableActivity : AppCompatActivity() {
    val SERIALIZABLE_KEY = "data"
    var sampleChild: Triple<String, String, String> = Triple("", "", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expandable)

        sampleChild = intent.getSerializableExtra(SERIALIZABLE_KEY) as Triple<String, String, String>

        val strArray=resources.getStringArray(R.array.head_list)
        var dataHead= strArray.toList()

        val expandListView = findViewById(R.id.expandableListview) as ExpandableListView
        expandableListview.setAdapter(ExpandableAdapter(this, sampleChild,dataHead))
    }
}
