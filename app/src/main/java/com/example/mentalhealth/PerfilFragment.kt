package com.example.mentalhealth

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.mentalhealth.activities.DatabaseHelper
import com.example.mentalhealth.activities.SessionManager
import com.example.mentalhealth.R

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class PerfilFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_perfil, container, false)

        // Obtén referencias a los elementos de la interfaz de usuario
        val usernameTextView = view.findViewById<TextView>(R.id.usernameTextView)
        val firstNameTextView = view.findViewById<TextView>(R.id.firstNameTextView)
        val lastNameTextView = view.findViewById<TextView>(R.id.lastNameTextView)
        val diagTextView=view.findViewById<TextView>(R.id.diagTextView)
        val dobTextView = view.findViewById<TextView>(R.id.dobTextView)
        val passwordTextView = view.findViewById<TextView>(R.id.passwordTextView)

        // Obtén el nombre de usuario del usuario actual desde la sesión
        val sessionManager = SessionManager(requireContext())
        val currentUser = sessionManager.username

        // Llama a la función para cargar y mostrar los datos del usuario
        loadUserData(usernameTextView, firstNameTextView, lastNameTextView, diagTextView, dobTextView, passwordTextView, currentUser)

        return view
    }

    @SuppressLint("Range", "SetTextI18n")
    private fun loadUserData(
        usernameTextView: TextView,
        firstNameTextView: TextView,
        lastNameTextView: TextView,
        diagTextView: TextView,
        dobTextView: TextView,
        passwordTextView: TextView,
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

                usernameTextView.text = "Nombre de usuario: $username"
                firstNameTextView.text = "Nombre: $firstName"
                lastNameTextView.text = "Apellido: $lastName"
                diagTextView.text ="diagnostico: $diagnostic"
                dobTextView.text = "Fecha de Nacimiento: $dob"
                passwordTextView.text = "Contraseña: $password"
            }
            cursor.close()
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            PerfilFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
