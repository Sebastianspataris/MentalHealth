package com.example.mentalhealth.activities

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mentalhealth.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    private lateinit var bottomNavigation: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        bottomNavigation = findViewById(R.id.bottom_navigation)
    }

    override fun onStart() {
        super.onStart()
        bottomNavigation.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.page_1 -> {
                    //Aca cuando seleccionas Monitorar
                    Toast.makeText(this, "Vamos a monitorear!", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.page_2 -> {
                    //Aca cuando seleccionas Notas
                    Toast.makeText(this, "Vamos a Ir a Notas!", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }
}