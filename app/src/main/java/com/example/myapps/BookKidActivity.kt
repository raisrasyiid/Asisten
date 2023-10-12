package com.example.myapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapps.databinding.ActivityBookKidBinding

class BookKidActivity : AppCompatActivity() {
    lateinit var binding: ActivityBookKidBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookKidBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonFairy.setOnClickListener {
            replaceFragment(FairyFragment())
        }
        binding.buttonFable.setOnClickListener {
            replaceFragment(FableFragment())
        }
        binding.buttonScience.setOnClickListener {
            replaceFragment(ScienceFragment())
        }








//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_book_kid)
//
//        val buttonFairy = findViewById<Button>(R.id.buttonFairy)
//        val buttonFable = findViewById<Button>(R.id.buttonFable)
//        val buttonScience = findViewById<Button>(R.id.buttonScience)
//
//        buttonFairy.setOnClickListener {
//            val fairy = Intent(this, FairyFragment::class.java)
//            startActivity(fairy)
//        }
//        buttonFable.setOnClickListener {
//            val fable = Intent(this, FableFragment::class.java)
//            startActivity(fable)
//        }
//        buttonScience.setOnClickListener {
//            val science = Intent(this, ScienceFragment::class.java)
//            startActivity(science)
//        }
    }
    private fun replaceFragment(frg:Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentKidBook,frg)
        fragmentTrx.commit()
    }
}