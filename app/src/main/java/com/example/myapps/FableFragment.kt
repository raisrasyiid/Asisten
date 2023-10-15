package com.example.myapps

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FableFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_fable, container, false)

        // Find the RecyclerView from the inflated layout
        val fable: RecyclerView = rootView.findViewById(R.id.recylerViewFable)

        // Set layout manager for RecyclerView
        fable.layoutManager = LinearLayoutManager(activity)

        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.theant,"The Ant and The Grasshopper","The Ant and the Grasshopper, alternatively titled The Grasshopper and the Ant"))
        data.add(BukuModel(R.drawable.theboy,"The Boy Who Cried Wolf","The tale concerns a shepherd boy who repeatedly fools villagers"))
        data.add(BukuModel(R.drawable.themac,"Fairy Tales Collection","Books that contain many fairy tales"))
        data.add(BukuModel(R.drawable.stuartfable,"Stuart Little","The book is a realistic yet fantastical story about a mouse-like human boy named Stuart Little"))
        data.add(BukuModel(R.drawable.thefox,"The Fox and The Crow","A story of how the Fox talked the Bird into eating his food"))
        data.add(BukuModel(R.drawable.thelion,"The Lion and The Mouse","A Lion lay asleep in the forest, his great head resting on his paws"))
        data.add(BukuModel(R.drawable.aesopfable,"Aesop's Fables","Aesop's Fables : The Classic Edition"))

        // Set adapter for RecyclerView
        val adapter = AdapterHome(data)
        fable.adapter = adapter

        return rootView
    }
}