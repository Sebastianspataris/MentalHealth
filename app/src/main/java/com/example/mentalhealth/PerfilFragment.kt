package com.example.mentalhealth

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.method.PasswordTransformationMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.text.Editable
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.mentalhealth.activities.DatabaseHelper
import com.example.mentalhealth.activities.SessionManager
import com.example.mentalhealth.R

class PerfilFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    private lateinit var passwordEditText: EditText
    private lateinit var togglePasswordButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_perfil, container, false)

        // Obtén referencias a los elementos de la interfaz de usuario
        val usernameTextView = view.findViewById<TextView>(R.id.usernameTextView)
        val firstNameTextView = view.findViewById<TextView>(R.id.firstNameTextView)
        val lastNameTextView = view.findViewById<TextView>(R.id.lastNameTextView)
        val diagTextView = view.findViewById<TextView>(R.id.diagTextView)
        val dobTextView = view.findViewById<TextView>(R.id.dobTextView)

        // Agrega referencias a los nuevos elementos
        passwordEditText = view.findViewById(R.id.passwordEditText)
        togglePasswordButton = view.findViewById(R.id.togglePasswordButton)

        // Configura el listener para el botón
        togglePasswordButton.setOnClickListener {
            togglePasswordVisibility()
        }

        // Obtén el nombre de usuario del usuario actual desde la sesión
        val sessionManager = SessionManager(requireContext())
        val currentUser = sessionManager.username

        // Llama a la función para cargar y mostrar los datos del usuario
        loadUserData(usernameTextView, firstNameTextView, lastNameTextView, diagTextView, dobTextView, passwordEditText, currentUser)

        return view
    }

    @SuppressLint("Range")
    private fun loadUserData(
        usernameTextView: TextView,
        firstNameTextView: TextView,
        lastNameTextView: TextView,
        diagTextView: TextView,
        dobTextView: TextView,
        passwordEditText: EditText,
        currentUser: String?
    ) {
        currentUser?.let {
            val db = DatabaseHelper(requireContext()).readableDatabase
            val cursor = db.query(
                DatabaseHelper.TABLE_USERS,
                null,
                "${DatabaseHelper.COLUMN_USERNAME} = ?",
                arrayOf(currentUser),
                null,
                null,
                null
            )

            if (cursor.moveToFirst()) {
                // Obtén los datos del usuario desde el cursor y muéstralos en los TextViews
                val username = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_USERNAME))
                val firstName = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_FIRST_NAME))
                val lastName = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_LAST_NAME))
                val diagnostic = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_DIAG))
                val dob = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_DOB))
                val password = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_PASSWORD))

                usernameTextView.text = "Correo: $username"
                firstNameTextView.text = "Nombre: $firstName"
                lastNameTextView.text = "Apellido: $lastName"
                diagTextView.text = "Diagnóstico: $diagnostic"
                dobTextView.text = "Fecha de Nacimiento: $dob"

                // Mostrar la contraseña como asteriscos
                passwordEditText.text = Editable.Factory.getInstance().newEditable(password)
                passwordEditText.transformationMethod = PasswordTransformationMethod.getInstance()
            }
            cursor.close()
        }
    }

    private fun togglePasswordVisibility() {
        val currentTransformationMethod = passwordEditText.transformationMethod
        if (currentTransformationMethod == null) {
            // La contraseña está visible, establece el método de transformación a PasswordTransformationMethod
            passwordEditText.transformationMethod = PasswordTransformationMethod.getInstance()
            togglePasswordButton.text = "Mostrar contraseña"
        } else {
            // La contraseña está oculta, establece el método de transformación a null
            passwordEditText.transformationMethod = null
            togglePasswordButton.text = "Ocultar contraseña"
        }
        // Mueve el cursor al final del texto
        passwordEditText.setSelection(passwordEditText.text.length)
    }
}
