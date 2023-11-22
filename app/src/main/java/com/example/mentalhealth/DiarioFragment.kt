package com.example.mentalhealth


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import java.text.SimpleDateFormat
import java.util.*

class DiarioFragment : Fragment() {

    private lateinit var notaEditText: EditText
    private lateinit var guardarButton: Button
    private lateinit var resultadoTextView: TextView
    private val listaNotas = mutableListOf<Nota>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_diario, container, false)

        notaEditText = view.findViewById(R.id.editTextNota)
        guardarButton = view.findViewById(R.id.buttonGuardar)
        resultadoTextView = view.findViewById(R.id.textViewResultado)

        guardarButton.setOnClickListener {
            guardarNota()
        }

        return view
    }

    private fun guardarNota() {
        val notaTexto = notaEditText.text.toString()
        if (notaTexto.isNotBlank()) {
            val fechaActual = obtenerFechaActual()
            val nota = Nota(notaTexto, fechaActual)
            listaNotas.add(nota)

            mostrarNotas()
            limpiarCampos()
        }
    }

    private fun obtenerFechaActual(): String {
        val formatoFecha = SimpleDateFormat("dd/MM/yy HH:mm", Locale.getDefault())
        val fecha = Calendar.getInstance().time
        return formatoFecha.format(fecha)
    }

    private fun mostrarNotas() {
        val resultado = StringBuilder()
        for (nota in listaNotas) {
            resultado.append("${nota.titulo} - ${nota.fecha}\n")
        }
        resultadoTextView.text = resultado.toString()
    }

    private fun limpiarCampos() {
        notaEditText.text.clear()
    }
}

data class Nota(val titulo: String, val fecha: String)
