package com.example.makelistexm

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class LyeAdapter : RecyclerView.Adapter<LyeViewHolder>() {

    val list = (1..100).toList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LyeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_main, parent, false)
        return LyeViewHolder(view)
    }

    override fun onBindViewHolder(holder: LyeViewHolder, position: Int) {
        holder.lyeText.text = list[position].toString()
    }

    override fun getItemCount(): Int {
        return list.size
    }
}