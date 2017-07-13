package com.example.deepak.kotlintrial.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.deepak.kotlintrial.R

/**
 * Created on 12/7/17.
 */

class Adapter(ctx: Context, question:MutableList<String>) : BaseAdapter() {
    val question:MutableList<String>
    val layoutInflator: LayoutInflater
    val ctx: Context

    init {
        layoutInflator = LayoutInflater.from(ctx)
        this.question=question
        this.ctx = ctx
    }

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
                row = layoutInflator.inflate(R.layout.list_row, parent, false)
            }
            else -> row = convertView
        }
        textLabel = row.findViewById(R.id.label) as TextView
        textLabel.text = question.get(position)
        return row
    }

}