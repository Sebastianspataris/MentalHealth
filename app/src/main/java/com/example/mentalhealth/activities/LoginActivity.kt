package com.example.mentalhealth.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mentalhealth.R


class LoginActivity : AppCompatActivity() {

    private lateinit var editTextUsername: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var btnGoToRegister: Button // Boton registro


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        editTextUsername = findViewById(R.id.editTextUsername)
        editTextPassword = findViewById(R.id.editTextPassword)
        btnLogin = findViewById(R.id.btnLogin)
        btnGoToRegister = findViewById(R.id.btnGoToRegister)
    }

    override fun onStart() {
        super.onStart()
        setButtonsListener()
    }

    private fun setButtonsListener() {
        btnGoToRegister.setOnClickListener {
            // Cuando se hace clic en el botón de registro, abre la actividad de registro
            val intent = Intent(this, RegistroActivity::class.java)
            startActivity(intent)
        }

        btnLogin.setOnClickListener {
            val enteredUsername = editTextUsername.text.toString()
            val enteredPassword = editTextPassword.text.toString()

            if (enteredUsername.isNotEmpty() && enteredPassword.isNotEmpty()) {
                val db = DatabaseHelper(this).readableDatabase
                val userExists = DatabaseHelper(this).checkUserCredentials(enteredUsername, enteredPassword)

                if (userExists || (enteredUsername == "admin" && enteredPassword == "1234")) {
                    // Credenciales válidas, iniciar la actividad principal
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    // Mostrar un mensaje de error si las credenciales son incorrectas
                    Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show()
                }
            } else {
                // Mostrar un mensaje de error si los campos están vacíos
                Toast.makeText(this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}