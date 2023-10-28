package com.example.myapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)


        val rvPerpus: RecyclerView = findViewById(R.id.rvPerpus)

        //set layout manager di recylerView
        rvPerpus.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<PerpusModel>()
        data.add(PerpusModel(R.drawable.perpus1,"Kunjungan Mahasiswa Amikom ","Kunjungan dari mahasiswa Universitas Amikom Yogyakarta pada tanggal 17 Agustus 2023"))
        data.add(PerpusModel(R.drawable.perpus2,"Kunjungan Mahasiswa Amikom ","Kunjungan dari mahasiswa Universitas Amikom Yogyakarta pada tanggal 17 Agustus 2023"))
        data.add(PerpusModel(R.drawable.perpus3,"Kunjungan Mahasiswa Amikom ","Kunjungan dari mahasiswa Universitas Amikom Yogyakarta pada tanggal 17 Agustus 2023"))
        data.add(PerpusModel(R.drawable.perpus4,"Kunjungan Mahasiswa Amikom ","Kunjungan dari mahasiswa Universitas Amikom Yogyakarta pada tanggal 17 Agustus 2023"))
        data.add(PerpusModel(R.drawable.perpus5,"Kunjungan Mahasiswa Amikom ","Kunjungan dari mahasiswa Universitas Amikom Yogyakarta pada tanggal 17 Agustus 2023"))
        data.add(PerpusModel(R.drawable.perpus6,"Kunjungan Mahasiswa Amikom ","Kunjungan dari mahasiswa Universitas Amikom Yogyakarta pada tanggal 17 Agustus 2023"))


        //set adapter
        val adapter = AdapterPerpus(data)
        rvPerpus.adapter = adapter


    }
}