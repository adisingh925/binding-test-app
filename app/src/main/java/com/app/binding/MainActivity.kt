package com.app.binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myuser = Model("nikhil",1,false)

        binding.user = myuser
    }
}