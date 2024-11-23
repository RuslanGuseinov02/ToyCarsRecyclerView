package com.ruslanhuseynov.toycarsrecyclerview

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.ruslanhuseynov.toycarsrecyclerview.databinding.RecyclerRowBinding

class ToyCarsAdapter(private val mContext : Context,private val carList : List<Cars>) : RecyclerView.Adapter<ToyCarsAdapter.ToyCarsHolder>(){

    class ToyCarsHolder(var binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToyCarsHolder {

        val design = RecyclerRowBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return ToyCarsHolder(design)
    }

    override fun getItemCount(): Int {
        return carList.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ToyCarsHolder, position: Int) {

        val car = carList[position]

        holder.binding.imageViewRV.setImageResource(car.photo)
        holder.binding.textViewPrice.text = "${car.price}$"
        holder.binding.textViewCarName.text = car.name
        holder.binding.buttonBasket.setOnClickListener {

            Toast.makeText(mContext,"Added to basket",Toast.LENGTH_SHORT).show()
        }
    }

}