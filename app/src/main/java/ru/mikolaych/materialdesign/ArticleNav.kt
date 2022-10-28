package ru.mikolaych.materialdesign

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.mikolaych.materialdesign.databinding.ArticleNavBinding



class ArticleNav : Fragment() {
  private lateinit var binding: ArticleNavBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       binding = ArticleNavBinding.inflate(inflater, container, false )

        return binding.root
    }


}