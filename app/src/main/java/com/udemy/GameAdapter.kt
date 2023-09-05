package com.udemy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class GameAdapter(var gameList:ArrayList<GameModel>)
    : RecyclerView.Adapter<GameAdapter.MyViewHolder>()
{
   inner class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
       var img:ImageView
       var txt:TextView

       init {
           img = itemView.findViewById(R.id.imgview)
           txt = itemView.findViewById(R.id.txt)

           itemView.setOnClickListener(){
               Toast.makeText(itemView.context,
               "You Choose : ${gameList[adapterPosition].txt}"
               ,Toast.LENGTH_SHORT).show()
           }
       }

   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       var view = LayoutInflater.from(parent.context).inflate(
           R.layout.cardview,
           parent,
           false
       )
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       holder.img.setImageResource(gameList[position].img)
        holder.txt.setText(gameList[position].txt)
    }

    override fun getItemCount(): Int {
       return gameList.size
    }

}