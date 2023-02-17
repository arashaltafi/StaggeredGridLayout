package com.arash.altafi.staggeredgridlayout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class Adapter(private val list: List<Int>): RecyclerView.Adapter<Adapter.MyView>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView {
        return MyView(LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false))
    }

    override fun onBindViewHolder(holder: MyView, position: Int) {
        holder.imageView.setImageResource(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class MyView(itemView: View):RecyclerView.ViewHolder(itemView){
        val imageView : ShapeableImageView = itemView.findViewById(R.id.image)
    }

}