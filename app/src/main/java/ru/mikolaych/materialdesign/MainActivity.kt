package ru.mikolaych.materialdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import ru.mikolaych.materialdesign.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.bottomNavigation.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when(view.id){
            R.id.bottomNavigation -> {
                val intent = Intent(this, BottomNavigation::class.java)
                startActivity(intent)
            }
        }
    }
}