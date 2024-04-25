package com.example.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.extras?.getString("username")

        if(!username.isNullOrEmpty()){
            binding.textOla.setText("Olá $username")
        }

        binding.buttonFechar.setOnClickListener {
            finishAffinity()
        }
    }
}