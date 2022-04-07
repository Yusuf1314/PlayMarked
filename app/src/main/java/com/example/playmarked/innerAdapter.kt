package com.example.playmarked

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.playmarked.databinding.ItemInnerBinding

class innerAdapter( var list: ArrayList<Project>) :RecyclerView.Adapter<innerAdapter.InnerViewHolder>(){
    inner  class InnerViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        fun onBind(project: Project){
            val bind = ItemInnerBinding.bind(itemView)
            Glide.with(itemView.context)
                .load(project.imqUrl)
                .error(R.drawable.ic_launcher_foreground)
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(bind.iv)
            bind.tvName.text =project.programName

        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InnerViewHolder {
        return InnerViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_inner,parent,false))
    }

    override fun onBindViewHolder(holder: InnerViewHolder, position: Int) {
     holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size

    }
}