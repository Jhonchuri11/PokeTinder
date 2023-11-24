package com.jhon.churivanti.poketinder.data.model

import com.google.gson.annotations.SerializedName

data class PokemonListResponse(

    // Con esta llave busca en el json y lo setea

     @SerializedName("count") val count: Int,
     @SerializedName("results") val results: List<PokemonResponse>
)
