package com.example.mentalhealth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import androidx.fragment.app.Fragment
import com.example.mentalhealth.R

class InfoDiagFragment : Fragment() {

    private lateinit var spinner4: Spinner
    private lateinit var cuadroText: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_info_diag, container, false)

        spinner4 = view.findViewById(R.id.spinner4)
        cuadroText = view.findViewById(R.id.cuadroText)

        val opciones = arrayOf(
            "Enfermedades de salud mental",
            "TDAH",
            "Depresión",
            "Trastorno bipolar",
            "Trastorno de apetito desenfrenado",
            "Trastorno del sueño REM",
            "Trastorno del espectro autista",
            "Narcolepsia"
        )

        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, opciones)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner4.adapter = adapter

        spinner4.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val opcionSeleccionada = opciones[position]
                val informacionAdicional = when (opcionSeleccionada) {
                    "TDAH" -> {
                        """
                         El trastorno por déficit de atención e hiperactividad (TDAH) es un trastorno mental que comprende una combinación de problemas persistentes, como dificultad para prestar atención, hiperactividad y conducta impulsiva. El TDAH en los adultos puede llevar a relaciones inestables, mal desempeño en el trabajo o en la escuela, baja autoestima y otros problemas.

                        Aunque se llama TDAH en adultos, los síntomas comienzan en la primera infancia y continúan en la adultez. En algunos casos, el TDAH no se reconoce ni se diagnostica hasta que la persona es un adulto. Los síntomas del TDAH en adultos pueden no ser tan claros como los síntomas del TDAH en niños. En los adultos, la hiperactividad puede disminuir, pero los problemas con la impulsividad, la inquietud y la dificultad para prestar atención pueden continuar.

                        El tratamiento para el TDAH en adultos es similar al tratamiento para el TDAH en niños. El tratamiento del TDAH en adultos incluye medicamentos, asesoramiento psicológico (psicoterapia) y tratamiento para cualquier afección de salud mental que se presente junto con el TDAH.
                        """.trimIndent()
                    }

                    "Depresión" -> {
                        """
                       La depresión es una enfermedad común pero grave que interfiere con la vida diaria, con la capacidad para trabajar, dormir, estudiar, comer y disfrutar de la vida. La depresión es causada por una combinación de factores genéticos, biológicos, ambientales y psicológicos.

                        Algunas investigaciones indican que el riesgo genético para la depresión es el resultado de la influencia de varios genes que actúan junto con factores ambientales y otros factores de riesgo.

                        Algunos tipos de depresión tienden a darse en familias. Sin embargo, la depresión también puede ocurrir en personas sin antecedentes familiares de depresión. No todas las personas con enfermedades depresivas experimentan los mismos síntomas. La gravedad, frecuencia y duración de los síntomas varían dependiendo de la persona y su enfermedad en particular.
                        """.trimIndent()
                    }
                    "Trastorno bipolar" -> {
                        """
                         El trastorno bipolar, antes denominado «depresión maníaca», es una enfermedad mental que causa cambios extremos en el estado de ánimo que comprenden altos emocionales (manía o hipomanía) y bajos emocionales (depresión).

                        Cuando te deprimes, puedes sentirte triste o desesperanzado y perder el interés o el placer en la mayoría de las actividades. Cuando tu estado de ánimo cambia a manía o hipomanía (menos extrema que la manía), es posible que te sientas eufórico, lleno de energía o inusualmente irritable. Estos cambios en el estado de ánimo pueden afectar el sueño, la energía, el nivel de actividad, el juicio, el comportamiento y la capacidad de pensar con claridad.

                        Los episodios de cambios en el estado de ánimo pueden ocurrir en raras ocasiones o muchas veces por año. Aunque la mayoría de las personas presenten síntomas emocionales entre los episodios, es posible que algunas no presenten ninguno.

                        Aunque el trastorno bipolar es una afección de por vida, puedes controlar los cambios en el estado de ánimo y otros síntomas siguiendo un plan de tratamiento. En la mayoría de los casos, el trastorno bipolar se trata con medicamentos y apoyo psicológico (psicoterapia).
                        """.trimIndent()
                    }
                    "Trastorno de apetito desenfrenado" -> {
                        """
                            El trastorno de apetito desenfrenado es un trastorno grave de la alimentación en el que sueles consumir cantidades extraordinariamente grandes de alimentos y te sientes incapaz de parar de comer.

                            Casi todos comemos de más en algunas ocasiones, por ejemplo, cuando nos servimos una segunda o una tercera porción de una comida durante las fiestas. Sin embargo, para algunas personas, comer de manera excesiva con la sensación de que se pierde el control y que esto se vuelva algo habitual pasa a ser un trastorno de apetito desenfrenado.

                            Cuando tienes el trastorno de apetito desenfrenado, puedes sentirte avergonzado por comer en exceso y prometer que vas a dejar de hacerlo. No obstante, sientes una compulsión tan fuerte que no puedes resistir la necesidad y continúas comiendo en exceso. 
                        """.trimIndent()
                    }
                    "Trastorno del sueño REM" -> {
                        """
                             El trastorno de conducta durante el sueño REM (TCSR) se caracteriza por conductas motoras vigorosas, pesadillas y la ausencia de atonía muscular durante el sueño REM. Generalmente ocurre en personas de más de 55 años. No se conoce su prevalencia en la población general, aunque podría estimarse que no es mayor del 2% en sujetos de más de 55 años. El TCSR es una parasomnia, es decir una alteración de la conducta durante el sueño. Sin embargo, los avances conseguidos durante estos últimos 10 años han demostrado que no es una simple alteración del sueño sino que en muchos casos es la primera manifestación de una enfermedad neurodegenerativa como la enfermedad de Parkinson (EP), la demencia con cuerpos de Lewy (DCL) y la atrofia multisistémica (AMS).

                        Los sueños de los pacientes con TCSR suelen tener un contenido desagradable que incluye discusiones, peleas, persecuciones, robos, ataques de animales y caídas por precipicios. En el sueño, el sujeto suele ser el agredido, puede o no reconocer las caras de sus agresores y el contexto suele estar situado en situaciones o lugares del pasado del sujeto (el pueblo de origen, el antiguo trabajo). Ocasionalmente, en el sueño hay un contenido cómico y es excepcional el sexual o alimentario. Hay algunos pacientes que niegan recordar los sueños, pero cuando se insiste alguno reconoce haber soñado alguna vez sueños de persecuciones o discusiones. Otros pacientes con TCSR refieren que nunca recuerdan lo que sueñan. Cuando se despierta a un paciente durante un episodio de TCSR puede o no recordar lo que soñaba.

                        Las conductas anormales durante el sueño suelen ser referidas por el compañero/a de cama y muchos pacientes no acudirían al médico si no fuera por lo observado por el compañero/a. Es decir, muchos pacientes refieren que duermen bien y en estos casos la historia debe hacerse con el compañero/a de cama. Los pacientes durante el sueño REM pueden gritar, gemir, sollozar, llorar, hablar (en la mayoría de ocasiones el contenido no se entiende), decir o gritar palabrotas o expresiones soeces y en ocasiones incluso pueden reír o cantar. Los movimientos suelen ser manotazos, puñetazos, patadas, y menos frecuentemente pueden dar mordiscos, incorporarse en la cama, saltar y caerse de la cama, levantarse de la cama y deambular por la habitación. No es infrecuente que al dar manotazos tiren los objetos de la mesita de noche, golpeen al acompañante lesionándole o se lesionen así mismos. Estas conductas pueden producir lesiones como hematomas, laceraciones, equimosis, incisiones, fracturas (costales, extremidades, escapulares, vertebrales) e incluso se han descrito hematomas subdurales tras caídas bruscas de la cama.
                        """.trimIndent()
                    }
                    "Trastorno del espectro autista" -> {
                        """
                            Los trastornos del espectro autista (TEA) son discapacidades del desarrollo originadas por variaciones en el cerebro. Algunas personas con TEA presentan diferencias genéticas conocidas, pero las causas exactas aún no se comprenden completamente. Se cree que los TEA resultan de diversas causas que, al interactuar, alteran las formas comunes de desarrollo en las personas. Aunque las personas con TEA pueden comportarse, comunicarse e interactuar de manera diferente a la mayoría, estas diferencias no siempre son visibles externamente. Las capacidades de las personas con TEA varían significativamente; por ejemplo, algunos tienen habilidades avanzadas de conversación, mientras que otros pueden no expresarse verbalmente. Algunas personas con TEA requieren mucha asistencia en su vida diaria, mientras que otras pueden funcionar con poca o ninguna ayuda.

                            Los TEA suelen manifestarse antes de los tres años y pueden persistir a lo largo de la vida, aunque los síntomas pueden mejorar con el tiempo. Los síntomas pueden aparecer en los primeros 12 meses de vida en algunos niños, mientras que en otros, pueden surgir más tarde, incluso después de los 24 meses. Algunos niños con TEA adquieren nuevas habilidades y cumplen con los hitos del desarrollo hasta los 18-24 meses, pero luego pueden dejar de desarrollar nuevas habilidades o perder las ya adquiridas.

                            A medida que los niños con TEA crecen, pueden enfrentar desafíos para establecer y mantener amistades, comunicarse con personas de su edad y adultos, y comprender las expectativas sociales en la escuela o el trabajo. Pueden buscar atención médica debido a condiciones adicionales como ansiedad, depresión o trastorno por déficit de atención e hiperactividad, que son más frecuentes en personas con TEA en comparación con aquellas sin este trastorno.
                        """.trimIndent()
                    }
                    "Narcolepsia" -> {
                        """
                            La narcolepsia es un trastorno del sueño que genera somnolencia durante el día. Las personas con narcolepsia pueden tener dificultad para permanecer despiertas durante mucho tiempo. Se duermen de forma repentina. Esto puede causar problemas graves en su rutina diaria.

                            A veces, la narcolepsia también puede provocar una pérdida repentina del tono muscular, conocida como cataplejia, que puede desencadenarse por emociones fuertes, en especial la risa. La narcolepsia se divide en dos tipos. La mayoría de las personas con narcolepsia tipo 1 tiene cataplejia, y la mayoría sin cataplejia tiene narcolepsia tipo 2.

                            La narcolepsia es una afección crónica que no tiene cura. Sin embargo, los medicamentos y los cambios en el estilo de vida pueden ayudar a controlar los síntomas. El apoyo de otras personas (familiares, amigos, empleadores y docentes) puede ayudar a afrontar este trastorno.
                        """.trimIndent()
                    }
                    // Agrega casos para cada opción aquí...

                    else -> ""
                }

                // Verifica si la información es vacía antes de establecerla en el cuadro de texto
                if (informacionAdicional?.isNotEmpty() == true) {
                    cuadroText.setText(informacionAdicional)
                } else {
                    cuadroText.setText("")
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // No se necesita hacer nada aquí, pero la función debe implementarse
            }
        }

        return view
    }
}
