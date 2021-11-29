package com.example.makelistexm

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LyeViewHolder : RecyclerView.ViewHolder(View.inflate(R.layout.item_main)) {
    val lyeText: TextView = itemView.findViewById(R.id.list_text_view)

    val lyeImage: ImageView = itemView.findViewById(R.id.list_image_view)
}