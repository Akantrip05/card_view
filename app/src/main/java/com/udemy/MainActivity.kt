package com.udemy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Adapter view: Recyclerview
        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        //2- Datasource

        var gameList:ArrayList<GameModel> = ArrayList()
        var v1= GameModel(R.drawable.callofduty,"Call Of duty")
        var v2= GameModel(R.drawable.pubg,"PubG")
        var v3= GameModel(R.drawable.freefire,"Free Fire")
        var v4= GameModel(R.drawable.subway,"Subway suffer")
        var v5= GameModel(R.drawable.pubg,"Temple run 2")
        var v6= GameModel(R.drawable.freefire,"Free Fire")
        var v7= GameModel(R.drawable.subway,"Subway Suffer")

        gameList.add(v1)
        gameList.add(v2)
        gameList.add(v3)
        gameList.add(v4)
        gameList.add(v5)
        gameList.add(v6)
        gameList.add(v7)

        // Adapter

        var adapter = GameAdapter(gameList)
        recyclerView.adapter=adapter

    }
}