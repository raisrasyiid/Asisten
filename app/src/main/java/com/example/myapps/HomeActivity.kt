package com.example.myapps


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnBook = findViewById<Button>(R.id.btnBookKid)
        val rvBuku:RecyclerView = findViewById(R.id.recylerViewBuku)

        //set layout manager di recylerView
        rvBuku.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.book1,"Emi Beach Adventure","Lorem Ipsum dolor sit amet lorem"))
        data.add(BukuModel(R.drawable.book2,"Ade's Adventure","Lorem Ipsum dolor sit amet lorem"))
        data.add(BukuModel(R.drawable.book4,"Mermaid To Rescue","Lorem Ipsum dolor sit amet lorem"))

        //set adapter
        val adapter = AdapterHome(data)

        rvBuku.adapter = adapter

        btnBook.setOnClickListener {
            val btn = Intent(this,BookKidActivity::class.java)
            startActivity(btn)
        }
    }
}