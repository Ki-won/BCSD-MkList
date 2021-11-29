package com.example.makelistexm

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class LyeAdapter : RecyclerView.Adapter<LyeViewHolder>() {

    val list = (1..100).toList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LyeViewHolder {
        return LyeViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_main, parent, false)
        )
    }

    override fun onBindViewHolder(holder: LyeViewHolder, position: Int) {
        holder.textView.text = list[position].toString()
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}