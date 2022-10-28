package ru.mikolaych.materialdesign

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.mikolaych.materialdesign.databinding.ContactsNavBinding



class ContactsNav : Fragment() {
    private lateinit var binding:ContactsNavBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ContactsNavBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }


}