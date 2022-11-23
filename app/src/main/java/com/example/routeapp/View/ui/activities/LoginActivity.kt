package com.example.routeapp.View.ui.activities

import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.routeapp.R
import com.example.routeapp.databinding.ActivityMainBinding

class LoginActivity:AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //binding= ActivityMainBinding.inflate(layoutInflater)
        //setContentView(binding.root)
    }
 }
