package com.jayakarta.uashasan.Network.Movies

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jayakarta.uashasan.R

internal class MovieAdapter(private var movieList:  List<Movies>) :
    RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {
    internal inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var judul: TextView = view.findViewById(R.id.judul)
        var rating: TextView = view.findViewById(R.id.rating)
        var deskripsi: TextView = view.findViewById(R.id.deskripsi)
        var foto : ImageView= view.findViewById(R.id.foto)
    }
    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return MyViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val movie = movieList[position]
        holder.judul.text = movie.judul
        holder.deskripsi.text = movie.deskripsi
        holder.rating.text = movie.rating
        Glide
            .with(holder.foto.context)
            .load(movie.foto)
            .centerCrop()
            .into(holder.foto);
    }
    override fun getItemCount(): Int {
        return movieList.size
    }
}