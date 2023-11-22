package com.example.mentalhealth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.mentalhealth.R

class MindFragment : Fragment() {

    private lateinit var tvTextoAleatorio2: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_mind, container, false)

        // Obtén referencias a los elementos de la interfaz de usuario
        tvTextoAleatorio2 = rootView.findViewById(R.id.tvTextoAleatorio2)
        val btnMostrarTextoAleatorio: Button = rootView.findViewById(R.id.btnaleatorio)

        // Configura un listener para el clic del botón
        btnMostrarTextoAleatorio.setOnClickListener {
            // Muestra un texto aleatorio en el TextView
            mostrarTextoAleatorio()
        }

        return rootView
    }

    private fun mostrarTextoAleatorio() {
        // Lista de textos aleatorios
        val textosAleatorios = listOf("Respiración Cuadrada:\n" +
                "Inhala, detén, exhala, pausa. Repite este ciclo. Ayuda a calmar el sistema nervioso.",
            "Exploración Sensorial:\n" +
                    "Elige un objeto pequeño. Examínalo con cada sentido: toca, huele, escucha, mira, prueba." ,
            "Mindful Walking:\n" +
                    "Camina lentamente, siente cada paso, observa las sensaciones en tus piernas. Hazlo en cualquier lugar." ,
            "Atención Plena en la Respiración:\n" +
                    "Siéntate cómodamente, concéntrate en la respiración. " +
                    "Vuelve a ella cuando la mente divague." ,
            "Práctica de Body Scan:\n" +
                    "Acuéstate, dirige la atención a partes del cuerpo. Observa sensaciones sin juzgar." ,
            "Observación de Pensamientos:\n" +
                    "Siéntate en silencio, observa tus pensamientos como nubes. No te apegues, déjalos ir." ,
            "Mindfulness en la Comida:\n" +
                    "Observa un bocado antes de comerlo. Siente la textura, huele, saborea cada mordisco.", "" +
                    "Práctica de Aceptación:\n" +
                    "Enfrenta una situación estresante. Siente las emociones, acéptalas sin juzgar." ,
                    "Ejercicio de \"STOP\":\n" +
                            "Detente, observa cuerpo y mente, respira profundamente y continúa con tus actividades." ,
                    "Mindfulness en la Naturaleza:\n" +
                            "Da un paseo en la naturaleza. Observa detalles, escucha sonidos, siéntete conectado.")

        // Selecciona un texto aleatorio de la lista
        val textoAleatorio2 = textosAleatorios.random()

        // Muestra el texto en el TextView
        tvTextoAleatorio2.text = textoAleatorio2

    }
    }