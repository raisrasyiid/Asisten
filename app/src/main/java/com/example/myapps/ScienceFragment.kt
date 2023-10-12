package com.example.myapps

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ScienceFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_science, container, false)

        // Find the RecyclerView from the inflated layout
        val rvBuku: RecyclerView = rootView.findViewById(R.id.recylerViewScience)

        // Set layout manager for RecyclerView
        rvBuku.layoutManager = LinearLayoutManager(activity)

        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.book1,"Emi Beach Adventure","Lorem Ipsum dolor sit amet lorem"))
        data.add(BukuModel(R.drawable.book2,"Ade's Adventure","Lorem Ipsum dolor sit amet lorem"))
        data.add(BukuModel(R.drawable.book4,"Mermaid To Rescue","Lorem Ipsum dolor sit amet lorem"))

        // Set adapter for RecyclerView
        val adapter = AdapterHome(data)
        rvBuku.adapter = adapter

        return rootView
    }
}
