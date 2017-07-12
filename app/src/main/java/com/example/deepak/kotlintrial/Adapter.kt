package com.example.deepak.kotlintrial

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

/**
 * Created on 12/7/17.
 */

class Adapter(ctx: Context) : BaseAdapter() {
    val item = arrayOf("Vegetable", "Fruit", "Juice")
    val layoutInflator:LayoutInflater

    init{
        layoutInflator= LayoutInflater.from(ctx)
    }

    override fun getItem(position: Int): Any {
        return item[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return item.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
      var row : View
        var textLabel: TextView
        when(convertView){
            null -> {
                row= layoutInflator.inflate(R.layout.list_row,parent,false)
            }
            else -> row= convertView
        }
        textLabel=row.findViewById(R.id.label) as TextView
        textLabel.text=item[position]
        return row
    }

}