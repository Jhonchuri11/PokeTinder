package com.jhon.churivanti.poketinder.ui.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import androidx.fragment.app.viewModels
import com.jhon.churivanti.poketinder.databinding.FragmentInfoBinding
import com.jhon.churivanti.poketinder.ui.viewmodel.InfoViewModel

class InfoFragment: BaseFragment<FragmentInfoBinding>(FragmentInfoBinding::inflate) {

    private val viewModel: InfoViewModel by viewModels()
    private lateinit var webView: WebView


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        webView = binding.wvInfoFragment

        webView.settings.javaScriptEnabled = true

        viewModel.getUrlPokemon().observe(viewLifecycleOwner) {
            webView.loadUrl(it)
        }
    }
}