package com.example.sonntagsfreitagsproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.CircleCropTransformation
import com.example.sonntagsfreitagsproject.network.Character

class MainAdapter (val charatersList: List<Character>):RecyclerView.Adapter<MainAdapter.MainViewHolder> (){


    inner class MainViewHolder(private val itemView: View):RecyclerView.ViewHolder(itemView){
        fun bindData(character: Character){
            val name = itemView.findViewById<TextView>(R.id.nameTV)
            val image = itemView.findViewById<ImageView>(R.id.imageViewIV)

            name.text = character.name
            image.load(character.image){
                transformations(CircleCropTransformation())
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.rv_item,parent,false))
    }

    override fun getItemCount(): Int {
        return charatersList.size
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bindData((charatersList[position]))
    }
}
