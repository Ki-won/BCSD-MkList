package com.example.makelistexm

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

open class LyeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var lyeText: TextView = itemView.findViewById(R.id.list_text_view)
    val lyeImage: ImageView = itemView.findViewById(R.id.list_image_view)

}