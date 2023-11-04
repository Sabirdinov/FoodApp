package com.example.taom.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.taom.R
import com.example.taom.models.MyFood

class MyAdapter(context: Context, val list: List<MyFood>): ArrayAdapter<MyFood> (context, R.layout.item_rv,list){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView:View
        if (convertView==null){
            itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_rv,parent,false)
        }else{
            itemView=convertView

        }
        itemView.findViewById<TextView>(R.id.txt_name).text = list[position].name
        return itemView
    }
}
