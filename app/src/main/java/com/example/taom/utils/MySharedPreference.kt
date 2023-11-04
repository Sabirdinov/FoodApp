package com.example.taom.utils

import android.content.Context
import android.content.SharedPreferences
import android.view.Display.Mode
import com.example.taom.models.MyFood
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object MySharedPreference {
    private const val NAME = "catch_file-name"
    private const val MODE = Context.MODE_PRIVATE

    private lateinit var preferences: SharedPreferences

    fun init (context: Context){
        preferences = context.getSharedPreferences(NAME, MODE)
    }

    private inline fun SharedPreferences.edit(operation:(SharedPreferences.Editor) -> Unit){
        val editor = edit()
        operation(editor)
        editor.apply()
    }

    var list:ArrayList<MyFood>
        get() = gsonStringTolist(preferences.getString("my_list", "[]")!!)
        set(value) {
            if (value!=null)
                preferences.edit{
                    it.putString("my_list", listToGsonString(value))
                }
        }
    private fun gsonStringTolist(gsonString: String) :ArrayList<MyFood>{
        val list = ArrayList<MyFood>()

        val type = object : TypeToken<ArrayList<MyFood>>(){}.type
        list.addAll(Gson().fromJson(gsonString,type))

        return list
    }
    private fun listToGsonString(list:ArrayList<MyFood>):String{
        return Gson().toJson(list)
    }

}