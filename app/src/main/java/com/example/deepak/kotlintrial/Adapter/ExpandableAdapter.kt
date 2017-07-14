package com.example.deepak.kotlintrial.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.TextView
import com.example.deepak.kotlintrial.R

/**
 * Created by webonise on 13/7/17.
 */
class ExpandableAdapter(val ctx: Context, val dataChild: Triple<String, String, String>, val dataHeader: List<String>) : BaseExpandableListAdapter() {

    override fun getGroup(groupPosition: Int): Any {
        return dataHeader.get(groupPosition)
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(groupPosition: Int, isExpanded: Boolean, convertView: View?, parent: ViewGroup?): View {
        var headerTitle = getGroup(groupPosition).toString()
        var view = convertView
        when (view) {
            null -> {
                val layoutInflator = ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
                view = layoutInflator.inflate(R.layout.list_group, null)
            }
        }
        val lblListHeader = view?.findViewById(R.id.lblListHeader) as TextView
//        lblListHeader.typeface = Typeface.DEFAULT_BOLD
        lblListHeader.text = headerTitle
        return view
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return 1
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        return when (groupPosition) {
            0 -> dataChild.first
            1 -> dataChild.second
            2 -> dataChild.third
            else -> return ""
        }
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildView(groupPosition: Int, childPosition: Int, isLastChild: Boolean, convertView: View?, parent: ViewGroup?): View {
        var childText = getChild(groupPosition, childPosition).toString()
        var view = convertView
        when (view) {
            null -> {
                val layoutInflator = ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
                view = layoutInflator.inflate(R.layout.list_item, null)
            }
        }
        val txtListChild = view?.findViewById(R.id.lblListItem) as TextView
        txtListChild.text = childText
        return view
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun getGroupCount(): Int {
        return dataHeader.size
    }

}