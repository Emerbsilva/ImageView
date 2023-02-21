package com.ebsindustrial.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ebsindustrial.imageview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        var valor = 0

        binding.imageView.setOnClickListener {
            if (valor == 0) {
                binding.imageView.setImageResource(R.drawable.android_logo)
                valor = 1
            }
            else {
                binding.imageView.setImageResource(R.drawable.logoebd)
                valor = 0
            }
        }
    }
}