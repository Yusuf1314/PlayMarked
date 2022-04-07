package com.example.playmarked.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.playmarked.Program
import com.example.playmarked.R
import com.example.playmarked.databinding.ItemOuterBinding
import com.example.playmarked.innerAdapter

class OuterAdapter(var list :ArrayList<Program>) :RecyclerView.Adapter<OuterAdapter.OuterViewHolder>() {
     inner class OuterViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
         fun onBind(program: Program, position: Int){
             val bind = ItemOuterBinding.bind(itemView)
             bind.tvTitle.text = program.title
             bind.innerRv.adapter = innerAdapter(list[position].project)

         }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OuterViewHolder {
    return OuterViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_outer,parent,false))
    }

    override fun onBindViewHolder(holder: OuterViewHolder, position: Int) {
    holder.onBind(list[position],position)
    }

    override fun getItemCount(): Int = list.size
}