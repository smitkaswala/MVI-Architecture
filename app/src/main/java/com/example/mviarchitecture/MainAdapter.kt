package com.example.mviarchitecture

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mviarchitecture.unsplash.ResultsItem

class MainAdapter (
    private val users: ArrayList<ResultsItem>
) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(resultsItem: ResultsItem) {

            val name = itemView.findViewById<AppCompatTextView>(R.id.textViewUserName)
            val email = itemView.findViewById<AppCompatTextView>(R.id.textViewUserEmail)
            val image = itemView.findViewById<ImageView>(R.id.imageViewAvatar)

            name.text = resultsItem.id
            email.text = resultsItem.title
            Glide.with(itemView.context)
                .load(resultsItem.coverPhoto?.urls?.thumb)
                .into(image)

            Log.e("TAG", "bind:---- " + resultsItem.previewPhotos)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_layout, parent,
                false
            )
        )

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(users[position])

    fun addData(list: List<ResultsItem>) {
        users.addAll(list)
    }

}