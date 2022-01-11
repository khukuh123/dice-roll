package com.example.diceroll

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diceroll.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)

        setContentView(binding.root)

//        binding.contact.setOnClickListener {
//            val url = "https://sdcard/image.png"
//            val webpage = Uri.parse(url)
//            val intent = Intent(Intent.ACTION_VIEW, webpage)
//            startActivity(intent)
//        }
    }
}