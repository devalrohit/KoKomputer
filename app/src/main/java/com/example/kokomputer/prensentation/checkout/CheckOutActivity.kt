package com.example.kokomputer.prensentation.checkout

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kokomputer.R
import com.example.kokomputer.databinding.ActivityCheckOutBinding

class CheckOutActivity : AppCompatActivity() {

    private val binding : ActivityCheckOutBinding by lazy {
        ActivityCheckOutBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
       setContentView(binding.root)
    }
}