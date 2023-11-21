package com.example.mentalhealth.activities

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mentalhealth.R
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class RegistroActivity : AppCompatActivity() {

    private lateinit var firstNameEditText: EditText
    private lateinit var lastNameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var dobEditText: EditText
    private lateinit var diagnosisEditText: EditText
    private lateinit var registerButton: Button

    private lateinit var selectedDate: Date

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

        // Configurar el clic del EditText para la fecha de nacimiento
        dobEditText.setOnClickListener {
            showDatePickerDialog()
        }
    }

    private fun showDatePickerDialog() {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
                val selectedCalendar = Calendar.getInstance()
                selectedCalendar.set(year, month, dayOfMonth)
                selectedDate = selectedCalendar.time

                // Formatear la fecha seleccionada y establecerla en el EditText
                val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
                val dateString = dateFormat.format(selectedDate)
                dobEditText.setText(dateString)
            },
            year,
            month,
            day
        )

        // Mostrar el cuadro de diálogo del selector de fecha
        datePickerDialog.show()
    }

    private fun realizarRegistro() {
        // Aquí puedes obtener los valores de los EditText y Spinner
        val firstName = firstNameEditText.text.toString()
        val lastName = lastNameEditText.text.toString()
        val email = emailEditText.text.toString()
        val dobString = dobEditText.text.toString()
        val diagnosis = diagnosisEditText.text.toString()

        try {
            // Parsear la cadena de fecha a un objeto Date
            val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
            val dob = dateFormat.parse(dobString)

            // Puedes realizar la lógica de registro aquí
            // Por ejemplo, podrías validar los datos y luego mostrar un mensaje Toast
            val mensaje =
                "Registro exitoso:\nNombre: $firstName $lastName\nCorreo: $email\nDOB: $dobString\nDiagnóstico: $diagnosis"
            Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
        } catch (e: ParseException) {
            e.printStackTrace()
            Toast.makeText(this, "Error al parsear la fecha", Toast.LENGTH_SHORT).show()
        }
    }
}
