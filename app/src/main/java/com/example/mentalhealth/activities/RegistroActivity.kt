package com.example.mentalhealth.activities

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mentalhealth.R
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class RegistroActivity : AppCompatActivity() {

    private lateinit var firstNameEditText: EditText
    private lateinit var lastNameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var dobEditText: EditText
    private lateinit var registerButton: Button

    private lateinit var databaseReference: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registro_activity)

        // Inicializar vistas
        firstNameEditText = findViewById(R.id.editTextFirstName)
        lastNameEditText = findViewById(R.id.editTextLastName)
        emailEditText = findViewById(R.id.editTextEmail)
        dobEditText = findViewById(R.id.editTextDOB)
        passwordEditText = findViewById(R.id.editTextPassword)
        registerButton = findViewById(R.id.buttonRegister)
        databaseReference = FirebaseDatabase.getInstance().reference.child("users")

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
        val password = passwordEditText.text.toString()
        val dobString = dobEditText.text.toString()

        try {
            // Parsear la cadena de fecha a un objeto Date
            val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
            val dob = dateFormat.parse(dobString)

            val userId = databaseReference.push().key
            val user = User(userId, firstName, lastName, email, password, dobString)

            databaseReference.child(userId!!).setValue(user)
            val mensaje = "Registro exitoso:\nNombre: $firstName $lastName\nCorreo: $email\nDOB: $dobString\n"
            Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
        } catch (e: ParseException) {
            e.printStackTrace()
            Toast.makeText(this, "Error al parsear la fecha", Toast.LENGTH_SHORT).show()
        }
    }
}