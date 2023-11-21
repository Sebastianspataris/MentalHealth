package com.example.mentalhealth.activities

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mentalhealth.R

class RegistroActivity : AppCompatActivity() {

    private lateinit var firstNameEditText: EditText
    private lateinit var lastNameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var dobEditText: EditText
    private lateinit var diagnosisEditText: EditText
    private lateinit var registerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registro_activity)

        // Inicializar vistas
        firstNameEditText = findViewById(R.id.editTextFirstName)
        lastNameEditText = findViewById(R.id.editTextLastName)
        emailEditText = findViewById(R.id.editTextEmail)
        dobEditText = findViewById(R.id.editTextDOB)
        diagnosisEditText = findViewById(R.id.editDiagnosis)
        registerButton = findViewById(R.id.buttonRegister)

        // Configurar el clic del botón de registro
        registerButton.setOnClickListener {
            realizarRegistro()
        }
    }

    private fun realizarRegistro() {
        // Aquí puedes obtener los valores de los EditText y Spinner
        val firstName = firstNameEditText.text.toString()
        val lastName = lastNameEditText.text.toString()
        val email = emailEditText.text.toString()
        val dob = dobEditText.text.toString()
        val diagnosis = diagnosisEditText.text.toString()

        // Puedes realizar la lógica de registro aquí
        // Por ejemplo, podrías validar los datos y luego mostrar un mensaje Toast
        val mensaje = "Registro exitoso:\nNombre: $firstName $lastName\nCorreo: $email\nDOB: $dob\nDiagnóstico: $diagnosis"
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
    }
}