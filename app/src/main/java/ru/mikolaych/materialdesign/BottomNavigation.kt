package ru.mikolaych.materialdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import ru.mikolaych.materialdesign.databinding.ActivityBottomNavigationBinding

class BottomNavigation : AppCompatActivity() {
    private lateinit var binding:ActivityBottomNavigationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityBottomNavigationBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, ArticleNav()).commit()

        binding.bottomNavigation.setOnItemSelectedListener { item->
            when(item.itemId){

                R.id.article -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frameLayout, ArticleNav()).commit()
                }
                R.id.calc -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frameLayout, CalculatorNav()).commit()
                }
                R.id.convertor -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frameLayout, ConvertorNav()).commit()
                }
                R.id.contacts -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frameLayout, ContactsNav()).commit()
                }
                R.id.home -> {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }

            }
            return@setOnItemSelectedListener true
        }

    }


}