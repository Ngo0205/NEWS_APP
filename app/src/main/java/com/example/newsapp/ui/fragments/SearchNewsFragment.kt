package com.example.newsapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.newsapp.R
import com.example.newsapp.ui.NewActivity
import com.example.newsapp.ui.NewsViewModel

class SearchNewsFragment: Fragment(R.layout.fragment_search_news) {

    lateinit var viewModel : NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewActivity).viewModel
    }
}