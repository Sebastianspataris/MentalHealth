package com.example.mentalhealth

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.mentalhealth.R

class SoporteFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_soporte, container, false)

        // Obtén referencias a los TextView en tu diseño
        val infoTextView = view.findViewById<TextView>(R.id.infoTextView)
        val correoTextView = view.findViewById<TextView>(R.id.correoTextView)
        val telefonoTextView = view.findViewById<TextView>(R.id.telefonoTextView)

        // Configura el texto de los TextView
        infoTextView.text="Si posee problemas con la app contactenos por estos medios de contacto"
        correoTextView.text = "Correos de contacto: ejemplo@gmail.com"
        telefonoTextView.text = "Teléfono: +56912345678"

        return view
    }
}