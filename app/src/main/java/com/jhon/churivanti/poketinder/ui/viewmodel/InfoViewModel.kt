package com.jhon.churivanti.poketinder.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jhon.churivanti.poketinder.data.FirebaseRemoteConfigRepository

class InfoViewModel: ViewModel()  {

  private val firebaseRemoteConfigRepository = FirebaseRemoteConfigRepository()

  init {
      firebaseRemoteConfigRepository.int()
  }

 fun getUrlPokemon(): MutableLiveData<String> {
  return firebaseRemoteConfigRepository.getUrlPokemonLiveData
 }
}