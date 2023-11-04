package com.example.taom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.taom.Adapter.MyAdapter
import com.example.taom.databinding.ActivityShowBinding
import com.example.taom.databinding.MyListItemBinding
import com.example.taom.models.MyFood
import com.example.taom.utils.MySharedPreference
import java.util.ArrayList

class ShowActivity : AppCompatActivity() {
    lateinit var binding: ActivityShowBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        val position = intent.getIntExtra("position",0)


    }
}
