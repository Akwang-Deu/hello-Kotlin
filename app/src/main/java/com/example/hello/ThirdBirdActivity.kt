package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ThirdBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnPrev2.setOnClickListener {
            finish()
        }
        binding.btnNext3.setOnClickListener {
            val intent = Intent(this, ActivityFour::class.java)
            startActivity(intent)

        }
        Picasso
            .get()
            .load("https://media.istockphoto.com/id/1144653112/photo/baltimore-oriole-icterus-galbula-two-male-birds-fighting.jpg?s=1024x1024&w=is&k=20&c=-a4yykp0fsyiqfQyBHkyXvjxJXTzXk06cdZAYJDZFrM=")
            .fit()
            .into(binding.imageView2)
    }
}