package com.jhon.churivanti.poketinder.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jhon.churivanti.poketinder.data.database.dao.PokemonDao
import com.jhon.churivanti.poketinder.data.database.entities.MyPokemonEntity

@Database(entities = [MyPokemonEntity::class], version = 1)
abstract class PokemonDatabase: RoomDatabase() {

    abstract fun getPokemonDao(): PokemonDao
}
