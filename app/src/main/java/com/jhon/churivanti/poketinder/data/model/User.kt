package com.jhon.churivanti.poketinder.data.model

import java.io.Serializable

data class User(
    var id: String,
    var name: String,
    var email: String,
    var password: String
) : Serializable {
    fun getImage() = "https://graph.facebook.com/$id/picture?type=large&width=720&height=720"
}
