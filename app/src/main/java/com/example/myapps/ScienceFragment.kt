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
        data.add(BukuModel(R.drawable.book1,"Emi Beach Adventure","A children's storybook about a young girl named Emi who goes on a vacation to a beautiful island with her family"))
        data.add(BukuModel(R.drawable.book2,"Ade's Adventure","When Ade moves to London from Nigeria, he knows things will be different"))
        data.add(BukuModel(R.drawable.book4,"Mermaid To Rescue","While the Mermaid is very much trapped in her world"))
        data.add(BukuModel(R.drawable.compass,"The Compass of Pleasure","A leading brain scientist's look at the neurobiology of pleasure-and how pleasures can become addictions"))
        data.add(BukuModel(R.drawable.cosmos,"Carl Sagan Cosmos","Cosmos is a popular science book written by astronomer and Pulitzer Prize-winning author Carl Sagan"))
        data.add(BukuModel(R.drawable.national,"Bill Bryson","A Short History of Nearly Everything"))
        data.add(BukuModel(R.drawable.theselfishgene,"The Selfish Gene","As influential today as when it was first published, The Selfish Gene has become a classic exposition of evolutionary thought"))

        // Set adapter for RecyclerView
        val adapter = AdapterHome(data)
        rvBuku.adapter = adapter

        return rootView
    }
}
