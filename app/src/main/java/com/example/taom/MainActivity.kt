package com.example.taom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.taom.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnAdd.setOnClickListener {
                startActivity(Intent(this@MainActivity, AddActivity::class.java))
            }
            btnShow.setOnClickListener {
                startActivity(Intent(this@MainActivity, ListFoodApp::class.java))
            }
        }
    }
}