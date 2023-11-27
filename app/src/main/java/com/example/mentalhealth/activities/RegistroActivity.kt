package com.example.mentalhealth.activities

import android.annotation.SuppressLint
import android.content.ContentValues
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mentalhealth.activities.DatabaseHelper
import com.example.mentalhealth.R

class RegistroActivity : AppCompatActivity() {

    private lateinit var firstNameEditText: EditText
    private lateinit var lastNameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var dobEditText: EditText
    private lateinit var password1EditText: EditText
    private lateinit var password2EditText: EditText
    private lateinit var registerButton: Button
    private lateinit var databaseHelper: DatabaseHelper

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registro_activity)

        // Inicializar vistas
        firstNameEditText = findViewById(R.id.editTextFirstName)
        lastNameEditText = findViewById(R.id.editTextLastName)
        emailEditText = findViewById(R.id.editTextEmail)
        dobEditText = findViewById(R.id.editTextDOB)
        password1EditText = findViewById(R.id.editTextpassword1)
        password2EditText = findViewById(R.id.editTextpassword2)
        registerButton = findViewById(R.id.buttonRegister)
        databaseHelper = DatabaseHelper(this)

        // Configurar el clic del botón de registro
        registerButton.setOnClickListener {
            realizarRegistro()
        }
    }

    private fun realizarRegistro() {
        // Obtener los valores de los EditText
        val firstName = firstNameEditText.text.toString()
        val lastName = lastNameEditText.text.toString()
        val email = emailEditText.text.toString()
        val password1 = password1EditText.text.toString()
        val password2 = password2EditText.text.toString()
        val dob = dobEditText.text.toString()

        // Validar que todos los campos estén llenos
        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || password1.isEmpty() || password2.isEmpty() || dob.isEmpty()) {
            Toast.makeText(this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show()
            return
        }

        // Validar que las contraseñas coincidan
        if (password1 != password2) {
            Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show()
            return
        }

        // Insertar el nuevo usuario en la base de datos
        val db = databaseHelper.writableDatabase
        val contentValues = ContentValues().apply {
            put(DatabaseHelper.COLUMN_USERNAME, email)
            put(DatabaseHelper.COLUMN_PASSWORD, password1)
        }
        db.insert(DatabaseHelper.TABLE_USERS, null, contentValues)

        // Mostrar un mensaje de registro exitoso
        val mensaje =
            "Registro exitoso:\nNombre: $firstName $lastName\nCorreo: $email\nDOB: $dob"
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
    }
}
