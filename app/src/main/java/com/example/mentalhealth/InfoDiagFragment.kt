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
            "Déficit de atención e hiperactividad (TDAH)", "Depresión", "Trastorno bipolar", "Trastorno de apetito desenfrenado",
            "Trastorno del sueño REM", "Trastorno del espectro autista", "Narcolepsia",
            "Trastorno distímico", "Trastorno de ansiedad generalizada (TAG)", "Trastorno obsesivo-compulsivo (TOC)",
            "Trastorno de estrés postraumático (TEPT)", "Trastorno límite de la personalidad (TLP)", "Trastorno antisocial de la personalidad (TAP)",
            "Trastorno esquizoide de la personalidad", "Esquizofrenia", "Trastorno esquizoafectivo", "Insomnio", "Trastorno por atracón",
            "Distimia (trastorno depresivo persistente)"
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
                    "Déficit de atención e hiperactividad (TDAH)" -> {
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
                    "Trastorno distímico" -> {
                        """
                            
                            La Distimia, también conocida como Trastorno Distímico, es un trastorno del estado de ánimo crónico que se caracteriza por síntomas depresivos persistentes, aunque de menor intensidad que en el Trastorno Depresivo Mayor.
                            
                            Los síntomas suelen durar al menos dos años en adultos y un año en niños y adolescentes. Las personas con Distimia pueden experimentar cambios en el apetito, alteraciones en el sueño, baja energía y autoestima, dificultades para tomar decisiones y sentimientos de desesperanza.
                             
                             Aunque menos grave que la depresión mayor, la persistencia a largo plazo puede afectar significativamente la vida diaria. El tratamiento incluye terapia psicológica y, en algunos casos, medicamentos antidepresivos. Identificar y abordar el trastorno tempranamente es crucial para mejorar la calidad de vida.
                        """.trimIndent()
                    }
                    "Trastorno de ansiedad generalizada (TAG)" -> {
                        """
                            El Trastorno de Ansiedad Generalizada (TAG) es un trastorno mental caracterizado por una ansiedad y preocupación excesivas y persistentes en relación con diversas áreas de la vida cotidiana, como el trabajo o las relaciones interpersonales. 
                            
                            Los síntomas incluyen inquietud, fatiga, dificultad para concentrarse e irritabilidad. La ansiedad en el TAG no se limita a situaciones específicas y puede ser difícil de controlar. Para el diagnóstico, los síntomas deben persistir al menos seis meses y causar malestar significativo. 
                            
                            El tratamiento puede involucrar terapia cognitivo-conductual, medicamentos y técnicas de manejo del estrés. La intervención temprana es crucial para mejorar la calidad de vida.
                        """.trimIndent()
                    }
                    "Trastorno obsesivo-compulsivo (TOC)" -> {
                        """
                            
                            El Trastorno Obsesivo-Compulsivo (TOC) es un trastorno mental caracterizado por pensamientos recurrentes e intrusivos, llamados obsesiones, que generan ansiedad. 
                            
                            Para aliviar esta ansiedad, la persona realiza comportamientos repetitivos y ritualizados, conocidos como compulsiones. Aunque las compulsiones ofrecen alivio temporal, el ciclo obsesión-compulsión puede afectar negativamente la vida diaria. 
                            
                            El TOC puede variar en forma y gravedad. El tratamiento típicamente incluye terapia cognitivo-conductual, especialmente la exposición y prevención de respuesta, y en algunos casos, medicamentos como los inhibidores selectivos de la recaptación de serotonina (ISRS). La intervención temprana es clave para abordar y manejar los síntomas del TOC.
                        """.trimIndent()
                    }
                    "Trastorno de estrés postraumático (TEPT)" -> {
                        """
                            El Trastorno de Estrés Postraumático (TEPT) es un trastorno mental que se desarrolla después de experimentar o presenciar eventos traumáticos.
                             
                             Los síntomas persistentes incluyen recuerdos intrusivos, pesadillas, evitación de recordatorios del trauma, cambios en el estado de ánimo y hiperactivación fisiológica. 
                             
                             Puede afectar a personas que han experimentado accidentes graves, abuso, violencia o desastres naturales. El tratamiento implica terapia cognitivo-conductual, terapia de exposición y, en algunos casos, medicamentos. La intervención temprana es esencial para mejorar la calidad de vida de quienes sufren de TEPT.
                        """.trimIndent()
                    }
                    "Trastorno límite de la personalidad (TLP)" -> {
                        """
                            El Trastorno Límite de la Personalidad (TLP) es un trastorno mental caracterizado por inestabilidad en las relaciones interpersonales, la autoimagen y las emociones, así como impulsividad significativa.
                             
                             Las personas con TLP pueden experimentar miedo al abandono, tener relaciones interpersonales tumultuosas, cambios rápidos en la identidad y episodios de ira intensa. 
                             
                             El tratamiento generalmente implica terapia, especialmente la terapia dialéctica conductual, y en algunos casos, medicamentos. La intervención temprana y el apoyo continuo son cruciales para mejorar la calidad de vida de quienes tienen TLP.
                        """.trimIndent()
                    }
                    "Trastorno límite de la personalidad (TLP)" -> {
                        """
                            
                            El Trastorno Límite de la Personalidad (TLP) es un trastorno mental caracterizado por patrones de inestabilidad en las relaciones interpersonales, la autoimagen y las emociones. 
                            
                            Las personas con TLP experimentan miedo al abandono, tienen relaciones interpersonales tumultuosas, impulsividad en varias áreas y episodios de ira intensa. El tratamiento incluye terapia, especialmente la terapia dialéctica conductual, y en algunos casos, medicamentos. 
                            
                            La intervención temprana y el apoyo continuo son cruciales para mejorar la calidad de vida de quienes tienen TLP.
                        """.trimIndent()
                    }
                    "Trastorno antisocial de la personalidad (TAP)" -> {
                        """
                            El Trastorno Antisocial de la Personalidad (TAP) es un trastorno mental caracterizado por patrones persistentes de comportamiento antisocial, falta de empatía y desprecio por las normas sociales y legales. 
                            
                            Las personas con TAP muestran conductas delictivas, impulsividad, irresponsabilidad, agresión y carecen de remordimientos por sus acciones. Este trastorno generalmente se manifiesta en la adolescencia o adultez temprana y puede persistir a lo largo del tiempo.
                             
                             El tratamiento puede ser desafiante y a menudo incluye enfoques terapéuticos, pero la intervención temprana es crucial para la gestión y la prevención del TAP.
                        """.trimIndent()
                    }
                    "Trastorno esquizoide de la personalidad" -> {
                        """
                            
                            El Trastorno Esquizoide de la Personalidad (TEP) es un trastorno de la personalidad caracterizado por patrones duraderos de desapego social y emocional. Las personas con TEP tienden a ser distantes, frías y muestran una limitada expresión emocional. Prefieren actividades solitarias, tienen dificultades para establecer relaciones íntimas y muestran poca motivación en contextos sociales. 
                            
                            Aunque comparte algunos rasgos con la esquizofrenia, las personas con TEP no experimentan distorsiones de la realidad. El trastorno se manifiesta en la adultez temprana y puede afectar el funcionamiento social y laboral.
                             
                             El tratamiento, que puede incluir terapia cognitivo-conductual, se centra en abordar las dificultades emocionales e interpersonales. La evaluación y orientación de profesionales de la salud mental son esenciales.
                        """.trimIndent()
                    }
                    "Esquizofrenia" -> {
                        """
                            
                            La esquizofrenia es un trastorno mental grave que afecta el pensamiento, las emociones y el comportamiento de una persona. Se caracteriza por síntomas psicóticos, como alucinaciones y delirios, junto con dificultades en la organización del pensamiento y cambios en la motivación. 
                            
                            Suele manifestarse en la adolescencia o adultez temprana y puede impactar significativamente el funcionamiento social y laboral. Aunque las causas exactas no son completamente comprendidas, se cree que factores genéticos, biológicos y ambientales contribuyen al desarrollo de la esquizofrenia. 
                            
                            El tratamiento implica medicamentos antipsicóticos, terapia psicológica y apoyo social. La gestión a largo plazo generalmente requiere un enfoque integral que involucre a profesionales de la salud mental, familiares y amigos.
                        """.trimIndent()
                    }
                    "Trastorno esquizoafectivo" -> {
                        """
                            El Trastorno Esquizoafectivo es una condición mental que combina síntomas de la esquizofrenia con episodios afectivos, como manía o depresión. Las personas afectadas experimentan episodios psicóticos, como delirios o alucinaciones, al mismo tiempo que experimentan cambios en el estado de ánimo característicos de trastornos afectivos. 
                            
                            Los tratamientos comunes incluyen medicamentos antipsicóticos y estabilizadores del estado de ánimo, junto con terapia psicológica. La gestión a largo plazo implica abordar tanto los síntomas psicóticos como los afectivos.
                        """.trimIndent()
                    }
                    "Insomnio" -> {
                        """
                            El insomnio es un trastorno del sueño caracterizado por la dificultad para conciliar el sueño, permanecer dormido o lograr un sueño reparador, a pesar de tener las condiciones adecuadas para dormir. 
                            
                            Puede ser causado por diversos factores como el estrés, la ansiedad o hábitos de sueño inadecuados. El impacto del insomnio incluye problemas de energía, estado de ánimo y rendimiento diurno. 
                            
                            El tratamiento puede implicar cambios en el estilo de vida, terapia cognitivo-conductual y, en algunos casos, medicamentos. Identificar y abordar las causas subyacentes es crucial para gestionar el insomnio eficazmente.
                        """.trimIndent()
                    }
                    "Trastorno por atracón" -> {
                        """
                            El Trastorno por Atracón es un trastorno de la alimentación caracterizado por episodios recurrentes de ingesta excesiva de alimentos en un corto período de tiempo, con una sensación de falta de control.
                             
                            A diferencia de la bulimia nerviosa, no se asocia con comportamientos de purga. Las personas afectadas suelen experimentar sentimientos intensos de culpa o vergüenza después de los episodios de atracón. 
                            
                            El tratamiento puede incluir terapia cognitivo-conductual, terapia interpersonal y asesoramiento nutricional, y la atención temprana es crucial para abordar el trastorno y sus impactos en la salud.
                        """.trimIndent()
                    }
                    "Distimia (trastorno depresivo persistente)" -> {
                        """
                            La Distimia, también llamada Trastorno Depresivo Persistente, es un trastorno del estado de ánimo caracterizado por síntomas depresivos crónicos y persistentes que duran al menos dos años en adultos y un año en niños y adolescentes. 
                            
                            Aunque los síntomas son menos intensos que en la depresión mayor, la persistencia a largo plazo puede afectar significativamente la calidad de vida.
                             
                             El tratamiento incluye terapia psicológica, como la cognitivo-conductual, y en algunos casos, medicamentos antidepresivos. La detección temprana y la intervención son fundamentales para abordar este trastorno del estado de ánimo crónico.
                        """.trimIndent()
                    }
                    // Agrega casos para cada opción aquí...

                    else -> ""
                }

                // Verifica si la información es vacía antes de establecerla en el cuadro de texto
                if (informacionAdicional?.isNotEmpty() == true) {
                    cuadroText.setText(informacionAdicional)
                } else {
                    cuadroText.setText("No hay información disponible")
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // No se necesita hacer nada aquí, pero la función debe implementarse
            }
        }

        return view
    }

}
