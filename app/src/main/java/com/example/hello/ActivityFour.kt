package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActivityFour : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_four)
        val btnPrevActivity3 = findViewById<ImageView>(R.id.btnPrevActivity3)
        val btnNext4 = findViewById<ImageView>(R.id.btnNext4)

        btnPrevActivity3.setOnClickListener {
            val intent = Intent(this,ThirdBirdActivity::class.java)
            startActivity(intent)
            finish()
        }
        btnNext4.setOnClickListener {
            val intent = Intent(this, FirthBirdActivity::class.java)
            startActivity(intent)

        }

    }
}