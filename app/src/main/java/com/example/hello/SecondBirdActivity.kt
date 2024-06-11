package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityMainBinding
import com.example.hello.databinding.ActivitySecondBirdBinding
import com.squareup.picasso.Picasso

class SecondBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivitySecondBirdBinding.inflate(layoutInflater)
       setContentView(binding.root)

        binding.btnPrev.setOnClickListener {
            finish()
        }
        binding.btnNext2.setOnClickListener {
            val intent=Intent(this,ThirdBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://media.istockphoto.com/id/1098031070/photo/white-stork-in-naples-florida.jpg?s=2048x2048&w=is&k=20&c=257XcDyjfGfE1TeK5_1N8TTXjk-BilZ6Sfse5Jk44is=")
            .fit().into(binding.imageView5)



    }
}