package com.jhon.churivanti.poketinder.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jhon.churivanti.poketinder.data.database.entities.MyPokemonEntity
import com.jhon.churivanti.poketinder.databinding.ItemPokemonSavedBinding
import com.jhon.churivanti.poketinder.ui.holder.MyPokemonsHolder

class MyPokemonsAdapter(val list: List<MyPokemonEntity>): RecyclerView.Adapter<MyPokemonsHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyPokemonsHolder {
        val  view = ItemPokemonSavedBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyPokemonsHolder(view.root)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: MyPokemonsHolder, position: Int) {

        val item = list[position]
        holder.bind(item)
    }

}