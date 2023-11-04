package com.example.taom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.taom.Adapter.MyAdapter
import com.example.taom.databinding.ActivityListFoodAppBinding
import com.example.taom.utils.MySharedPreference

class ListFoodApp : AppCompatActivity() {
    private val binding by lazy { ActivityListFoodAppBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        MySharedPreference.init(this)
        binding.listFood.adapter = MyAdapter(this, MySharedPreference.list)
    }
}