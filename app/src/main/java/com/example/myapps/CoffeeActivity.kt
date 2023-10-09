package com.example.myapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.myapps.databinding.ActivityCoffeeBinding

class CoffeeActivity : AppCompatActivity() {
    lateinit var binding: ActivityCoffeeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoffeeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgAll.setOnClickListener {
            replaceFragment(AllCoffeeFragment())
        }
    }
    private fun replaceFragment(frg: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.linearLayout2,frg)
        fragmentTrx.commit()
    }
}