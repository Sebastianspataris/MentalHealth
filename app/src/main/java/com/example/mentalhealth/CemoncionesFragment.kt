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

class CemoncionesFragment : Fragment() {

    private lateinit var spinner5: Spinner
    private lateinit var emocionesText: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_cemonciones, container, false)

        spinner5 = view.findViewById(R.id.spinner5)
        emocionesText = view.findViewById(R.id.emocionesText)

        val opciones = arrayOf(
            "¿Como te sientes el dia de hoy?",
            "Felicidad",
            "Tristeza",
            "Miedo",
            "Ira",
            "Asco",
            "Sorpresa",
            "Vergüenza",
            "Culpa",
            "Envidia",
            "Gratitud"
        )

        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, opciones)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner5.adapter = adapter

        spinner5.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val opcionSeleccionada = opciones[position]
                val informacionAdicional = when (opcionSeleccionada) {
                    "Felicidad" -> {
                        """
                            Definición:
                             La felicidad es una emoción positiva y placentera que surge cuando experimentamos situaciones o eventos que percibimos como gratificantes, satisfactorios o alegres. Puede manifestarse a través de la risa, la sonrisa y una sensación general de bienestar.
                            Pequeños consejos:
                             - Establece metas realistas y alcanzables que te motiven.
                             - Celebrar los logros, incluso los pequeños, puede generar una sensación de satisfacción.
                             - La actividad física libera endorfinas, que son conocidas como las "hormonas de la felicidad".
                             - Comparte momentos alegres con las personas que te rodean.
                             - Dedica tiempo a la meditación o a la atención plena para reducir el estrés y aumentar la serenidad.
                        """.trimIndent()
                    }
                    "Tristeza" -> {
                        """
                            Definición:
                            La tristeza es una emoción asociada a la pérdida, la decepción o la falta de satisfacción. Puede expresarse de diversas formas, como llanto, melancolía o desánimo. La tristeza es una respuesta natural a eventos difíciles y puede contribuir a la reflexión y al proceso de curación.
                            Pequeños consejos:
                            - Acepta y reconoce tus emociones de tristeza sin juzgarte. Es normal sentir tristeza en ciertos momentos.
                            - Comparte tus sentimientos con amigos cercanos, familiares o un terapeuta. El acto de expresar tus emociones puede aliviar la carga emocional.
                            - Participa en actividades que normalmente disfrutas, incluso si al principio no te sientes motivado. Esto puede ayudar a cambiar tu estado de ánimo.
                            - Aunque puedas estar pasando por un momento difícil, intenta encontrar cosas pequeñas por las que sentir gratitud.
                            - Si la tristeza persiste o afecta tu vida diaria, considera buscar la ayuda de un profesional de la salud mental.
                        """.trimIndent()
                    }
                    "Miedo" -> {
                        """
                            Definición:
                             El miedo es una emoción que surge como respuesta a una amenaza percibida. Puede manifestarse como una sensación de ansiedad, nerviosismo o terror. El miedo desencadena respuestas fisiológicas y conductuales destinadas a protegerse del peligro.
                             Pequeños consejos:
                             - Dedica tiempo para cuidar de ti mismo. El autocuidado, ya sea a través de actividades relajantes o de disfrute, puede ayudar a reducir el miedo.
                             - Mantener rutinas y estructuras en tu vida diaria puede proporcionar un sentido de seguridad y previsibilidad.
                             - Si el miedo interfiere significativamente en tu vida diaria, considera buscar la ayuda de un profesional de la salud mental.
                             - La información puede ser una herramienta poderosa. Aprender más sobre lo que temes puede ayudarte a entender y manejar esos temores.
                             - Crea rituales o prácticas que te hagan sentir seguro y protegido. Esto puede proporcionar consuelo en momentos de miedo.
                        """.trimIndent()
                    }
                    "Ira" -> {
                        """
                            Definicion:
                            La ira es una emoción que surge cuando percibimos una injusticia, una frustración o una amenaza. Puede manifestarse como enojo, irritación o furia. La ira puede motivar la acción y la resolución de problemas, pero también debe gestionarse para evitar consecuencias negativas.
                            Pequeños consejos:
                            - Trata de ponerte en el lugar de la otra persona. La empatía puede ayudarte a entender mejor las situaciones y reducir la intensidad de la ira.
                            - Enfócate en encontrar soluciones en lugar de buscar culpables. Esto puede ayudarte a canalizar la energía de la ira hacia acciones positivas.
                            - Antes de reaccionar, toma respiraciones profundas y lentas para calmarte. Esto puede ayudarte a ganar claridad antes de tomar decisiones impulsivas.
                            - Trata de entender por qué te sientes enojado. Identificar la fuente de la ira puede ayudarte a abordarla de manera más efectiva.
                            - Aceptar que sientes ira es el primer paso. No te juzgues por tener esta emoción; es natural sentir ira en determinadas situaciones.
                        """.trimIndent()
                    }
                    "Asco" -> {
                        """
                          Definición:
                           El asco es una emoción que experimentamos ante estímulos desagradables o repulsivos. Puede manifestarse físicamente, como una sensación de náuseas. El asco puede tener un papel protector al evitar la exposición a sustancias dañinas o contaminantes.
                           Pequeños consejos:
                           - Trabaja en desarrollar la tolerancia hacia aquellas cosas que te generan asco. A veces, la exposición gradual puede ayudar a cambiar las respuestas emocionales.
                           - Si es posible, enfrenta las fuentes de asco de manera gradual. Esto puede ayudarte a desensibilizarte y a manejar mejor la emoción.
                           - Trata de entender por qué sientes asco. Identificar la fuente específica puede ayudarte a abordar y comprender mejor tus emociones.
                           - Aprende a establecer límites saludables para protegerte de situaciones que puedan generar sentimientos de asco.
                           - Si sientes que los sentimientos de asco son intensos o interfieren significativamente en tu vida diaria, considera buscar la ayuda de un profesional de la salud mental.
                      """.trimIndent()
                    }
                    "Sorpresa" -> {
                        """
                            Definición:
                            La sorpresa es una emoción que surge cuando nos enfrentamos a algo inesperado o desconocido. Puede ir acompañada de una reacción fisiológica, como abrir los ojos ampliamente. La sorpresa puede prepararnos para procesar y adaptarnos a nuevas situaciones.
                            Pequeños consejos:
                            - Mantén una actitud abierta y flexible frente a las sorpresas. A veces, lo inesperado puede ser una oportunidad para el crecimiento personal.
                            - Vive el momento y disfruta de la sensación de asombro que acompaña a la sorpresa. Practica la atención plena para estar presente.
                            - Celebra las sorpresas positivas. Agradécelas y comparte la alegría con los demás.
                            - Desarrolla un sentido del humor y trata de ver lo cómico en las sorpresas inesperadas.
                            - Enfrenta las sorpresas negativas como oportunidades de aprendizaje. Reflexiona sobre cómo puedes crecer a partir de esas experiencias.
                        """.trimIndent()
                    }
                    "Vergüenza" -> {
                        """
                            Definición:
                            La vergüenza es un sentimiento incómodo y doloroso de conciencia de haber cometido un error, una falta o de haber violado normas sociales. Puede estar acompañada de una sensación de exposición y deseo de ocultarse.
                            Pequeños consejos:
                            - Trata de cambiar tu perspectiva sobre la vergüenza. En lugar de verla como un reflejo de tu valía, considérala como una señal de que eres humano y estás en constante crecimiento.
                            - Aprende a ser vulnerable y a compartir tus experiencias con otros. La conexión emocional puede surgir cuando compartes tus sentimientos de vergüenza de manera auténtica.
                            - Si la vergüenza está relacionada con situaciones específicas, enfrenta esas situaciones gradualmente para desensibilizarte y construir confianza.
                            - Trabaja en cambiar el diálogo interno negativo. Reemplaza pensamientos críticos por afirmaciones positivas y constructivas.
                            - Sé compasivo contigo mismo. En lugar de autocrítica, practica la autocompasión y reconoce que todos cometemos errores.
                        """.trimIndent()
                    }
                    "Culpa" -> {
                        """
                           Definición:
                            La culpa es un sentimiento de responsabilidad o remordimiento por haber hecho algo incorrecto o por no haber actuado de una manera que se considera adecuada. Puede impulsar a las personas a corregir su comportamiento y reparar las relaciones.
                            Pequeños consejos:
                            - Utiliza la culpa como una oportunidad para aprender y crecer. Reflexiona sobre la situación y considera cómo puedes evitar acciones similares en el futuro.
                            - Si es posible, busca maneras de compensar o corregir las acciones que te hacen sentir culpable. Realizar acciones positivas puede ayudar a contrarrestar la culpa.
                            - Reconoce que todos cometemos errores. Haz las paces con tus acciones pasadas y trabaja en perdonarte a ti mismo.
                            - Si tu culpa está relacionada con las acciones hacia otra persona, considera hablar con ella. Comunicarte de manera honesta puede ser el primer paso para la reconciliación.
                            - Si te sientes culpable por no cumplir con ciertas responsabilidades, aprende a delegar tareas y a pedir ayuda cuando sea necesario.
                            - Si la culpa está relacionada con patrones de comportamiento, trabaja en cambiar esas conductas de manera proactiva. Busca ayuda si es necesario.
                       """.trimIndent()
                    }
                    "Envidia" -> {
                        """
                            Definición:
                             La envidia es un sentimiento de deseo por las posesiones, logros o cualidades de otra persona. Puede ir acompañada de tristeza, resentimiento o incluso admiración. La envidia puede actuar como una motivación para mejorar, pero también puede causar malestar.
                             Pequeños consejos:
                             - Utiliza la envidia como una fuente de inspiración. En lugar de sentirte resentido, busca aprender de aquellos a quienes envidias y utiliza esa inspiración para mejorar tus propias habilidades o situaciones.
                             - Celebra tus propios logros y éxitos. En lugar de compararte constantemente con los demás, reconoce tus logros y avances personales.
                             - Trabaja en desarrollar la empatía hacia aquellos a quienes envidias. Entender sus desafíos y esfuerzos puede suavizar los sentimientos de envidia.
                             - Si las redes sociales o situaciones específicas aumentan tus sentimientos de envidia, considera desconectarte temporalmente o reducir la exposición.
                             - Habla con amigos cercanos o seres queridos sobre tus sentimientos de envidia. La apertura y el apoyo social pueden ayudarte a procesar estas emociones.
                        """.trimIndent()
                    }
                    "Gratitud" -> {
                        """
                            Definición:
                             La gratitud es un sentimiento de aprecio y agradecimiento hacia alguien o algo. Surge cuando reconocemos y valoramos los actos positivos, regalos, favores u otras experiencias que hemos recibido. La gratitud puede contribuir al bienestar emocional y fortalecer las relaciones interpersonales.
                            Pequeños consejos: 
                            - Realiza actos de bondad hacia los demás. La generosidad y la ayuda pueden generar sentimientos de gratitud tanto en quien da como en quien recibe.
                            - Incluso en situaciones difíciles, busca lecciones y oportunidades de crecimiento. Aprender a encontrar gratitud en los desafíos puede cambiar la perspectiva.
                            - Dedica tiempo a reflexionar sobre tus propios logros y éxitos. Agradécete a ti mismo por tus esfuerzos y logros personales.
                            - No subestimes el poder de las pequeñas alegrías y logros. Aprende a apreciar y encontrar gratitud en los detalles cotidianos.
                            - No te quedes con tus sentimientos de gratitud; exprésalos. Ya sea verbalmente, mediante una nota o un gesto, compartir tu aprecio puede fortalecer las conexiones.
                        """.trimIndent()

                    }
                    else -> ""
                }

                // Verifica si la información es vacía antes de establecerla en el cuadro de texto
                if (informacionAdicional?.isNotEmpty() == true) {
                    emocionesText.setText(informacionAdicional)
                } else {
                    emocionesText.setText("")
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // No se necesita hacer nada aquí, pero la función debe implementarse
            }
        }

        return view
    }
}

