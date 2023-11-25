package com.example.mentalhealth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment

class EfectosSecFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_efectos_sec, container, false)

        // Obtén la referencia del Spinner, el botón y el TextView desde el layout
        val spinner: Spinner = view.findViewById(R.id.spinner)

        val textoResultado: TextView = view.findViewById(R.id.textoResultado)

        // Lista de nombres
        val medicamentos = listOf(
            "Selecciona un Medicamento","Sertralina", "Fluoxetina", "Citalopram", "Escitalopram", "Venlafaxina",
            "Bupropión", "Paroxetina", "Risperidona", "Olanzapina", "Quetiapina",
            "Aripiprazol", "Lorazepam", "Alprazolam", "Diazepam", "Clonazepam",
            "Lamotrigina", "Litio", "Mirtazapina", "Duloxetina", "Trazodona",
            "Haloperidol", "Clorpromazina", "Lurasidona", "Trifluoperazina", "Valproato",
            "Carbamazepina", "Tioridazina", "Perfenazina", "Flufenazina", "Topiramato",
            "Ziprasidona", "Amisulprida", "Haloperidol decanoato", "Nortriptilina", "Desipramina",
            "Imipramina", "Amitriptilina", "Maprotilina", "Clomipramina", "Trimipramina",
            "Doxepina", "Metilfenidato", "Atomoxetina", "Ropinirol", "Pramipexol",
            "Carbidopa/Levodopa", "Entacapona", "Trihexifenidilo", "Benztropina", "Donepezilo",
            "Memantina", "Sertralina", "Tianeptina", "Milnaciprán", "Modafinilo",
            "Escitalopram", "Atomoxetina", "Vortioxetina", "Aripiprazol", "Asenapina",
            "Brexpiprazol", "Cariprazina", "Clotiapina", "Clozapina", "Flupentixol",
            "Fluphenazina", "Risperidona", "Sertindol", "Paliperidona", "Citalopram",
            "Olanzapina", "Melperona", "Loxapina", "Levomepromazina", "Levosulpirida",
            "Trifluoperazina", "Perospirona", "Amoxapina", "Oxitriptán", "Trazodona",
            "Vilazodona", "Lisdexanfetamina", "Maprotilina", "Mianserina", "Mirtazapina",
            "Nefazodona", "Reboxetina", "Selegilina", "Amitriptilina", "Bupropión",
            "Desipramina", "Doxepina", "Imipramina", "Nortriptilina", "Trimipramina",
            "Venlafaxina", "Agomelatina", "Agomelatina", "Milnaciprán", "Clorazepato"
        )
        val efectosSecundarios = listOf(
            "Náuseas: Puede causar malestar estomacal o náuseas, especialmente al principio del tratamiento.\n" +
                    "\n" +
                    "Insomnio o somnolencia: Algunas personas pueden experimentar dificultades para conciliar el sueño, mientras que otras pueden sentir somnolencia.\n" +
                    "\n" +
                    "Mareos: La sertralina puede causar sensación de mareo en algunas personas.\n" +
                    "\n" +
                    "Boca seca: Algunas personas pueden experimentar sequedad en la boca como efecto secundario.\n" +
                    "\n" +
                    "Problemas gastrointestinales: Pueden incluir diarrea o estreñimiento.\n" +
                    "\n" +
                    "Pérdida de apetito o aumento de peso: Puede afectar el apetito de manera diferente en cada persona.\n" +
                    "\n" +
                    "Dolor de cabeza: Algunas personas pueden experimentar dolores de cabeza como efecto secundario.\n" +
                    "\n" +
                    "Síntomas sexuales: Pueden incluir disminución del deseo sexual, dificultades para alcanzar el orgasmo o disfunción eréctil.\n" +
                    "\n" +
                    "Agitación o nerviosismo: Algunas personas pueden experimentar una sensación de agitación o nerviosismo al tomar sertralina.\n" +
                    "\n" +
                    "Síndrome de la serotonina: En casos raros, el uso de la sertralina puede llevar al síndrome de la serotonina, que es una condición potencialmente grave caracterizada por cambios en el estado mental, frecuencia cardíaca rápida, fiebre y otros síntomas. Esto generalmente ocurre cuando se toma sertralina junto con otros medicamentos que afectan la serotonina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",
            "Efectos secundarios de la Fluoxetina",

        )

        // Configurar el adaptador del Spinner
        val adapter = ArrayAdapter<String>(
            requireContext(),
            android.R.layout.simple_spinner_item,
            medicamentos
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        // Configurar el listener para mostrar el mensaje correspondiente
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parentView: AdapterView<*>?, selectedItemView: View?, position: Int, id: Long) {
                if (position > 0 && position < medicamentos.size) {
                    val mensaje = efectosSecundarios[position - 1]  // Restamos 1 porque la posición 0 es "Seleccione un medicamento"
                    textoResultado.text = mensaje
                } else {
                    textoResultado.text = "Por favor, selecciona un medicamento"
                }
            }

            override fun onNothingSelected(parentView: AdapterView<*>?) {
                // No se hace nada cuando no se selecciona nada
            }
        }

        return view
    }
}