package com.example.deepak.kotlintrial.View

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import com.example.deepak.kotlintrial.Adapter.Adapter
import com.example.deepak.kotlintrial.Presenter.MainPresenter
import com.example.deepak.kotlintrial.R
import java.io.Serializable

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {
    val mainPresenter = MainPresenter()
    val SERIALIZABLE_KEY="data"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById(R.id.listView) as ListView

        listView.onItemClickListener = this
        listView.adapter = Adapter(this, mainPresenter.question)
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val intent = Intent(this, ExpandableActivity::class.java)
        intent.putExtra(SERIALIZABLE_KEY, mainPresenter.samples.get(position) as Serializable)
        startActivity(intent)
    }
}
