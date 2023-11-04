package com.example.taom

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.taom.databinding.ActivityAddBinding
import com.example.taom.models.MyFood
import com.example.taom.utils.MyData
import com.example.taom.utils.MySharedPreference
import com.example.taom.utils.MySharedPreference.list
import java.util.ArrayList

class AddActivity : AppCompatActivity() {
    lateinit var binding : ActivityAddBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Taom qoshish"

        MySharedPreference.init(this)

        binding.btnSave.setOnClickListener {
            val name = binding.txtName.text.toString().trim()
            val mahsulot = binding.txtMahsulotlar.text.toString().trim()
            val Taom = binding.btnSave.text.toString().trim()
            val tayyorlash = binding.txtTayorlash.text.toString().trim()


            if (name!=""&& mahsulot!=""&& Taom!="") {
                val list = MySharedPreference.list
                   list.add(MyFood(name, mahsulot, tayyorlash))
                MySharedPreference.list = list
                Toast.makeText(this,"Save",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Malumot yertarli emas", Toast.LENGTH_SHORT).show()
            }
            finish()

        }


    }
}

