package com.example.recyclervieww

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



     //  var movie: Movie=Movie("Iron Man ", 9)
        val movielist = arrayListOf<Movie>(
        Movie("Iron Man2",6),
        Movie("Toy Story 4", 9),
        Movie("Inside Out",7),
        Movie("Frozen",7),
        Movie("Lilo and Stitch",6),
        Movie("My Neighbor Totoro",9),
        Movie("Shaun the Sheep Movie",9),
        Movie("Beauty and the Beast",8),
            Movie("Modern Times",5),
            Movie("Moana",8),
            Movie("Shrek",5),
            Movie("Harry Potter and the Sorcerer's Stone",9),
        Movie("Despicable Me",7),
        Movie(" The Lego Movie",9)

        )
        val recyclerAdapter= RecyclerAdapter(movielist)
        recyclerView.adapter= recyclerAdapter


    }
}