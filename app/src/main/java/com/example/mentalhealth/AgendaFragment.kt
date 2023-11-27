package com.example.mentalhealth

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.CalendarView
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.mentalhealth.activities.DatabaseHelper
import java.text.SimpleDateFormat
import java.util.Calendar
import android.widget.TableLayout
import android.widget.TableRow



class AgendaFragment : Fragment() {

    private lateinit var selectedDate: Calendar
    private lateinit var eventNameEditText: EditText
    private lateinit var databaseHelper: DatabaseHelper
    private lateinit var createEventButton: Button
    private lateinit var eventsTableLayout: TableLayout
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_agenda, container, false)

        val calendarView: CalendarView = view.findViewById(R.id.calendarView)
        createEventButton = view.findViewById(R.id.createEventButton)
        eventsTableLayout = view.findViewById(R.id.eventsTableLayout)
        eventNameEditText = view.findViewById(R.id.eventNameEditText)

        calendarView.setOnDateChangeListener { _, year, month, dayOfMonth ->
            selectedDate = Calendar.getInstance().apply {
                set(year, month, dayOfMonth)
            }
            showToast("Fecha seleccionada: ${dayOfMonth}/${month + 1}/${year}")
        }

        databaseHelper = DatabaseHelper(requireContext())

        createEventButton.setOnClickListener {
            createAndSaveEvent(selectedDate, eventNameEditText.text.toString())
            updateUpcomingEvents()
        }

        return view
    }

    private fun showToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }

    private fun createAndSaveEvent(eventDate: Calendar, eventName: String) {
        val eventId = databaseHelper.insertEvent(eventName, eventDate)
        showToast("Evento creado con ID: $eventId")
    }

    private fun updateUpcomingEvents() {
        val upcomingEvents = databaseHelper.getUpcomingEvents(3)

        // Mostrar eventos en el TextView

        eventsTableLayout.removeAllViews()
        for (event in upcomingEvents) {
            val row = TableRow(requireContext())
            val textView = TextView(requireContext()).apply {
                text = event
                textSize = 10f // Tamaño de texto ajustado
            }
            row.addView(textView)
            eventsTableLayout.addView(row)
        }

        showToast("Próximos eventos actualizados")
    }
}

