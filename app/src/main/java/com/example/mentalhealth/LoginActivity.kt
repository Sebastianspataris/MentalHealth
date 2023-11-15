package com.example.mentalhealth

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


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

        btnGoToRegister.setOnClickListener {
            // Cuando se hace clic en el botón de registro, abre la actividad de registro
            val intent = Intent(this, RegistroActivity::class.java)
            startActivity(intent)


        btnLogin.setOnClickListener {
            // Tu lógica de inicio de sesión aquí...

            // Después de realizar el inicio de sesión, puedes abrir la MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()

        }


        btnLogin.setOnClickListener {
            val enteredUsername = editTextUsername.text.toString()
            val enteredPassword = editTextPassword.text.toString()

            if (enteredUsername.isNotEmpty() && enteredPassword.isNotEmpty()) {

                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {

            }
        }
    }
}
}