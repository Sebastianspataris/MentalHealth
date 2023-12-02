import android.app.AlarmManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.annotation.SuppressLint
import android.database.sqlite.SQLiteDatabase
import android.os.Build
import java.text.SimpleDateFormat
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TimePicker
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.mentalhealth.R
import java.util.Calendar

class AlarmaFragment : Fragment() {

    private lateinit var timePicker: TimePicker
    private lateinit var setAlarmButton: Button
    private lateinit var medicationNameEditText: EditText
    private lateinit var medicationQuantityEditText: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_alarma, container, false)
        timePicker = view.findViewById(R.id.timePicker)
        medicationNameEditText = view.findViewById(R.id.medicationNameEditText)
        medicationQuantityEditText = view.findViewById(R.id.medicationQuantityEditText)
        setAlarmButton = view.findViewById(R.id.setAlarmButton)

        setAlarmButton.setOnClickListener {
            setAlarm()
        }

        return view
    }

    private fun setAlarm() {
        val calendar = Calendar.getInstance()

        if (Build.VERSION.SDK_INT >= 23) {
            calendar.set(
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH),
                timePicker.hour,
                timePicker.minute,
                0
            )
        } else {
            calendar.set(
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH),
                timePicker.currentHour,
                timePicker.currentMinute,
                0
            )
        }
        val medicationName = medicationNameEditText.text.toString()
        val medicationQuantity = medicationQuantityEditText.text.toString()

        // Guardar la alarma en la base de datos
        val eventId = saveAlarm(medicationName, medicationQuantity, calendar)

        val alarmManager =
            requireContext().getSystemService(Context.ALARM_SERVICE) as AlarmManager

        val intent = Intent(requireContext(), AlarmReceiver::class.java)
        val pendingIntent = PendingIntent.getBroadcast(
            requireContext(),
            eventId.toInt(), // Usamos el ID de la alarma como requestCode
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT
        )

        // Usar setExact para versiones de Android >= 19 (KITKAT) y set para versiones anteriores
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            alarmManager.setExact(
                AlarmManager.RTC_WAKEUP,
                calendar.timeInMillis,
                pendingIntent
            )
        } else {
            alarmManager.set(
                AlarmManager.RTC_WAKEUP,
                calendar.timeInMillis,
                pendingIntent
            )
        }

        Toast.makeText(
            requireContext(),
            "Alarma programada para las ${formatTime(calendar)} con $medicationQuantity unidades de $medicationName",
            Toast.LENGTH_SHORT
        ).show()
    }

    private fun formatTime(calendar: Calendar): String {
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val minute = calendar.get(Calendar.MINUTE)
        return String.format("%02d:%02d", hour, minute)
    }


    private fun saveAlarm(medicationName: String, medicationQuantity: String, calendar: Calendar): Long {
        val db = DatabaseHelper(requireContext()).writableDatabase

        val values = ContentValues().apply {
            put(DatabaseHelper.COLUMN_ALARM_MEDICATION_NAME, medicationName)
            put(DatabaseHelper.COLUMN_ALARM_MEDICATION_QUANTITY, medicationQuantity)
            put(DatabaseHelper.COLUMN_ALARM_TIME, DatabaseHelper.formatDate(calendar))
        }

        return db.insert(DatabaseHelper.TABLE_ALARMS, null, values)
    }

    class AlarmReceiver : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            // Maneja la acción de la alarma aquí
            Toast.makeText(context, "¡Alarma activada!", Toast.LENGTH_SHORT).show()
        }
    }
}
