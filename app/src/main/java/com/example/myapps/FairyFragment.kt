package com.example.myapps

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FairyFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_fairy, container, false)

        // Find the RecyclerView from the inflated layout
        val fairy: RecyclerView = rootView.findViewById(R.id.recyclerViewFairy)

        // Set layout manager for RecyclerView
        fairy.layoutManager = LinearLayoutManager(activity)

        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.frozen,"Frozen II","Elsa the Snow Queen has an extraordinary gift , the power to create ice and snow"))
        data.add(BukuModel(R.drawable.thelittle,"The Little Prince","The narrator begins with a discussion on the nature of grownups and their inability"))
        data.add(BukuModel(R.drawable.thelost,"The Lost","Fearless Girls That Time Forgot"))
        data.add(BukuModel(R.drawable.cinde,"Cinderella","The Classic fairytale story of Cinderella-a young girl, mistreated by her step-mother and step-sisters"))
        data.add(BukuModel(R.drawable.grimfairy,"Grimm's Fairy Tales","A Favorit Collection of Grimm's Fairy Tales"))
        data.add(BukuModel(R.drawable.kingfairy,"Fairy Tale","One of the great storytellers of our time ' Guardian"))
        data.add(BukuModel(R.drawable.youare,"You are Your Own Fairy Tale","Goodreads Choice Award-winning poet and bestselling author amanda lovelace presents the you are your own fairy tale series bound collection"))

        // Set adapter for RecyclerView
        val adapter = AdapterHome(data)
        fairy.adapter = adapter

        return rootView
    }


}