package com.example.deepak.kotlintrial.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.deepak.kotlintrial.R
import com.example.deepak.kotlintrial.View.ExpandableActivity

/**
 * Created on 12/7/17.
 */

class Adapter(val ctx: Context, val question: MutableList<String>) : BaseAdapter() {

    override fun getItem(position: Int): Any {
        return question.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return question.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var row: View
        var textLabel: TextView
        when (convertView) {
            null -> {
                val layoutInflator: LayoutInflater = LayoutInflater.from(ctx)
                row = layoutInflator.inflate(R.layout.list_row, parent, false)
            }
            else -> row = convertView
        }
        textLabel = row.findViewById(R.id.label) as TextView
        textLabel.text = question.get(position)
        return row
    }

}