package com.example.myapps


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnBook = findViewById<Button>(R.id.btnBookKid)

        btnBook.setOnClickListener {
            val btn = Intent(this,BookKidActivity::class.java)
            startActivity(btn)
        }
    }
}