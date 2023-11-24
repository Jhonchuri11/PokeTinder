package com.jhon.churivanti.poketinder.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jhon.churivanti.poketinder.data.FirebaseRemoteConfigRepository

class SplashViewModel: ViewModel() {

    private var firebaseRemoteConfigRepository = FirebaseRemoteConfigRepository()

    init {
        firebaseRemoteConfigRepository.int()
    }

    fun getIsUnderMaintenace(): MutableLiveData<Boolean> {
        return firebaseRemoteConfigRepository.isUnderMaintenanceLiveData
    }
}

