package com.example.mentalhealth

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CalendarView
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class AgendaFragment : Fragment() {

    private lateinit var selectedDate: Calendar
    private lateinit var eventNameEditText: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_agenda, container, false)

        val calendarView: CalendarView = view.findViewById(R.id.calendarView)
        val createEventButton: Button = view.findViewById(R.id.createEventButton)
        eventNameEditText = view.findViewById(R.id.eventNameEditText)

        calendarView.setOnDateChangeListener { _, year, month, dayOfMonth ->
            selectedDate = Calendar.getInstance().apply {
                set(year, month, dayOfMonth)
            }
            showToast("Fecha seleccionada: ${dayOfMonth}/${month + 1}/${year}")
        }

        createEventButton.setOnClickListener {
            // Lógica para crear un evento simple con solo la fecha y el nombre del evento
            createSimpleEvent(selectedDate, eventNameEditText.text.toString())
        }

        return view
    }

    private fun showToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }

    private fun createSimpleEvent(eventDate: Calendar, eventName: String) {
        val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
        val formattedDate = dateFormat.format(eventDate.time)

        val eventDetails = "Evento: $eventName\nFecha: $formattedDate"

        showToast(eventDetails)
    }
}
