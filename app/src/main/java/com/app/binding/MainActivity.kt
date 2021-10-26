package com.app.binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.lifecycle.ViewModelProvider
import com.app.binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    private lateinit var Viewmodel: Viewmodel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Viewmodel = ViewModelProvider(this).get(com.app.binding.Viewmodel::class.java)

        val myuser = Model("aman",1,false)

        binding.user = myuser
        binding.viewmodel = Viewmodel
        binding.lifecycleOwner = this

        binding.edittext.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(char: CharSequence?, p1: Int, p2: Int, p3: Int) {
                Viewmodel.updatename(char.toString())
            }

            override fun afterTextChanged(p0: Editable?) {
            }

        })
    }
}