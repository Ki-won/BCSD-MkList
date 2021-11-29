package com.example.makelistexm

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LyeViewHolder : RecyclerView.ViewHolder() {
    val lyeText: TextView = itemView.findViewById(R.id.list_text_view)

    val lyeImage: ImageView = itemView.findViewById(R.id.list_image_view)
}