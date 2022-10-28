package ru.mikolaych.materialdesign

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.mikolaych.materialdesign.databinding.ConvertorNavBinding



class ConvertorNav : Fragment() {
    private lateinit var binding: ConvertorNavBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = ConvertorNavBinding.inflate(inflater, container, false)




        return binding.root
    }


}