package com.jhon.churivanti.poketinder.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.activity.viewModels
import com.jhon.churivanti.poketinder.databinding.ActivitySplashBinding
import com.jhon.churivanti.poketinder.ui.viewmodel.SplashViewModel

class SplashActivity : BaseActivity<ActivitySplashBinding>(ActivitySplashBinding::inflate) {

    private val splashViewModel: SplashViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        splashViewModel.getIsUnderMaintenace().observe(this) { isUnderMaintenance ->
            if (isUnderMaintenance) {
                Toast.makeText(this, "Bajo mantenimiento", Toast.LENGTH_SHORT).show()
            } else {
                showAnimation()
            }
        }
    }

    private fun showAnimation() {
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }, 3000)
    }
}

