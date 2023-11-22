package com.example.mentalhealth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.mentalhealth.R

class BienestarFragment : Fragment() {

    private lateinit var tvTextoAleatorio: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_bienestar, container, false)

        // Obtén referencias a los elementos de la interfaz de usuario
        tvTextoAleatorio = rootView.findViewById(R.id.tvTextoAleatorio)
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
        val textosAleatorios = listOf("Establece Metas Realistas: Define metas alcanzables y realistas para ti mismo." +
                " Esto te proporcionará un sentido de logro y motivación.",
            "Cuida de tu Salud Física: Practica hábitos saludables, como una dieta balanceada, ejercicio regular y suficiente descanso. " +
                    "La salud física está intrínsecamente vinculada al bienestar emocional.",
            "Prioriza el Autocuidado: Dedica tiempo para cuidarte a ti mismo. Esto puede incluir actividades relajantes como leer," +
                    " tomar un baño, meditar o practicar hobbies que disfrutes.",
            "Fomenta Relaciones Positivas: Cultiva relaciones significativas con amigos y familiares. " +
                    "Las conexiones sociales son fundamentales para el bienestar emocional.", "Gestiona el Estrés: Desarrolla técnicas para gestionar el estrés, como la respiración profunda, la meditación o el yoga." +
                    " Aprende a identificar y manejar los desencadenantes de estrés." , "Aprende a Decir No: Establece límites saludables y aprende a decir no cuando sea necesario." +
                    " Esto ayuda a evitar el agotamiento y el sobrecompromiso." , "Desarrolla una Mentalidad Positiva: Practica el pensamiento positivo " +
                    "y la gratitud. Enfócate en lo positivo incluso en situaciones desafiantes." , "Establece Rutinas Saludables: Mantén rutinas diarias que te brinden estructura y estabilidad. Esto puede incluir horarios " +
                    "de sueño regulares y una rutina matutina." , "Cultiva el Aprendizaje Continuo: Mantén una mente curiosa y busca oportunidades de aprendizaje continuo. Esto puede ser a través de la lectura," +
                    " cursos en línea o nuevas experiencias." , "Celebra tus Logros: Reconoce y celebra tus logros, grandes o pequeños." +
                    " Esto fortalece la autoestima y la sensación de éxito.")

        // Selecciona un texto aleatorio de la lista
        val textoAleatorio = textosAleatorios.random()

        // Muestra el texto en el TextView
        tvTextoAleatorio.text = textoAleatorio
    }
}