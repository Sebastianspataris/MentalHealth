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
            "Trifluoperazina", "Amoxapina", "Oxitriptán", "Trazodona",
            "Vilazodona", "Lisdexanfetamina", "Maprotilina", "Mianserina", "Mirtazapina",
            "Nefazodona", "Reboxetina", "Selegilina", "Amitriptilina", "Bupropión",
            "Desipramina", "Doxepina", "Imipramina", "Nortriptilina", "Trimipramina",
            "Venlafaxina", "Agomelatina", "Agomelatina", "Milnaciprán", "Clorazepato"
        )
        val efectosSecundarios = mapOf(
            "Sertralina" to """
        
        Náuseas: Puede causar malestar estomacal o náuseas, especialmente al principio del tratamiento.
        
        Insomnio o somnolencia: Algunas personas pueden experimentar dificultades para conciliar el sueño, mientras que otras pueden sentir somnolencia.
        
        Mareos: La sertralina puede causar sensación de mareo en algunas personas.
        
        Boca seca: Algunas personas pueden experimentar sequedad en la boca como efecto secundario.
       
        Problemas gastrointestinales: Pueden incluir diarrea o estreñimiento.
       
        Pérdida de apetito o aumento de peso: Puede afectar el apetito de manera diferente en cada persona.
       
        Dolor de cabeza: Algunas personas pueden experimentar dolores de cabeza como efecto secundario.
        
        Síntomas sexuales: Pueden incluir disminución del deseo sexual, dificultades para alcanzar el orgasmo o disfunción eréctil.
        
        Agitación o nerviosismo: Algunas personas pueden experimentar una sensación de agitación o nerviosismo al tomar sertralina.
       
        Síndrome de la serotonina: En casos raros, el uso de la sertralina puede llevar al síndrome de la serotonina, que es una condición potencialmente grave caracterizada por cambios en el estado mental, frecuencia cardíaca rápida, fiebre y otros síntomas. Esto generalmente ocurre cuando se toma sertralina junto con otros medicamentos que afectan la serotonina.
    """.trimIndent(),
            "Fluoxetina" to """
       
        Náuseas: Puede causar malestar estomacal o náuseas.
       
        Insomnio o somnolencia: Puede afectar el patrón de sueño, causando insomnio o somnolencia.
        
        Pérdida de apetito o aumento de peso: Puede provocar pérdida de apetito o, en algunos casos, aumento de peso.
        
        Agitación o nerviosismo: Algunas personas pueden experimentar agitación o nerviosismo como efecto secundario.
       
        Problemas gastrointestinales: Puede causar problemas gastrointestinales como diarrea.
        
        Dolor de cabeza: Algunas personas pueden experimentar dolores de cabeza al tomar fluoxetina.
       
        Síndrome serotoninérgico: En casos raros, puede causar el síndrome serotoninérgico, una reacción potencialmente grave al aumento de los niveles de serotonina.
    """.trimIndent(),
            "Citalopram" to """
       
        Náuseas: Puede causar malestar estomacal o náuseas.
       
        Insomnio o somnolencia: Algunas personas pueden experimentar dificultades para conciliar el sueño o somnolencia.
       
        Boca seca: Puede causar sequedad en la boca como efecto secundario.
       
        Problemas gastrointestinales: Pueden incluir diarrea o estreñimiento.
       
        Pérdida de apetito o aumento de peso: Puede afectar el apetito de manera diferente en cada persona.
       
        Dolor de cabeza: Algunas personas pueden experimentar dolores de cabeza como efecto secundario.
       
        Síntomas sexuales: Pueden incluir disminución del deseo sexual, dificultades para alcanzar el orgasmo o disfunción eréctil.
       
        Agitación o nerviosismo: Algunas personas pueden experimentar una sensación de agitación o nerviosismo al tomar citalopram.
        
        Síndrome serotoninérgico: En casos raros, el uso de citalopram puede llevar al síndrome serotoninérgico.
    """.trimIndent(),
            "Escitalopram" to """
        
        Náuseas: Puede causar malestar estomacal o náuseas.
        
        Insomnio o somnolencia: Algunas personas pueden experimentar dificultades para conciliar el sueño o somnolencia.
        
        Boca seca: Puede causar sequedad en la boca como efecto secundario.
        
        Problemas gastrointestinales: Pueden incluir diarrea o estreñimiento.
        
        Pérdida de apetito o aumento de peso: Puede afectar el apetito de manera diferente en cada persona.
        
        Dolor de cabeza: Algunas personas pueden experimentar dolores de cabeza como efecto secundario.
        
        Síntomas sexuales: Pueden incluir disminución del deseo sexual, dificultades para alcanzar el orgasmo o disfunción eréctil.
        
        Agitación o nerviosismo: Algunas personas pueden experimentar una sensación de agitación o nerviosismo al tomar escitalopram.
        
        Síndrome serotoninérgico: En casos raros, el uso de escitalopram puede llevar al síndrome serotoninérgico.
    """.trimIndent(),
            "Venlafaxina" to """
        Náuseas: Puede causar malestar estomacal o náuseas.
        
        Insomnio o somnolencia: Algunas personas pueden experimentar dificultades para conciliar el sueño o somnolencia.
        
        Mareos: La venlafaxina puede causar sensación de mareo en algunas personas.
        
        Boca seca: Puede causar sequedad en la boca como efecto secundario.
        
        Problemas gastrointestinales: Pueden incluir diarrea o estreñimiento.
        
        Pérdida de apetito o aumento de peso: Puede afectar el apetito de manera diferente en cada persona.
        
        Dolor de cabeza: Algunas personas pueden experimentar dolores de cabeza como efecto secundario.
        
        Síntomas sexuales: Pueden incluir disminución del deseo sexual, dificultades para alcanzar el orgasmo o disfunción eréctil.
        
        Agitación o nerviosismo: Algunas personas pueden experimentar una sensación de agitación o nerviosismo al tomar venlafaxina.
        
        Síndrome serotoninérgico: En casos raros, el uso de venlafaxina puede llevar al síndrome serotoninérgico.
    """.trimIndent(),
            "Bupropión" to """
    Náuseas: Puede causar malestar estomacal o náuseas.
    
    Insomnio: Algunas personas pueden experimentar dificultades para conciliar el sueño.
    
    Sequedad en la boca: Puede causar sequedad en la boca como efecto secundario.
    
    Mareos: El bupropión puede causar sensación de mareo en algunas personas.
    
    Agitación o nerviosismo: Algunas personas pueden experimentar una sensación de agitación o nerviosismo al tomar bupropión.
    
    Dolor de cabeza: Algunas personas pueden experimentar dolores de cabeza como efecto secundario.
    
    Pérdida de apetito: Puede provocar pérdida de apetito.
""".trimIndent(),

            "Paroxetina" to """
    Náuseas: Puede causar malestar estomacal o náuseas.
    
    Insomnio o somnolencia: Algunas personas pueden experimentar dificultades para conciliar el sueño o somnolencia.
    
    Sequedad en la boca: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir diarrea o estreñimiento.
    
    Pérdida de apetito o aumento de peso: Puede afectar el apetito de manera diferente en cada persona.
    
    Dolor de cabeza: Algunas personas pueden experimentar dolores de cabeza como efecto secundario.
    
    Síntomas sexuales: Pueden incluir disminución del deseo sexual, dificultades para alcanzar el orgasmo o disfunción eréctil.
    
    Agitación o nerviosismo: Algunas personas pueden experimentar una sensación de agitación o nerviosismo al tomar paroxetina.
    
    Síndrome serotoninérgico: En casos raros, el uso de paroxetina puede llevar al síndrome serotoninérgico.
""".trimIndent(),
            "Lorazepam" to """
    Somnolencia: Puede causar somnolencia o sedación.
    
    Mareos: El lorazepam puede causar sensación de mareo en algunas personas.
    
    Debilidad: Algunas personas pueden experimentar debilidad como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o problemas estomacales.
    
    Cambios en el apetito: Puede afectar el apetito en algunas personas.
    
    Confusión: El lorazepam puede causar confusión en algunas personas.
    
    Problemas respiratorios: En casos raros, puede afectar la respiración, especialmente en dosis altas.
    
    Visión borrosa: Algunas personas pueden experimentar visión borrosa como efecto secundario.
""".trimIndent(),

            "Alprazolam" to """
    Somnolencia: Puede causar somnolencia o sedación.
    
    Mareos: El alprazolam puede causar sensación de mareo en algunas personas.
    
    Debilidad: Algunas personas pueden experimentar debilidad como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o problemas estomacales.
    
    Cambios en el apetito: Puede afectar el apetito en algunas personas.
    
    Confusión: El alprazolam puede causar confusión en algunas personas.
    
    Problemas respiratorios: En casos raros, puede afectar la respiración, especialmente en dosis altas.
    
    Visión borrosa: Algunas personas pueden experimentar visión borrosa como efecto secundario.
""".trimIndent(),

            "Diazepam" to """
    Somnolencia: Puede causar somnolencia o sedación.
    
    Mareos: El diazepam puede causar sensación de mareo en algunas personas.
    
    Debilidad: Algunas personas pueden experimentar debilidad como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o problemas estomacales.
    
    Cambios en el apetito: Puede afectar el apetito en algunas personas.
    
    Confusión: El diazepam puede causar confusión en algunas personas.
    
    Problemas respiratorios: En casos raros, puede afectar la respiración, especialmente en dosis altas.
    
    Visión borrosa: Algunas personas pueden experimentar visión borrosa como efecto secundario.
""".trimIndent(),

            "Clonazepam" to """
    Somnolencia: Puede causar somnolencia o sedación.
    
    Mareos: El clonazepam puede causar sensación de mareo en algunas personas.
    
    Debilidad: Algunas personas pueden experimentar debilidad como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o problemas estomacales.
    
    Cambios en el apetito: Puede afectar el apetito en algunas personas.
    
    Confusión: El clonazepam puede causar confusión en algunas personas.
    
    Problemas respiratorios: En casos raros, puede afectar la respiración, especialmente en dosis altas.
    
    Visión borrosa: Algunas personas pueden experimentar visión borrosa como efecto secundario.
""".trimIndent(),

            "Lamotrigina" to """
    Mareos: Puede causar sensación de mareo.
    
    Problemas gastrointestinales: Pueden incluir náuseas, vómitos o problemas estomacales.
    
    Dolor de cabeza: La lamotrigina puede causar dolores de cabeza como efecto secundario.
    
    Insomnio: Algunas personas pueden experimentar dificultades para conciliar el sueño.
    
    Cambios en el estado de ánimo: Puede afectar el estado de ánimo en algunas personas.
    
    Problemas visuales: En casos raros, puede afectar la visión.
    
    Síntomas de la piel: La lamotrigina puede causar erupciones cutáneas en casos raros.
""".trimIndent(),

            "Litio" to """
    Temblores: Puede causar temblores en las manos o en otras partes del cuerpo.
    
    Aumento de la sed y micción: El litio puede afectar los niveles de sodio en el cuerpo.
    
    Aumento de peso: Algunas personas pueden experimentar un aumento de peso como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Problemas de tiroides: El litio puede afectar la función de la tiroides en algunas personas.
    
    Problemas renales: En casos raros, el litio puede afectar la función renal.
    
    Confusión o problemas de memoria: Algunas personas pueden experimentar confusión o problemas de memoria.
""".trimIndent(),

            "Mirtazapina" to """
    Somnolencia: Puede causar somnolencia o sedación.
    
    Aumento de peso: La mirtazapina puede provocar un aumento de peso en algunas personas.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Boca seca: Algunas personas pueden experimentar sequedad en la boca como efecto secundario.
    
    Estreñimiento: Puede causar problemas intestinales como estreñimiento.
    
    Baja presión arterial: La mirtazapina puede reducir la presión arterial en algunas personas.
    
    Síntomas de abstinencia: Se recomienda reducir gradualmente la dosis para evitar síntomas de abstinencia.
""".trimIndent(),

            "Duloxetina" to """
    Náuseas: Puede causar malestar estomacal o náuseas.
    
    Insomnio o somnolencia: Algunas personas pueden experimentar dificultades para conciliar el sueño o somnolencia.
    
    Sequedad en la boca: La duloxetina puede causar sequedad en la boca como efecto secundario.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Problemas gastrointestinales: Pueden incluir diarrea o estreñimiento.
    
    Pérdida de apetito o aumento de peso: Puede afectar el apetito de manera diferente en cada persona.
    
    Sudoración excesiva: Algunas personas pueden experimentar sudoración excesiva como efecto secundario.
""".trimIndent(),

            "Trazodona" to """
    Somnolencia: Puede causar somnolencia o sedación.
    
    Mareos: La trazodona puede causar sensación de mareo en algunas personas.
    
    Sequedad en la boca: Puede causar sequedad en la boca como efecto secundario.
    
    Visión borrosa: Algunas personas pueden experimentar visión borrosa.
    
    Estreñimiento: Puede causar problemas intestinales como estreñimiento.
    
    Baja presión arterial: La trazodona puede reducir la presión arterial en algunas personas.
    
    Problemas de sueño: Puede afectar los patrones de sueño en algunas personas.
""".trimIndent(),

            "Haloperidol" to """
    Rigidez muscular: Puede causar rigidez en los músculos.
    
    Temblores: El haloperidol puede causar temblores en las manos u otras partes del cuerpo.
    
    Inquietud o agitación: Algunas personas pueden experimentar inquietud o agitación.
    
    Problemas de sueño: Puede afectar los patrones de sueño en algunas personas.
    
    Problemas de visión: El haloperidol puede afectar la visión en algunas personas.
    
    Problemas de habla: Puede afectar el habla en algunas personas.
    
    Problemas de memoria: Algunas personas pueden experimentar problemas de memoria.
""".trimIndent(),
            "Clorpromazina" to """
    Somnolencia: Puede causar somnolencia o sedación.
    
    Mareos: La clorpromazina puede causar sensación de mareo en algunas personas.
    
    Sequedad en la boca: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas de visión: La clorpromazina puede afectar la visión en algunas personas.
    
    Problemas de movimientos: Puede causar movimientos involuntarios en algunas personas.
    
    Problemas de sueño: Puede afectar los patrones de sueño en algunas personas.
    
    Problemas de habla: Puede afectar el habla en algunas personas.
""".trimIndent(),

            "Lurasidona" to """
    Somnolencia: Puede causar somnolencia o sedación.
    
    Mareos: La lurasidona puede causar sensación de mareo en algunas personas.
    
    Sequedad en la boca: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas de visión: La lurasidona puede afectar la visión en algunas personas.
    
    Aumento de peso: Algunas personas pueden experimentar un aumento de peso como efecto secundario.
    
    Problemas de sueño: Puede afectar los patrones de sueño en algunas personas.
    
    Problemas de movimientos: Puede causar movimientos involuntarios en algunas personas.
""".trimIndent(),

            "Trifluoperazina" to """
    Somnolencia: Puede causar somnolencia o sedación.
    
    Mareos: La trifluoperazina puede causar sensación de mareo en algunas personas.
    
    Sequedad en la boca: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas de visión: La trifluoperazina puede afectar la visión en algunas personas.
    
    Problemas de movimientos: Puede causar movimientos involuntarios en algunas personas.
    
    Problemas de sueño: Puede afectar los patrones de sueño en algunas personas.
    
    Problemas de habla: Puede afectar el habla en algunas personas.
""".trimIndent(),

            "Valproato" to """
    Problemas gastrointestinales: Pueden incluir náuseas, vómitos o problemas estomacales.
    
    Temblores: El valproato puede causar temblores en las manos u otras partes del cuerpo.
    
    Problemas de sueño: Puede afectar los patrones de sueño en algunas personas.
    
    Aumento de peso: Algunas personas pueden experimentar un aumento de peso como efecto secundario.
    
    Problemas de hígado: El valproato puede afectar la función hepática en algunas personas.
    
    Cambios en el apetito: Puede afectar el apetito en algunas personas.
    
    Cambios en el cabello: En casos raros, puede causar cambios en la textura del cabello.
""".trimIndent(),
            "Carbamazepina" to """
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Somnolencia: La carbamazepina puede causar somnolencia o sedación.
    
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Problemas de coordinación: Puede afectar la coordinación en algunas personas.
    
    Problemas de hígado: La carbamazepina puede afectar la función hepática en algunas personas.
    
    Cambios en la visión: Puede afectar la visión en algunas personas.
    
    Problemas sanguíneos: En casos raros, puede afectar la producción de células sanguíneas.
""".trimIndent(),

            "Tioridazina" to """
    Problemas cardíacos: La tioridazina puede afectar el ritmo cardíaco en algunas personas.
    
    Problemas de visión: Puede causar problemas de visión, especialmente a dosis elevadas.
    
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Problemas de sueño: La tioridazina puede afectar los patrones de sueño en algunas personas.
    
    Sequedad en la boca: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas de movimientos: Puede causar movimientos involuntarios en algunas personas.
""".trimIndent(),

            "Perfenazina" to """
    Problemas de movimientos: La perfenazina puede causar movimientos involuntarios.
    
    Problemas de sueño: Puede afectar los patrones de sueño en algunas personas.
    
    Sequedad en la boca: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Problemas de visión: La perfenazina puede afectar la visión en algunas personas.
    
    Problemas cardíacos: En casos raros, puede afectar el ritmo cardíaco.
""".trimIndent(),

            "Flufenazina" to """
    Problemas de movimientos: La flufenazina puede causar movimientos involuntarios.
    
    Sequedad en la boca: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Problemas de sueño: Puede afectar los patrones de sueño en algunas personas.
    
    Problemas de visión: La flufenazina puede afectar la visión en algunas personas.
    
    Problemas cardíacos: En casos raros, puede afectar el ritmo cardíaco.
""".trimIndent(),

            "Topiramato" to """
    Problemas gastrointestinales: Pueden incluir náuseas, diarrea o molestias estomacales.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Problemas de memoria: El topiramato puede afectar la memoria en algunas personas.
    
    Problemas de coordinación: Puede afectar la coordinación en algunas personas.
    
    Problemas de visión: Puede causar problemas de visión, especialmente visión borrosa.
    
    Pérdida de apetito o aumento de peso: Puede afectar el apetito de manera diferente en cada persona.
    
    Cambios en el gusto: El topiramato puede causar cambios en la percepción del gusto.
""".trimIndent(),

            "Ziprasidona" to """
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Somnolencia: La ziprasidona puede causar somnolencia o sedación.
    
    Problemas de movimientos: Puede causar movimientos involuntarios en algunas personas.
    
    Problemas de sueño: Puede afectar los patrones de sueño en algunas personas.
    
    Problemas cardíacos: La ziprasidona puede afectar el ritmo cardíaco en algunas personas.
    
    Sequedad en la boca: Puede causar sequedad en la boca como efecto secundario.
""".trimIndent(),

            "Amisulprida" to """
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Mareos: La amisulprida puede causar sensación de mareo en algunas personas.
    
    Problemas de movimientos: Puede causar movimientos involuntarios en algunas personas.
    
    Problemas de sueño: Puede afectar los patrones de sueño en algunas personas.
    
    Aumento de prolactina: La amisulprida puede aumentar los niveles de prolactina en la sangre.
    
    Sequedad en la boca: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas de ansiedad: En algunas personas, puede aumentar la ansiedad.
""".trimIndent(),

            "Haloperidol decanoato" to """
    Problemas de movimientos: El haloperidol decanoato puede causar movimientos involuntarios.
    
    Problemas de sueño: Puede afectar los patrones de sueño en algunas personas.
    
    Sequedad en la boca: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Problemas cardíacos: En casos raros, puede afectar el ritmo cardíaco.
    
    Problemas de memoria: Algunas personas pueden experimentar problemas de memoria.
""".trimIndent(),

            "Nortriptilina" to """
    Somnolencia: Puede causar somnolencia o sedación.
    
    Mareos: La nortriptilina puede causar sensación de mareo en algunas personas.
    
    Boca seca: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Problemas de sueño: Puede afectar los patrones de sueño en algunas personas.
    
    Problemas de visión: La nortriptilina puede afectar la visión en algunas personas.
    
    Problemas de movimientos: Puede causar movimientos involuntarios en algunas personas.
""".trimIndent(),
            "Desipramina" to """
    Somnolencia: Puede causar somnolencia o sedación.
    
    Mareos: La desipramina puede causar sensación de mareo en algunas personas.
    
    Boca seca: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Problemas de sueño: Puede afectar los patrones de sueño en algunas personas.
    
    Problemas de visión: La desipramina puede afectar la visión en algunas personas.
    
    Problemas de movimientos: Puede causar movimientos involuntarios en algunas personas.
""".trimIndent(),

            "Imipramina" to """
    Somnolencia: Puede causar somnolencia o sedación.
    
    Mareos: La imipramina puede causar sensación de mareo en algunas personas.
    
    Boca seca: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Problemas de sueño: Puede afectar los patrones de sueño en algunas personas.
    
    Problemas de visión: La imipramina puede afectar la visión en algunas personas.
    
    Problemas de movimientos: Puede causar movimientos involuntarios en algunas personas.
""".trimIndent(),

            "Amitriptilina" to """
    Somnolencia: Puede causar somnolencia o sedación.
    
    Mareos: La amitriptilina puede causar sensación de mareo en algunas personas.
    
    Boca seca: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Problemas de sueño: Puede afectar los patrones de sueño en algunas personas.
    
    Problemas de visión: La amitriptilina puede afectar la visión en algunas personas.
    
    Problemas de movimientos: Puede causar movimientos involuntarios en algunas personas.
""".trimIndent(),

            "Maprotilina" to """
    Somnolencia: Puede causar somnolencia o sedación.
    
    Mareos: La maprotilina puede causar sensación de mareo en algunas personas.
    
    Boca seca: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Problemas de sueño: Puede afectar los patrones de sueño en algunas personas.
    
    Problemas de visión: La maprotilina puede afectar la visión en algunas personas.
    
    Problemas de movimientos: Puede causar movimientos involuntarios en algunas personas.
""".trimIndent(),

            "Clomipramina" to """
    Somnolencia: Puede causar somnolencia o sedación.
    
    Mareos: La clomipramina puede causar sensación de mareo en algunas personas.
    
    Boca seca: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Problemas de sueño: Puede afectar los patrones de sueño en algunas personas.
    
    Problemas de visión: La clomipramina puede afectar la visión en algunas personas.
    
    Problemas de movimientos: Puede causar movimientos involuntarios en algunas personas.
""".trimIndent(),

            "Trimipramina" to """
    Somnolencia: Puede causar somnolencia o sedación.
    
    Mareos: La trimipramina puede causar sensación de mareo en algunas personas.
    
    Boca seca: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Problemas de sueño: Puede afectar los patrones de sueño en algunas personas.
    
    Problemas de visión: La trimipramina puede afectar la visión en algunas personas.
    
    Problemas de movimientos: Puede causar movimientos involuntarios en algunas personas.
""".trimIndent(),

            "Doxepina" to """
    Somnolencia: Puede causar somnolencia o sedación.
    
    Mareos: La doxepina puede causar sensación de mareo en algunas personas.
    
    Boca seca: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Problemas de sueño: Puede afectar los patrones de sueño en algunas personas.
    
    Problemas de visión: La doxepina puede afectar la visión en algunas personas.
    
    Problemas de movimientos: Puede causar movimientos involuntarios en algunas personas.
""".trimIndent(),

            "Metilfenidato" to """
    Pérdida de apetito: El metilfenidato puede causar pérdida de apetito en algunas personas.
    
    Insomnio: Puede causar dificultades para conciliar el sueño.
    
    Nerviosismo: Algunas personas pueden experimentar nerviosismo como efecto secundario.
    
    Mareos: El metilfenidato puede causar sensación de mareo en algunas personas.
    
    Dolor de cabeza: Algunas personas pueden experimentar dolores de cabeza como efecto secundario.
    
    Aumento de la presión arterial: En algunas personas, el metilfenidato puede aumentar la presión arterial.
    
    Problemas gastrointestinales: Pueden incluir náuseas o malestar estomacal.
    
    Sudoración excesiva: Algunas personas pueden experimentar sudoración excesiva como efecto secundario.
    
    Cambios en el estado de ánimo: Puede afectar el estado de ánimo en algunas personas.
    
    Cambios en el apetito: El metilfenidato puede afectar el apetito en algunas personas.
""".trimIndent(),

            "Atomoxetina" to """
    Náuseas: La atomoxetina puede causar malestar estomacal o náuseas.
    
    Insomnio: Puede causar dificultades para conciliar el sueño.
    
    Mareos: La atomoxetina puede causar sensación de mareo en algunas personas.
    
    Cambios en el apetito: Puede afectar el apetito de manera diferente en cada persona.
    
    Fatiga: Algunas personas pueden experimentar fatiga como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal o problemas intestinales.
    
    Cambios en la presión arterial: La atomoxetina puede afectar la presión arterial en algunas personas.
    
    Problemas sexuales: Puede causar disfunción sexual en algunas personas.
    
    Irritabilidad: Algunas personas pueden experimentar irritabilidad como efecto secundario.
    
    Sudoración excesiva: La atomoxetina puede causar sudoración excesiva en algunas personas.
""".trimIndent(),
            "Lisdexanfetamina" to """
    Pérdida de apetito: La lisdexanfetamina puede causar pérdida de apetito en algunas personas.
    
    Insomnio: Puede causar dificultades para conciliar el sueño.
    
    Mareos: La lisdexanfetamina puede causar sensación de mareo en algunas personas.
    
    Aumento de la presión arterial: En algunas personas, la lisdexanfetamina puede aumentar la presión arterial.
    
    Problemas gastrointestinales: Pueden incluir náuseas o malestar estomacal.
    
    Cambios en el estado de ánimo: Puede afectar el estado de ánimo en algunas personas.
    
    Sudoración excesiva: Algunas personas pueden experimentar sudoración excesiva como efecto secundario.
    
    Cambios en el apetito: La lisdexanfetamina puede afectar el apetito en algunas personas.
    
    Dolor de cabeza: Algunas personas pueden experimentar dolores de cabeza como efecto secundario.
    
    Boca seca: La lisdexanfetamina puede causar sequedad en la boca.
    
    Irritabilidad: Algunas personas pueden experimentar irritabilidad como efecto secundario.
    
    Problemas sexuales: Puede causar disfunción sexual en algunas personas.
    
    Fatiga: La lisdexanfetamina puede causar fatiga en algunas personas.
    
    Taquicardia: En algunas personas, la lisdexanfetamina puede aumentar la frecuencia cardíaca.
    
    Problemas respiratorios: Puede afectar la respiración en algunas personas.
    
    Cambios en la visión: La lisdexanfetamina puede afectar la visión en algunas personas.
    
    Mareos al ponerse de pie: Algunas personas pueden experimentar mareos al levantarse.
    
    Temblores: Puede causar temblores en algunas personas.
    
    Cambios en la libido: La lisdexanfetamina puede afectar la libido en algunas personas.
    
    Problemas urinarios: Pueden incluir dificultades para orinar o cambios en la micción.
""".trimIndent(),

            "Modafinilo" to """
    Insomnio: El modafinilo puede causar dificultades para conciliar el sueño.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Boca seca: El modafinilo puede causar sequedad en la boca como efecto secundario.
    
    Náuseas: Algunas personas pueden experimentar malestar estomacal o náuseas.
    
    Dolor de cabeza: Puede causar dolores de cabeza en algunas personas.
    
    Taquicardia: En algunas personas, el modafinilo puede aumentar la frecuencia cardíaca.
    
    Problemas gastrointestinales: Pueden incluir náuseas, malestar estomacal o diarrea.
    
    Ansiedad: El modafinilo puede aumentar los niveles de ansiedad en algunas personas.
    
    Problemas de visión: Puede afectar la visión en algunas personas.
    
    Cambios en la presión arterial: El modafinilo puede afectar la presión arterial en algunas personas.
    
    Problemas respiratorios: Puede causar dificultades respiratorias en algunas personas.
    
    Sudoración excesiva: Algunas personas pueden experimentar sudoración excesiva como efecto secundario.
    
    Mareos al ponerse de pie: Puede causar mareos al levantarse en algunas personas.
    
    Problemas hepáticos: El modafinilo puede afectar la función hepática en algunas personas.
    
    Cambios en el apetito: Puede afectar el apetito de manera diferente en cada persona.
    
    Problemas psiquiátricos: Puede aumentar el riesgo de problemas psiquiátricos en algunas personas.
    
    Problemas cutáneos: Pueden incluir erupciones cutáneas o problemas en la piel.
    
    Problemas renales: El modafinilo puede afectar la función renal en algunas personas.
    
    Cambios en el estado de ánimo: Puede afectar el estado de ánimo en algunas personas.
    
    Problemas sexuales: Puede causar disfunción sexual en algunas personas.
""".trimIndent(),

            "Escitalopram" to """
    Náuseas: Puede causar malestar estomacal o náuseas.
    
    Insomnio o somnolencia: Algunas personas pueden experimentar dificultades para conciliar el sueño o somnolencia.
    
    Boca seca: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir diarrea o estreñimiento.
    
    Pérdida de apetito o aumento de peso: Puede afectar el apetito de manera diferente en cada persona.
    
    Dolor de cabeza: Algunas personas pueden experimentar dolores de cabeza como efecto secundario.
    
    Síntomas sexuales: Pueden incluir disminución del deseo sexual, dificultades para alcanzar el orgasmo o disfunción eréctil.
    
    Agitación o nerviosismo: Algunas personas pueden experimentar una sensación de agitación o nerviosismo al tomar escitalopram.
    
    Síndrome serotoninérgico: En casos raros, el uso de escitalopram puede llevar al síndrome serotoninérgico.
""".trimIndent(),

            "Atomoxetina" to """
    Náuseas: La atomoxetina puede causar malestar estomacal o náuseas.
    
    Insomnio o somnolencia: Algunas personas pueden experimentar dificultades para conciliar el sueño o somnolencia.
    
    Boca seca: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir diarrea o estreñimiento.
    
    Pérdida de apetito o aumento de peso: Puede afectar el apetito de manera diferente en cada persona.
    
    Dolor de cabeza: Algunas personas pueden experimentar dolores de cabeza como efecto secundario.
    
    Síntomas sexuales: Pueden incluir disminución del deseo sexual, dificultades para alcanzar el orgasmo o disfunción eréctil.
    
    Agitación o nerviosismo: Algunas personas pueden experimentar una sensación de agitación o nerviosismo al tomar atomoxetina.
    
    Síndrome serotoninérgico: En casos raros, el uso de atomoxetina puede llevar al síndrome serotoninérgico.
""".trimIndent(),

            "Vortioxetina" to """
    Náuseas: Puede causar malestar estomacal o náuseas.
    
    Insomnio o somnolencia: Algunas personas pueden experimentar dificultades para conciliar el sueño o somnolencia.
    
    Boca seca: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir diarrea o estreñimiento.
    
    Pérdida de apetito o aumento de peso: Puede afectar el apetito de manera diferente en cada persona.
    
    Dolor de cabeza: Algunas personas pueden experimentar dolores de cabeza como efecto secundario.
    
    Síntomas sexuales: Pueden incluir disminución del deseo sexual, dificultades para alcanzar el orgasmo o disfunción eréctil.
    
    Agitación o nerviosismo: Algunas personas pueden experimentar una sensación de agitación o nerviosismo al tomar vortioxetina.
    
    Síndrome serotoninérgico: En casos raros, el uso de vortioxetina puede llevar al síndrome serotoninérgico.
""".trimIndent(),

            "Aripiprazol" to """
    Náuseas: Puede causar malestar estomacal o náuseas.
    
    Insomnio o somnolencia: Algunas personas pueden experimentar dificultades para conciliar el sueño o somnolencia.
    
    Mareos: El aripiprazol puede causar sensación de mareo en algunas personas.
    
    Boca seca: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir diarrea o estreñimiento.
    
    Pérdida de apetito o aumento de peso: Puede afectar el apetito de manera diferente en cada persona.
    
    Dolor de cabeza: Algunas personas pueden experimentar dolores de cabeza como efecto secundario.
    
    Síntomas sexuales: Pueden incluir disminución del deseo sexual, dificultades para alcanzar el orgasmo o disfunción eréctil.
    
    Agitación o nerviosismo: Algunas personas pueden experimentar una sensación de agitación o nerviosismo al tomar aripiprazol.
    
    Síndrome serotoninérgico: En casos raros, el uso de aripiprazol puede llevar al síndrome serotoninérgico.
""".trimIndent(),

            "Asenapina" to """
    Náuseas: Puede causar malestar estomacal o náuseas.
    
    Insomnio o somnolencia: Algunas personas pueden experimentar dificultades para conciliar el sueño o somnolencia.
    
    Mareos: La asenapina puede causar sensación de mareo en algunas personas.
    
    Boca seca: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir diarrea o estreñimiento.
    
    Pérdida de apetito o aumento de peso: Puede afectar el apetito de manera diferente en cada persona.
    
    Dolor de cabeza: Algunas personas pueden experimentar dolores de cabeza como efecto secundario.
    
    Síntomas sexuales: Pueden incluir disminución del deseo sexual, dificultades para alcanzar el orgasmo o disfunción eréctil.
    
    Agitación o nerviosismo: Algunas personas pueden experimentar una sensación de agitación o nerviosismo al tomar asenapina.
    
    Síndrome serotoninérgico: En casos raros, el uso de asenapina puede llevar al síndrome serotoninérgico.
""".trimIndent(),

            "Brexpiprazol" to """
    Náuseas: Puede causar malestar estomacal o náuseas.
    
    Insomnio o somnolencia: Algunas personas pueden experimentar dificultades para conciliar el sueño o somnolencia.
    
    Mareos: El brexpiprazol puede causar sensación de mareo en algunas personas.
    
    Boca seca: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir diarrea o estreñimiento.
    
    Pérdida de apetito o aumento de peso: Puede afectar el apetito de manera diferente en cada persona.
    
    Dolor de cabeza: Algunas personas pueden experimentar dolores de cabeza como efecto secundario.
    
    Síntomas sexuales: Pueden incluir disminución del deseo sexual, dificultades para alcanzar el orgasmo o disfunción eréctil.
    
    Agitación o nerviosismo: Algunas personas pueden experimentar una sensación de agitación o nerviosismo al tomar brexpiprazol.
    
    Síndrome serotoninérgico: En casos raros, el uso de brexpiprazol puede llevar al síndrome serotoninérgico.
""".trimIndent(),

            "Cariprazina" to """
    Náuseas: Puede causar malestar estomacal o náuseas.
    
    Insomnio o somnolencia: Algunas personas pueden experimentar dificultades para conciliar el sueño o somnolencia.
    
    Mareos: La cariprazina puede causar sensación de mareo en algunas personas.
    
    Boca seca: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir diarrea o estreñimiento.
    
    Pérdida de apetito o aumento de peso: Puede afectar el apetito de manera diferente en cada persona.
    
    Dolor de cabeza: Algunas personas pueden experimentar dolores de cabeza como efecto secundario.
    
    Síntomas sexuales: Pueden incluir disminución del deseo sexual, dificultades para alcanzar el orgasmo o disfunción eréctil.
    
    Agitación o nerviosismo: Algunas personas pueden experimentar una sensación de agitación o nerviosismo al tomar cariprazina.
    
    Síndrome serotoninérgico: En casos raros, el uso de cariprazina puede llevar al síndrome serotoninérgico.
""".trimIndent(),
            "Clotiapina" to """
    Somnolencia: La clotiapina puede causar somnolencia o sedación.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Hipotensión ortostática: La clotiapina puede causar una disminución de la presión arterial al ponerse de pie.
    
    Aumento de peso: Algunas personas pueden experimentar aumento de peso como efecto secundario.
    
    Boca seca: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal o problemas intestinales.
    
    Problemas sexuales: La clotiapina puede afectar la función sexual en algunas personas.
    
    Problemas de sueño: Puede afectar los patrones de sueño en algunas personas.
    
    Temblor: Algunas personas pueden experimentar temblores como efecto secundario.
    
    Agitación o nerviosismo: La clotiapina puede causar agitación o nerviosismo en algunas personas.
""".trimIndent(),

            "Clozapina" to """
    Sialorrea: La clozapina puede causar aumento de la salivación.
    
    Hipotensión ortostática: Puede causar una disminución de la presión arterial al ponerse de pie.
    
    Taquicardia: Algunas personas pueden experimentar un aumento de la frecuencia cardíaca.
    
    Temblor: La clozapina puede causar temblores en algunas personas.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Sedación: Algunas personas pueden experimentar somnolencia o sedación.
    
    Agranulocitosis: La clozapina puede llevar a la reducción de los glóbulos blancos, lo que es una condición grave.
    
    Aumento de peso: Algunas personas pueden experimentar aumento de peso como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal o problemas intestinales.
    
    Problemas sexuales: La clozapina puede afectar la función sexual en algunas personas.
""".trimIndent(),

            "Flupentixol" to """
    Somnolencia: El flupentixol puede causar somnolencia o sedación.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Hipotensión ortostática: Puede causar una disminución de la presión arterial al ponerse de pie.
    
    Sequedad en la boca: El flupentixol puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal o problemas intestinales.
    
    Problemas sexuales: El flupentixol puede afectar la función sexual en algunas personas.
    
    Problemas de sueño: Puede afectar los patrones de sueño en algunas personas.
    
    Temblor: Algunas personas pueden experimentar temblores como efecto secundario.
    
    Aumento de peso: El flupentixol puede causar aumento de peso en algunas personas.
    
    Agitación o nerviosismo: Algunas personas pueden experimentar agitación o nerviosismo.
""".trimIndent(),

            "Fluphenazina" to """
    Somnolencia: La fluphenazina puede causar somnolencia o sedación.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Hipotensión ortostática: Puede causar una disminución de la presión arterial al ponerse de pie.
    
    Sequedad en la boca: La fluphenazina puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal o problemas intestinales.
    
    Problemas sexuales: La fluphenazina puede afectar la función sexual en algunas personas.
    
    Problemas de sueño: Puede afectar los patrones de sueño en algunas personas.
    
    Temblor: Algunas personas pueden experimentar temblores como efecto secundario.
    
    Aumento de peso: La fluphenazina puede causar aumento de peso en algunas personas.
    
    Agitación o nerviosismo: Algunas personas pueden experimentar agitación o nerviosismo.
""".trimIndent(),

            "Risperidona" to """
    Somnolencia: La risperidona puede causar somnolencia o sedación.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Hipotensión ortostática: Puede causar una disminución de la presión arterial al ponerse de pie.
    
    Sequedad en la boca: La risperidona puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal o problemas intestinales.
    
    Problemas sexuales: La risperidona puede afectar la función sexual en algunas personas.
    
    Problemas de sueño: Puede afectar los patrones de sueño en algunas personas.
    
    Temblor: Algunas personas pueden experimentar temblores como efecto secundario.
    
    Aumento de peso: La risperidona puede causar aumento de peso en algunas personas.
    
    Agitación o nerviosismo: Algunas personas pueden experimentar agitación o nerviosismo.
""".trimIndent(),

            "Sertindol" to """
    Somnolencia: El sertindol puede causar somnolencia o sedación.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Hipotensión ortostática: Puede causar una disminución de la presión arterial al ponerse de pie.
    
    Sequedad en la boca: El sertindol puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal o problemas intestinales.
    
    Problemas sexuales: El sertindol puede afectar la función sexual en algunas personas.
    
    Problemas de sueño: Puede afectar los patrones de sueño en algunas personas.
    
    Temblor: Algunas personas pueden experimentar temblores como efecto secundario.
    
    Aumento de peso: El sertindol puede causar aumento de peso en algunas personas.
    
    Agitación o nerviosismo: Algunas personas pueden experimentar agitación o nerviosismo.
""".trimIndent(),

            "Paliperidona" to """
    Somnolencia: La paliperidona puede causar somnolencia o sedación.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Hipotensión ortostática: Puede causar una disminución de la presión arterial al ponerse de pie.
    
    Sequedad en la boca: La paliperidona puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal o problemas intestinales.
    
    Problemas sexuales: La paliperidona puede afectar la función sexual en algunas personas.
    
    Problemas de sueño: Puede afectar los patrones de sueño en algunas personas.
    
    Temblor: Algunas personas pueden experimentar temblores como efecto secundario.
    
    Aumento de peso: La paliperidona puede causar aumento de peso en algunas personas.
    
    Agitación o nerviosismo: Algunas personas pueden experimentar agitación o nerviosismo.
""".trimIndent(),

            "Citalopram" to """
    Náuseas: Puede causar malestar estomacal o náuseas.
    
    Insomnio o somnolencia: Algunas personas pueden experimentar dificultades para conciliar el sueño o somnolencia.
    
    Boca seca: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir diarrea o estreñimiento.
    
    Pérdida de apetito o aumento de peso: Puede afectar el apetito de manera diferente en cada persona.
    
    Dolor de cabeza: Algunas personas pueden experimentar dolores de cabeza como efecto secundario.
    
    Síntomas sexuales: Pueden incluir disminución del deseo sexual, dificultades para alcanzar el orgasmo o disfunción eréctil.
    
    Agitación o nerviosismo: Algunas personas pueden experimentar una sensación de agitación o nerviosismo al tomar citalopram.
    
    Síndrome serotoninérgico: En casos raros, el uso de citalopram puede llevar al síndrome serotoninérgico.
""".trimIndent(),

            "Olanzapina" to """
    Somnolencia: La olanzapina puede causar somnolencia o sedación.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Hipotensión ortostática: Puede causar una disminución de la presión arterial al ponerse de pie.
    
    Aumento de peso: La olanzapina puede causar aumento de peso en algunas personas.
    
    Sequedad en la boca: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal o problemas intestinales.
    
    Problemas sexuales: La olanzapina puede afectar la función sexual en algunas personas.
    
    Problemas de sueño: Puede afectar los patrones de sueño en algunas personas.
    
    Temblor: Algunas personas pueden experimentar temblores como efecto secundario.
    
    Agitación o nerviosismo: La olanzapina puede causar agitación o nerviosismo en algunas personas.
""".trimIndent(),

            "Quetiapina" to """
    Somnolencia: La quetiapina puede causar somnolencia o sedación.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Hipotensión ortostática: Puede causar una disminución de la presión arterial al ponerse de pie.
    
    Sequedad en la boca: La quetiapina puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal o problemas intestinales.
    
    Aumento de peso: Algunas personas pueden experimentar aumento de peso como efecto secundario.
    
    Problemas sexuales: La quetiapina puede afectar la función sexual en algunas personas.
    
    Problemas de sueño: Puede afectar los patrones de sueño en algunas personas.
    
    Temblor: Algunas personas pueden experimentar temblores como efecto secundario.
    
    Agitación o nerviosismo: La quetiapina puede causar agitación o nerviosismo en algunas personas.
""".trimIndent(),
            "Sulpirida" to """
    Náuseas: La sulpirida puede causar malestar estomacal o náuseas.
    
    Vértigo: Puede causar sensación de mareo o vértigo en algunas personas.
    
    Insomnio: La sulpirida puede afectar los patrones de sueño, causando insomnio.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal o problemas intestinales.
    
    Temblor: Algunas personas pueden experimentar temblores como efecto secundario.
    
    Agitación: Puede causar agitación o intranquilidad en algunas personas.
    
    Cambios en la libido: La sulpirida puede afectar la libido o el interés sexual.
    
    Problemas menstruales: En mujeres, puede haber alteraciones en el ciclo menstrual.
    
    Aumento de prolactina: Puede aumentar los niveles de prolactina en la sangre.
    
    Aumento de peso: Algunas personas pueden experimentar aumento de peso como efecto secundario.
""".trimIndent(),

            "Amoxapina" to """
    Somnolencia: La amoxapina puede causar somnolencia o sedación.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Boca seca: La amoxapina puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Estreñimiento: Algunas personas pueden experimentar estreñimiento como efecto secundario.
    
    Visión borrosa: Puede afectar la visión y causar visión borrosa en algunas personas.
    
    Problemas urinarios: La amoxapina puede afectar la función urinaria en algunas personas.
    
    Temblor: Algunas personas pueden experimentar temblores como efecto secundario.
    
    Sudoración excesiva: La amoxapina puede causar sudoración excesiva en algunas personas.
    
    Cambios en el apetito: Puede afectar el apetito de manera diferente en cada persona.
""".trimIndent(),

            "Oxitriptán" to """
    Náuseas: El oxitriptán puede causar malestar estomacal o náuseas.
    
    Diarrea: Puede provocar diarrea en algunas personas.
    
    Mareos: El oxitriptán puede causar sensación de mareo en algunas personas.
    
    Dolor de cabeza: Algunas personas pueden experimentar dolores de cabeza como efecto secundario.
    
    Sequedad bucal: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas de sueño: El oxitriptán puede afectar los patrones de sueño, causando insomnio o somnolencia.
    
    Agitación: Algunas personas pueden experimentar agitación o nerviosismo como efecto secundario.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
    
    Problemas urinarios: El oxitriptán puede afectar la función urinaria en algunas personas.
    
    Temblor: Algunas personas pueden experimentar temblores como efecto secundario.
""".trimIndent(),

            "Trazodona" to """
    Somnolencia: La trazodona puede causar somnolencia o sedación.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Boca seca: La trazodona puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Visión borrosa: Puede afectar la visión y causar visión borrosa en algunas personas.
    
    Problemas de sueño: La trazodona puede afectar los patrones de sueño, causando insomnio o somnolencia.
    
    Temblor: Algunas personas pueden experimentar temblores como efecto secundario.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
    
    Problemas urinarios: La trazodona puede afectar la función urinaria en algunas personas.
    
    Sudoración excesiva: Algunas personas pueden experimentar sudoración excesiva como efecto secundario.
""".trimIndent(),

            "Haloperidol" to """
    Somnolencia: El haloperidol puede causar somnolencia o sedación.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Boca seca: El haloperidol puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Temblor: El haloperidol puede causar temblores en algunas personas.
    
    Rigidez muscular: Puede causar rigidez muscular como efecto secundario.
    
    Problemas de movimientos: El haloperidol puede causar movimientos involuntarios en algunas personas.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
    
    Problemas urinarios: El haloperidol puede afectar la función urinaria en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
""".trimIndent(),

            "Clorpromazina" to """
    Somnolencia: La clorpromazina puede causar somnolencia o sedación.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Boca seca: La clorpromazina puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Temblor: La clorpromazina puede causar temblores en algunas personas.
    
    Problemas de movimientos: Puede causar movimientos involuntarios en algunas personas.
    
    Problemas de sueño: La clorpromazina puede afectar los patrones de sueño, causando insomnio o somnolencia.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
    
    Problemas urinarios: La clorpromazina puede afectar la función urinaria en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
""".trimIndent(),

            "Lurasidona" to """
    Náuseas: La lurasidona puede causar malestar estomacal o náuseas.
    
    Insomnio: Puede causar dificultades para conciliar el sueño.
    
    Ansiedad: Algunas personas pueden experimentar ansiedad como efecto secundario.
    
    Mareos: La lurasidona puede causar sensación de mareo en algunas personas.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal o problemas intestinales.
    
    Aumento de peso: Algunas personas pueden experimentar aumento de peso como efecto secundario.
    
    Fatiga: La lurasidona puede causar fatiga en algunas personas.
    
    Problemas sexuales: Puede afectar la función sexual en algunas personas.
    
    Somnolencia: Algunas personas pueden experimentar somnolencia como efecto secundario.
    
    Temblor: La lurasidona puede causar temblores en algunas personas.
""".trimIndent(),

            "Trifluoperazina" to """
    Somnolencia: La trifluoperazina puede causar somnolencia o sedación.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Boca seca: La trifluoperazina puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Temblor: La trifluoperazina puede causar temblores en algunas personas.
    
    Problemas de movimientos: Puede causar movimientos involuntarios en algunas personas.
    
    Problemas de sueño: La trifluoperazina puede afectar los patrones de sueño, causando insomnio o somnolencia.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
    
    Problemas urinarios: La trifluoperazina puede afectar la función urinaria en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
""".trimIndent(),

            "Valproato" to """
    Náuseas: El valproato puede causar malestar estomacal o náuseas.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal o molestias intestinales.
    
    Aumento de peso: Algunas personas pueden experimentar aumento de peso como efecto secundario.
    
    Temblor: El valproato puede causar temblores en algunas personas.
    
    Problemas de sueño: Puede afectar los patrones de sueño, causando insomnio o somnolencia.
    
    Problemas hepáticos: El valproato puede afectar la función hepática en algunas personas.
    
    Cambios en el apetito: Puede afectar el apetito de manera diferente en cada persona.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Cambios en el cabello: Algunas personas pueden experimentar cambios en la textura o el grosor del cabello.
    
    Cambios en la piel: Puede causar cambios en la piel como efecto secundario.
""".trimIndent(),
            "Carbamazepina" to """
    Mareos: La carbamazepina puede causar sensación de mareo en algunas personas.
    
    Somnolencia: Puede causar somnolencia o sedación en algunas personas.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal, náuseas o problemas intestinales.
    
    Cambios en la piel: La carbamazepina puede causar cambios en la piel como efecto secundario.
    
    Problemas de coordinación: Puede afectar la coordinación motora en algunas personas.
    
    Problemas de visión: La carbamazepina puede afectar la visión en algunas personas.
    
    Aumento de peso: Algunas personas pueden experimentar aumento de peso como efecto secundario.
    
    Problemas sanguíneos: Puede afectar la producción de células sanguíneas en algunas personas.
    
    Cambios en la frecuencia cardíaca: La carbamazepina puede afectar la frecuencia cardíaca en algunas personas.
    
    Problemas hepáticos: Puede afectar la función hepática en algunas personas.
""".trimIndent(),

            "Tioridazina" to """
    Problemas cardíacos: La tioridazina puede afectar la función cardíaca en algunas personas.
    
    Problemas sanguíneos: Puede afectar la producción de células sanguíneas en algunas personas.
    
    Problemas de visión: La tioridazina puede causar cambios en la visión o problemas oculares.
    
    Problemas de movimientos: Puede causar movimientos involuntarios en algunas personas.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal, náuseas o problemas intestinales.
    
    Mareos: La tioridazina puede causar sensación de mareo en algunas personas.
    
    Somnolencia: Puede causar somnolencia o sedación en algunas personas.
    
    Sequedad bucal: La tioridazina puede causar sequedad en la boca como efecto secundario.
    
    Problemas urinarios: Puede afectar la función urinaria en algunas personas.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
""".trimIndent(),

            "Perfenazina" to """
    Problemas de movimientos: La perfenazina puede causar movimientos involuntarios en algunas personas.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal, náuseas o problemas intestinales.
    
    Sequedad bucal: La perfenazina puede causar sequedad en la boca como efecto secundario.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Problemas de visión: La perfenazina puede afectar la visión o causar problemas oculares.
    
    Somnolencia: Puede causar somnolencia o sedación en algunas personas.
    
    Problemas cardíacos: La perfenazina puede afectar la función cardíaca en algunas personas.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
    
    Problemas sanguíneos: Puede afectar la producción de células sanguíneas en algunas personas.
    
    Problemas urinarios: La perfenazina puede afectar la función urinaria en algunas personas.
""".trimIndent(),

            "Flufenazina" to """
    Problemas de movimientos: La flufenazina puede causar movimientos involuntarios en algunas personas.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal, náuseas o problemas intestinales.
    
    Sequedad bucal: La flufenazina puede causar sequedad en la boca como efecto secundario.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Problemas de visión: La flufenazina puede afectar la visión o causar problemas oculares.
    
    Somnolencia: Puede causar somnolencia o sedación en algunas personas.
    
    Problemas cardíacos: La flufenazina puede afectar la función cardíaca en algunas personas.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
    
    Problemas sanguíneos: Puede afectar la producción de células sanguíneas en algunas personas.
    
    Problemas urinarios: La flufenazina puede afectar la función urinaria en algunas personas.
""".trimIndent(),

            "Topiramato" to """
    Mareos: El topiramato puede causar sensación de mareo en algunas personas.
    
    Somnolencia: Puede causar somnolencia o sedación en algunas personas.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal, náuseas o problemas intestinales.
    
    Problemas de visión: El topiramato puede afectar la visión o causar problemas oculares.
    
    Cambios en el apetito: Puede afectar el apetito de manera diferente en cada persona.
    
    Pérdida de peso: Algunas personas pueden experimentar pérdida de peso como efecto secundario.
    
    Problemas de coordinación: Puede afectar la coordinación motora en algunas personas.
    
    Problemas de sueño: El topiramato puede afectar los patrones de sueño, causando insomnio o somnolencia.
    
    Cambios en el estado de ánimo: Puede afectar el estado de ánimo en algunas personas.
    
    Problemas cognitivos: El topiramato puede afectar la función cognitiva en algunas personas.
""".trimIndent(),

            "Ziprasidona" to """
    Mareos: La ziprasidona puede causar sensación de mareo en algunas personas.
    
    Somnolencia: Puede causar somnolencia o sedación en algunas personas.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal, náuseas o problemas intestinales.
    
    Problemas de movimientos: Puede causar movimientos involuntarios en algunas personas.
    
    Problemas de sueño: La ziprasidona puede afectar los patrones de sueño, causando insomnio o somnolencia.
    
    Problemas cardíacos: Puede afectar la función cardíaca en algunas personas.
    
    Aumento de peso: Algunas personas pueden experimentar aumento de peso como efecto secundario.
    
    Problemas de glucosa: La ziprasidona puede afectar los niveles de glucosa en sangre.
    
    Cambios en la presión arterial: Puede afectar la presión arterial en algunas personas.
    
    Problemas cognitivos: La ziprasidona puede afectar la función cognitiva en algunas personas.
""".trimIndent(),

            "Amisulprida" to """
    Mareos: La amisulprida puede causar sensación de mareo en algunas personas.
    
    Somnolencia: Puede causar somnolencia o sedación en algunas personas.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal, náuseas o problemas intestinales.
    
    Problemas de movimientos: Puede causar movimientos involuntarios en algunas personas.
    
    Problemas de sueño: La amisulprida puede afectar los patrones de sueño, causando insomnio o somnolencia.
    
    Aumento de peso: Algunas personas pueden experimentar aumento de peso como efecto secundario.
    
    Problemas cardíacos: La amisulprida puede afectar la función cardíaca en algunas personas.
    
    Problemas de glucosa: Puede afectar los niveles de glucosa en sangre.
    
    Cambios en la presión arterial: La amisulprida puede afectar la presión arterial en algunas personas.
    
    Problemas de movimientos faciales: Puede causar movimientos involuntarios en la cara.
""".trimIndent(),

            "Haloperidol decanoato" to """
    Problemas de movimientos: El haloperidol decanoato puede causar movimientos involuntarios en algunas personas.
    
    Problemas cardíacos: Puede afectar la función cardíaca en algunas personas.
    
    Problemas de movimientos faciales: Puede causar movimientos involuntarios en la cara.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal, náuseas o problemas intestinales.
    
    Problemas de sueño: El haloperidol decanoato puede afectar los patrones de sueño, causando insomnio o somnolencia.
    
    Problemas de coordinación: Puede afectar la coordinación motora en algunas personas.
    
    Sequedad bucal: El haloperidol decanoato puede causar sequedad en la boca como efecto secundario.
    
    Problemas de visión: Puede afectar la visión o causar problemas oculares.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
""".trimIndent(),

            "Nortriptilina" to """
    Mareos: La nortriptilina puede causar sensación de mareo en algunas personas.
    
    Sequedad bucal: Puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal, náuseas o problemas intestinales.
    
    Problemas de movimientos: La nortriptilina puede causar movimientos involuntarios en algunas personas.
    
    Problemas de sueño: Puede afectar los patrones de sueño, causando insomnio o somnolencia.
    
    Problemas cardíacos: La nortriptilina puede afectar la función cardíaca en algunas personas.
    
    Cambios en el apetito: Puede afectar el apetito de manera diferente en cada persona.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
    
    Problemas urinarios: La nortriptilina puede afectar la función urinaria en algunas personas.
    
    Problemas de visión: Puede afectar la visión o causar problemas oculares.
""".trimIndent(),
            "Nortriptilina" to """
    Boca seca: La nortriptilina puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Estreñimiento: La nortriptilina puede causar estreñimiento en algunas personas.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Problemas de sueño: La nortriptilina puede afectar los patrones de sueño, causando insomnio o somnolencia.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
    
    Problemas urinarios: La nortriptilina puede afectar la función urinaria en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
    
    Sudoración excesiva: La nortriptilina puede causar sudoración excesiva en algunas personas.
    
    Temblor: Puede causar temblores en algunas personas.
""".trimIndent(),

            "Desipramina" to """
    Boca seca: La desipramina puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Estreñimiento: La desipramina puede causar estreñimiento en algunas personas.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Problemas de sueño: La desipramina puede afectar los patrones de sueño, causando insomnio o somnolencia.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
    
    Problemas urinarios: La desipramina puede afectar la función urinaria en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
    
    Sudoración excesiva: La desipramina puede causar sudoración excesiva en algunas personas.
    
    Temblor: Puede causar temblores en algunas personas.
""".trimIndent(),

            "Imipramina" to """
    Boca seca: La imipramina puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Estreñimiento: La imipramina puede causar estreñimiento en algunas personas.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Problemas de sueño: La imipramina puede afectar los patrones de sueño, causando insomnio o somnolencia.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
    
    Problemas urinarios: La imipramina puede afectar la función urinaria en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
    
    Sudoración excesiva: La imipramina puede causar sudoración excesiva en algunas personas.
    
    Temblor: Puede causar temblores en algunas personas.
""".trimIndent(),

            "Amitriptilina" to """
    Boca seca: La amitriptilina puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Estreñimiento: La amitriptilina puede causar estreñimiento en algunas personas.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Problemas de sueño: La amitriptilina puede afectar los patrones de sueño, causando insomnio o somnolencia.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
    
    Problemas urinarios: La amitriptilina puede afectar la función urinaria en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
    
    Sudoración excesiva: La amitriptilina puede causar sudoración excesiva en algunas personas.
    
    Temblor: Puede causar temblores en algunas personas.
""".trimIndent(),

            "Maprotilina" to """
    Boca seca: La maprotilina puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Estreñimiento: La maprotilina puede causar estreñimiento en algunas personas.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Problemas de sueño: La maprotilina puede afectar los patrones de sueño, causando insomnio o somnolencia.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
    
    Problemas urinarios: La maprotilina puede afectar la función urinaria en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
    
    Sudoración excesiva: La maprotilina puede causar sudoración excesiva en algunas personas.
    
    Temblor: Puede causar temblores en algunas personas.
""".trimIndent(),

            "Clomipramina" to """
    Boca seca: La clomipramina puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Estreñimiento: La clomipramina puede causar estreñimiento en algunas personas.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Problemas de sueño: La clomipramina puede afectar los patrones de sueño, causando insomnio o somnolencia.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
    
    Problemas urinarios: La clomipramina puede afectar la función urinaria en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
    
    Sudoración excesiva: La clomipramina puede causar sudoración excesiva en algunas personas.
    
    Temblor: Puede causar temblores en algunas personas.
""".trimIndent(),

            "Trimipramina" to """
    Boca seca: La trimipramina puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Estreñimiento: La trimipramina puede causar estreñimiento en algunas personas.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Problemas de sueño: La trimipramina puede afectar los patrones de sueño, causando insomnio o somnolencia.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
    
    Problemas urinarios: La trimipramina puede afectar la función urinaria en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
    
    Sudoración excesiva: La trimipramina puede causar sudoración excesiva en algunas personas.
    
    Temblor: Puede causar temblores en algunas personas.
""".trimIndent(),

            "Doxepina" to """
    Boca seca: La doxepina puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir náuseas o molestias estomacales.
    
    Estreñimiento: La doxepina puede causar estreñimiento en algunas personas.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Problemas de sueño: La doxepina puede afectar los patrones de sueño, causando insomnio o somnolencia.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
    
    Problemas urinarios: La doxepina puede afectar la función urinaria en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
    
    Sudoración excesiva: La doxepina puede causar sudoración excesiva en algunas personas.
    
    Temblor: Puede causar temblores en algunas personas.
""".trimIndent(),

            "Metilfenidato" to """
    Problemas gastrointestinales: Pueden incluir malestar estomacal o molestias intestinales.
    
    Pérdida de apetito: El metilfenidato puede reducir el apetito en algunas personas.
    
    Problemas de sueño: Puede causar dificultades para conciliar el sueño o insomnio.
    
    Nerviosismo: El metilfenidato puede aumentar la sensación de nerviosismo en algunas personas.
    
    Aumento de la frecuencia cardíaca: Puede causar un aumento en la frecuencia cardíaca.
    
    Presión arterial elevada: El metilfenidato puede aumentar la presión arterial en algunas personas.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Dolores de cabeza: Algunas personas pueden experimentar dolores de cabeza como efecto secundario.
    
    Sudoración excesiva: El metilfenidato puede causar sudoración excesiva en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
""".trimIndent(),

            "Atomoxetina" to """
    Problemas gastrointestinales: Pueden incluir malestar estomacal o molestias intestinales.
    
    Pérdida de apetito: La atomoxetina puede reducir el apetito en algunas personas.
    
    Problemas de sueño: Puede causar dificultades para conciliar el sueño o insomnio.
    
    Nerviosismo: La atomoxetina puede aumentar la sensación de nerviosismo en algunas personas.
    
    Aumento de la frecuencia cardíaca: Puede causar un aumento en la frecuencia cardíaca.
    
    Presión arterial elevada: La atomoxetina puede aumentar la presión arterial en algunas personas.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Dolores de cabeza: Algunas personas pueden experimentar dolores de cabeza como efecto secundario.
    
    Sudoración excesiva: La atomoxetina puede causar sudoración excesiva en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
""".trimIndent(),

            "Ropinirol" to """
    Náuseas: El ropinirol puede causar malestar estomacal o náuseas.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Somnolencia: El ropinirol puede causar somnolencia en algunas personas.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal, náuseas o diarrea.
    
    Mareo ortostático: Puede causar una disminución de la presión arterial al ponerse de pie, provocando mareo.
    
    Problemas de sueño: El ropinirol puede afectar los patrones de sueño, causando insomnio o sueños vívidos.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
    
    Movimientos incontrolados: El ropinirol puede causar movimientos incontrolados en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
    
    Aumento de la sudoración: El ropinirol puede causar aumento de la sudoración en algunas personas.
""".trimIndent(),
            "Pramipexol" to """
    Náuseas: El pramipexol puede causar malestar estomacal o náuseas.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Somnolencia: El pramipexol puede causar somnolencia en algunas personas.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal, náuseas o diarrea.
    
    Mareo ortostático: Puede causar una disminución de la presión arterial al ponerse de pie, provocando mareo.
    
    Problemas de sueño: El pramipexol puede afectar los patrones de sueño, causando insomnio o sueños vívidos.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
    
    Movimientos incontrolados: El pramipexol puede causar movimientos incontrolados en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
    
    Aumento de la sudoración: El pramipexol puede causar aumento de la sudoración en algunas personas.
""".trimIndent(),

            "Carbidopa/Levodopa" to """
    Náuseas: La carbidopa/levodopa puede causar malestar estomacal o náuseas.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Movimientos involuntarios: La carbidopa/levodopa puede causar movimientos involuntarios en algunas personas.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal, náuseas o diarrea.
    
    Complicaciones del sistema nervioso: La carbidopa/levodopa puede causar complicaciones del sistema nervioso en algunas personas.
    
    Alucinaciones: Puede causar alucinaciones en algunas personas.
    
    Problemas de sueño: La carbidopa/levodopa puede afectar los patrones de sueño, causando insomnio o sueños vívidos.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
    
    Problemas respiratorios: La carbidopa/levodopa puede afectar la respiración en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
""".trimIndent(),

            "Entacapona" to """
    Náuseas: La entacapona puede causar malestar estomacal o náuseas.
    
    Diarrea: Puede causar diarrea en algunas personas.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal, náuseas o diarrea.
    
    Cambios en la función hepática: La entacapona puede afectar la función hepática en algunas personas.
    
    Problemas de sueño: La entacapona puede afectar los patrones de sueño, causando insomnio o sueños vívidos.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
    
    Movimientos involuntarios: La entacapona puede causar movimientos involuntarios en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
    
    Aumento de la sudoración: La entacapona puede causar aumento de la sudoración en algunas personas.
""".trimIndent(),

            "Trihexifenidilo" to """
    Boca seca: El trihexifenidilo puede causar sequedad en la boca como efecto secundario.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal o molestias intestinales.
    
    Problemas urinarios: El trihexifenidilo puede afectar la función urinaria en algunas personas.
    
    Confusión: Puede causar confusión o problemas de memoria en algunas personas.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Problemas de visión: El trihexifenidilo puede afectar la visión en algunas personas.
    
    Problemas de coordinación: Puede afectar la coordinación motora en algunas personas.
    
    Aumento de la temperatura corporal: El trihexifenidilo puede aumentar la temperatura corporal en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
    
    Estreñimiento: El trihexifenidilo puede causar estreñimiento en algunas personas.
""".trimIndent(),

            "Benztropina" to """
    Boca sec
""".trimIndent(),

            "Donepezilo" to """
    Náuseas: El donepezilo puede causar malestar estomacal o náuseas.
    
    Diarrea: Puede causar diarrea en algunas personas.
    
    Insomnio: El donepezilo puede causar dificultades para conciliar el sueño.
    
    Fatiga: Puede causar sensación de cansancio o fatiga en algunas personas.
    
    Pérdida de apetito: El donepezilo puede afectar el apetito de manera diferente en cada persona.
    
    Calambres musculares: Puede causar calambres musculares en algunas personas.
    
    Cambios en la función hepática: El donepezilo puede afectar la función hepática en algunas personas.
    
    Pesadillas: Puede causar sueños vívidos o pesadillas en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
""".trimIndent(),
            "Memantina" to """
    Mareos: La memantina puede causar sensación de mareo en algunas personas.
    
    Dolor de cabeza: Algunas personas pueden experimentar dolores de cabeza como efecto secundario.
    
    Estreñimiento: La memantina puede causar estreñimiento en algunas personas.
    
    Confusión: Puede causar confusión en algunas personas.
    
    Fatiga: Puede causar sensación de cansancio o fatiga en algunas personas.
    
    Cambios en la presión arterial: La memantina puede afectar la presión arterial en algunas personas.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal o molestias intestinales.
    
    Alucinaciones: La memantina puede causar alucinaciones en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
    
    Problemas urinarios: La memantina puede afectar la función urinaria en algunas personas.
""".trimIndent(),

            "Amantadina" to """
    Mareos: La amantadina puede causar sensación de mareo en algunas personas.
    
    Insomnio: Puede causar dificultades para conciliar el sueño.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal, náuseas o diarrea.
    
    Cambios en la conducta: La amantadina puede afectar la conducta en algunas personas.
    
    Alucinaciones: Puede causar alucinaciones en algunas personas.
    
    Cambios en la memoria: La amantadina puede afectar la memoria en algunas personas.
    
    Problemas urinarios: Puede afectar la función urinaria en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
    
    Aumento de la sudoración: La amantadina puede causar aumento de la sudoración en algunas personas.
    
    Problemas respiratorios: Puede afectar la función respiratoria en algunas personas.
""".trimIndent(),

            "L-DOPA" to """
    Náuseas: La L-DOPA puede causar malestar estomacal o náuseas.
    
    Movimientos involuntarios: La L-DOPA puede causar movimientos involuntarios en algunas personas.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal, náuseas o diarrea.
    
    Complicaciones del sistema nervioso: La L-DOPA puede causar complicaciones del sistema nervioso en algunas personas.
    
    Alucinaciones: Puede causar alucinaciones en algunas personas.
    
    Problemas de sueño: La L-DOPA puede afectar los patrones de sueño, causando insomnio o sueños vívidos.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
    
    Problemas respiratorios: La L-DOPA puede afectar la función respiratoria en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
""".trimIndent(),

            "Selegilina" to """
    Náuseas: La selegilina puede causar malestar estomacal o náuseas.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Insomnio: La selegilina puede causar dificultades para conciliar el sueño.
    
    Cambios en la presión arterial: Puede afectar la presión arterial en algunas personas.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal o molestias intestinales.
    
    Problemas de sueño: La selegilina puede afectar los patrones de sueño, causando insomnio o sueños vívidos.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
    
    Problemas respiratorios: La selegilina puede afectar la función respiratoria en algunas personas.
    
    Aumento de la sudoración: Puede causar aumento de la sudoración en algunas personas.
""".trimIndent(),

            "Rasagilina" to """
    Náuseas: La rasagilina puede causar malestar estomacal o náuseas.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Insomnio: La rasagilina puede causar dificultades para conciliar el sueño.
    
    Cambios en la presión arterial: Puede afectar la presión arterial en algunas personas.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal o molestias intestinales.
    
    Problemas de sueño: La rasagilina puede afectar los patrones de sueño, causando insomnio o sueños vívidos.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
    
    Problemas respiratorios: La rasagilina puede afectar la función respiratoria en algunas personas.
    
    Aumento de la sudoración: Puede causar aumento de la sudoración en algunas personas.
""".trimIndent(),
            "Levodopa/Benserazida" to """
    Náuseas: La levodopa/benserazida puede causar malestar estomacal o náuseas.
    
    Movimientos involuntarios: La levodopa/benserazida puede causar movimientos involuntarios en algunas personas.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal, náuseas o diarrea.
    
    Complicaciones del sistema nervioso: La levodopa/benserazida puede causar complicaciones del sistema nervioso en algunas personas.
    
    Alucinaciones: Puede causar alucinaciones en algunas personas.
    
    Problemas de sueño: La levodopa/benserazida puede afectar los patrones de sueño, causando insomnio o sueños vívidos.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
    
    Problemas respiratorios: La levodopa/benserazida puede afectar la función respiratoria en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
""".trimIndent(),

            "Rotigotina" to """
    Problemas cutáneos: La rotigotina puede causar irritación en el sitio de aplicación.
    
    Náuseas: Puede causar malestar estomacal o náuseas en algunas personas.
    
    Mareos: La rotigotina puede causar sensación de mareo en algunas personas.
    
    Problemas de sueño: Puede afectar los patrones de sueño, causando insomnio o sueños vívidos.
    
    Irritación en el sitio de aplicación: La rotigotina puede causar irritación en la piel en el lugar donde se aplica.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
    
    Problemas respiratorios: La rotigotina puede afectar la función respiratoria en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
    
    Sudoración excesiva: Puede causar sudoración excesiva en algunas personas.
    
    Dolor en el sitio de aplicación: La rotigotina puede causar dolor en el lugar donde se aplica.
""".trimIndent(),

            "Piribedil" to """
    Náuseas: El piribedil puede causar malestar estomacal o náuseas.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal, náuseas o diarrea.
    
    Problemas de sueño: El piribedil puede afectar los patrones de sueño, causando insomnio o somnolencia.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
    
    Problemas respiratorios: El piribedil puede afectar la función respiratoria en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
    
    Aumento de la sudoración: El piribedil puede causar aumento de la sudoración en algunas personas.
    
    Dolor en las piernas: El piribedil puede causar dolor en las piernas en algunas personas.
    
    Hipotensión ortostática: Puede causar una disminución de la presión arterial al ponerse de pie, provocando mareo.
""".trimIndent(),

            "Opicapona" to """
    Náuseas: La opicapona puede causar malestar estomacal o náuseas.
    
    Diarrea: Puede causar diarrea en algunas personas.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal o molestias intestinales.
    
    Cambios en la función hepática: La opicapona puede afectar la función hepática en algunas personas.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Problemas respiratorios: La opicapona puede afectar la función respiratoria en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
    
    Aumento de la sudoración: La opicapona puede causar aumento de la sudoración en algunas personas.
    
    Dolor abdominal: Puede causar dolor abdominal en algunas personas.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
""".trimIndent(),

            "Tolcapona" to """
    Náuseas: La tolcapona puede causar malestar estomacal o náuseas.
    
    Vómitos: Puede causar vómitos en algunas personas.
    
    Diarrea: La tolcapona puede causar diarrea en algunas personas.
    
    Problemas gastrointestinales: Pueden incluir malestar estomacal o molestias intestinales.
    
    Cambios en la función hepática: La tolcapona puede afectar la función hepática en algunas personas.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Problemas respiratorios: La tolcapona puede afectar la función respiratoria en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
    
    Aumento de la sudoración: La tolcapona puede causar aumento de la sudoración en algunas personas.
    
    Cambios en la libido: Puede afectar la libido o el interés sexual en algunas personas.
""".trimIndent(),

            "Rivastigmina" to """
    Náuseas: La rivastigmina puede causar malestar estomacal o náuseas.
    
    Vómitos: Puede causar vómitos en algunas personas.
    
    Diarrea: La rivastigmina puede causar diarrea en algunas personas.
    
    Pérdida de apetito: Puede causar pérdida de apetito en algunas personas.
    
    Cambios en la función hepática: La rivastigmina puede afectar la función hepática en algunas personas.
    
    Problemas respiratorios: La rivastigmina puede afectar la función respiratoria en algunas personas.
    
    Problemas de sueño: La rivastigmina puede causar dificultades para conciliar el sueño.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
    
    Aumento de la sudoración: La rivastigmina puede causar aumento de la sudoración en algunas personas.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
""".trimIndent(),

            "Galantamina" to """
    Náuseas: La galantamina puede causar malestar estomacal o náuseas.
    
    Vómitos: Puede causar vómitos en algunas personas.
    
    Diarrea: La galantamina puede causar diarrea en algunas personas.
    
    Pérdida de apetito: Puede causar pérdida de apetito en algunas personas.
    
    Cambios en la función hepática: La galantamina puede afectar la función hepática en algunas personas.
    
    Problemas respiratorios: La galantamina puede afectar la función respiratoria en algunas personas.
    
    Problemas de sueño: La galantamina puede causar dificultades para conciliar el sueño.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
    
    Aumento de la sudoración: La galantamina puede causar aumento de la sudoración en algunas personas.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
""".trimIndent(),

            "Memantina/Donepezilo" to """
    Náuseas: La memantina/donepezilo puede causar malestar estomacal o náuseas.
    
    Vómitos: Puede causar vómitos en algunas personas.
    
    Diarrea: La memantina/donepezilo puede causar diarrea en algunas personas.
    
    Pérdida de apetito: Puede causar pérdida de apetito en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
    
    Problemas de sueño: La memantina/donepezilo puede afectar los patrones de sueño, causando insomnio o sueños vívidos.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Problemas respiratorios: La memantina/donepezilo puede afectar la función respiratoria en algunas personas.
    
    Aumento de la sudoración: Puede causar aumento de la sudoración en algunas personas.
    
    Cambios en la libido: La memantina/donepezilo puede afectar la libido o el interés sexual en algunas personas.
""".trimIndent(),

            "Memantina/Rivastigmina" to """
    Náuseas: La memantina/rivastigmina puede causar malestar estomacal o náuseas.
    
    Vómitos: Puede causar vómitos en algunas personas.
    
    Diarrea: La memantina/rivastigmina puede causar diarrea en algunas personas.
    
    Pérdida de apetito: Puede causar pérdida de apetito en algunas personas.
    
    Cambios en el peso: Algunas personas pueden experimentar cambios en el peso como efecto secundario.
    
    Problemas de sueño: La memantina/rivastigmina puede afectar los patrones de sueño, causando insomnio o sueños vívidos.
    
    Mareos: Puede causar sensación de mareo en algunas personas.
    
    Problemas respiratorios: La memantina/rivastigmina puede afectar la función respiratoria en algunas personas.
    
    Aumento de la sudoración: Puede causar aumento de la sudoración en algunas personas.
    
    Cambios en la libido: La memantina/rivastigmina puede afectar la libido o el interés sexual en algunas personas.
""".trimIndent(),

            "Sertalina" to """
     Náuseas: Puede causar malestar estomacal o náuseas, especialmente al inicio del tratamiento.

     Insomnio o somnolencia: Algunas personas pueden experimentar dificultades para dormir, mientras que otras pueden sentirse somnolientas.

     Diarrea o estreñimiento: Puede afectar el sistema gastrointestinal y causar cambios en los hábitos intestinales.

     Pérdida de apetito o aumento de peso: Algunas personas pueden experimentar cambios en el apetito, lo que puede resultar en pérdida o ganancia de peso.

     Aumento de la sudoración: Puede producirse un aumento en la transpiración.

     Mareos o vértigo: Algunas personas pueden experimentar sensación de mareo o vértigo.

     Dolor de cabeza: Los dolores de cabeza son un efecto secundario común.

     Disfunción sexual: Puede haber cambios en la libido o dificultades sexuales.

     Agitación o nerviosismo: Algunas personas pueden sentirse más inquietas o nerviosas al tomar sertralina.

     Boca seca: La sensación de boca seca es un efecto secundario posible.
                """.trimIndent(),
            "Tianeptina" to """
             Mejora del estado de ánimo: La tianeptina se prescribe principalmente para el tratamiento de la depresión. Ayuda a mejorar el estado de ánimo en algunas personas al actuar sobre el sistema serotoninérgico en el cerebro.

             Reducción de la ansiedad: Además de tratar la depresión, se ha observado que la tianeptina tiene efectos ansiolíticos, es decir, puede reducir la ansiedad en algunas personas.

             Mejora de la cognición: Algunos estudios sugieren que la tianeptina puede tener efectos positivos en la cognición, como la mejora de la memoria y la función cognitiva. Sin embargo, se necesita más investigación para confirmar estos efectos.

             Falta de efectos secundarios típicos: A diferencia de algunos antidepresivos, la tianeptina generalmente se asocia con menos efectos secundarios sexuales y de aumento de peso. Sin embargo, como con cualquier medicamento, pueden ocurrir efectos secundarios y varían de persona a persona.

             Potencial adictivo: Aunque es un tema de debate, algunos informes sugieren que la tianeptina puede tener un potencial adictivo, especialmente en dosis elevadas o con un uso inadecuado. Se ha observado abuso de tianeptina en algunos lugares, y en algunos países se ha clasificado como una sustancia controlada debido a estas preocupaciones.
         """.trimIndent(),
            "Milnaciprán" to """
                Náuseas: Sensación de malestar estomacal que puede llevar a la necesidad de vomitar.

                Dolor de cabeza: Malestar o dolor en la cabeza.

                Insomnio: Dificultad para conciliar o mantener el sueño.

                Sequedad bucal: Sensación de sequedad en la boca.

                Sudoración excesiva: Producción anormalmente alta de sudor.

                Estreñimiento: Dificultad para evacuar o heces de consistencia más dura de lo normal.
            """.trimIndent(),
            "Modafinilo" to """
                Dolor de cabeza: Puede ser uno de los efectos secundarios más comunes. En muchos casos, es leve y desaparece con el tiempo.

                Náuseas: Algunas personas pueden experimentar malestar estomacal o náuseas después de tomar modafinilo.

                Insomnio: Aunque el modafinilo se utiliza para tratar trastornos del sueño, en algunas personas puede causar dificultades para conciliar el sueño si se toma demasiado tarde en el día.

                Nerviosismo o ansiedad: Algunas personas pueden experimentar un aumento en la ansiedad o sentirse nerviosas después de tomar modafinilo.

                Mareos: Puede causar mareos en algunos individuos.

                Dolor de pecho: En casos raros, se han reportado dolores en el pecho como efecto secundario.

                Aumento de la presión arterial: En algunas personas, el modafinilo puede elevar la presión arterial.
            """.trimIndent(),
            "Escitalopram" to """
                Náuseas: Puede experimentar sensaciones de malestar estomacal o náuseas al tomar escitalopram.

                Insomnio o somnolencia: Algunas personas pueden experimentar dificultades para conciliar el sueño (insomnio) o, por el contrario, sentirse somnolientas.

                Boca seca: La sequedad bucal es un efecto secundario común asociado con el uso de escitalopram.

                Dolor de cabeza: Algunas personas pueden experimentar dolores de cabeza como efecto secundario del medicamento.

                Problemas gastrointestinales: Esto puede incluir diarrea o estreñimiento.

                Aumento de la sudoración: Algunas personas pueden experimentar sudoración excesiva mientras toman escitalopram.

                Pérdida de apetito o aumento de peso: Puede haber cambios en el apetito que resulten en pérdida o aumento de peso.

                Disminución del deseo sexual o dificultades sexuales: Algunas personas pueden experimentar cambios en la libido o dificultades sexuales.

                Agitación o nerviosismo: En algunos casos, el escitalopram puede causar agitación o nerviosismo.
            """.trimIndent(),
            "Atomoxetina" to """
                Náuseas o malestar estomacal: Algunas personas pueden experimentar náuseas o malestar estomacal al tomar atomoxetina.

                Insomnio o somnolencia: Puede haber cambios en los patrones de sueño, como dificultades para conciliar el sueño (insomnio) o somnolencia excesiva.

                Pérdida de apetito: La atomoxetina puede afectar el apetito, resultando en pérdida de apetito en algunas personas.

                Aumento de la presión arterial y del ritmo cardíaco: La atomoxetina puede elevar la presión arterial y aumentar el ritmo cardíaco en algunos individuos.

                Mareos o vértigo: Algunas personas pueden experimentar sensaciones de mareo o vértigo.

                Dolor abdominal: Puede haber molestias o dolor abdominal en algunos casos.

                Estreñimiento o diarrea: Cambios en los hábitos intestinales, como estreñimiento o diarrea, son posibles efectos secundarios.

                Sequedad bucal: La boca seca es otro efecto secundario que algunas personas pueden experimentar.

                Sudoración excesiva: Algunas personas pueden experimentar sudoración excesiva mientras toman atomoxetina.

                Cambios en el deseo sexual o disfunción eréctil: En algunos casos, la atomoxetina puede afectar la libido o la función sexual.
            """.trimIndent(),
            "Vortioxetina" to """
                Náuseas: Es uno de los efectos secundarios más comunes asociados con la vortioxetina. Por lo general, ocurre al principio del tratamiento y tiende a disminuir con el tiempo.

                Diarrea: Algunas personas pueden experimentar diarrea como efecto secundario.

                Insomnio: Problemas para conciliar el sueño o mantenerlo son posibles al inicio del tratamiento.

                Estreñimiento: Algunas personas pueden experimentar estreñimiento como efecto secundario.

                Sudoración aumentada: Aumento de la transpiración puede ocurrir en algunos pacientes.

                Mareos: Sensación de mareo o aturdimiento.

                Problemas sexuales: Puede afectar la función sexual, causando disfunción eréctil o cambios en la libido.

                Aumento de la presión arterial: En algunos casos, se ha observado un aumento de la presión arterial.
            """.trimIndent(),
            "Aripiprazol" to """
                Náuseas: Algunas personas pueden experimentar náuseas al tomar aripiprazol.

                Insomnio o somnolencia: Puede causar dificultades para dormir en algunas personas, mientras que en otras puede causar somnolencia excesiva.

                Aumento de peso: Al igual que con muchos antipsicóticos, el aripiprazol puede llevar a un aumento de peso en algunas personas.

                Agitación o ansiedad: Algunas personas pueden experimentar agitación o ansiedad al tomar este medicamento.

                Temblor: Puede causar temblores en las extremidades.

                Mareos: Sentir vértigo o mareos es otro efecto secundario posible.

                Problemas gastrointestinales: Algunas personas pueden experimentar problemas gastrointestinales, como estreñimiento.

                Problemas en la boca: Puede haber aumento de la salivación o sequedad en la boca.

                Malestar estomacal: Algunas personas pueden experimentar malestar estomacal o indigestión.
            """.trimIndent(),
            "Asenapina" to """
                Somnolencia: Puede causar somnolencia o sedación, por lo que se recomienda precaución al realizar actividades que requieren atención, como conducir, hasta que se sepa cómo afecta individualmente.

                Aumento de peso: Al igual que con algunos otros antipsicóticos, la asenapina puede estar asociada con un aumento de peso.

                Boca seca: Puede causar sequedad en la boca.

                Síntomas extrapiramidales: Estos son efectos secundarios que afectan al sistema motor y pueden incluir temblores, rigidez muscular, movimientos involuntarios y dificultades en la coordinación.

                Sedación: Algunas personas pueden experimentar sedación o sentirse más cansadas de lo habitual.

                Mareos: Sensación de vértigo o mareo.

                Insomnio o dificultades para dormir: En algunos casos, la asenapina puede afectar el patrón de sueño.

                Aumento de los niveles de glucosa en sangre: Se ha observado un aumento en los niveles de glucosa en sangre en algunas personas que toman asenapina.

                Disminución de la presión arterial: Puede causar hipotensión en algunos individuos.

                Aumento de los triglicéridos: En algunos casos, puede haber un aumento en los niveles de triglicéridos en sangre.
            """.trimIndent(),
            "Brexpiprazol" to """
                Insomnio: Algunas personas pueden experimentar dificultades para conciliar el sueño o mantenerlo.

                Somnolencia: Aunque es menos común que el insomnio, algunas personas pueden experimentar somnolencia o sentirse adormiladas.

                Aumento de peso: Se ha observado que algunos pacientes experimentan un aumento de peso mientras toman brexpiprazol.

                Náuseas: Algunas personas pueden sentir náuseas o malestar estomacal.

                Estreñimiento: El brexpiprazol puede causar estreñimiento en algunos pacientes.

                Aumento de los niveles de glucosa en sangre: Puede haber un aumento en los niveles de glucosa en sangre, por lo que es importante controlar regularmente estos niveles en pacientes con riesgo de diabetes.

                Ansiedad: Algunas personas pueden experimentar un aumento de la ansiedad mientras toman brexpiprazol.

                Aumento de los niveles de prolactina: Este medicamento puede elevar los niveles de prolactina, lo que podría llevar a problemas como la galactorrea (producción de leche en las mamas) en algunos casos.

                Aumento de los niveles de colesterol y triglicéridos: El brexpiprazol puede afectar los niveles de lípidos en la sangre, aumentando el colesterol y los triglicéridos en algunos pacientes.
            """.trimIndent(),
            "Cariprazina" to """
                Insomnio: Puede causar dificultades para conciliar el sueño o mantenerlo.

                Somnolencia: Al igual que con otros antipsicóticos, algunas personas pueden experimentar somnolencia o sentirse adormiladas.

                Náuseas: Se ha observado que la cariprazina puede provocar náuseas en algunos pacientes.

                Estreñimiento: Algunas personas pueden experimentar estreñimiento como efecto secundario.

                Aumento de peso: Puede haber un aumento de peso en algunos pacientes que toman cariprazina.

                Aumento de los niveles de glucosa en sangre: Al igual que con otros antipsicóticos, la cariprazina puede afectar los niveles de glucosa en sangre.

                Aumento de los niveles de prolactina: La cariprazina puede aumentar los niveles de prolactina en la sangre, lo que podría llevar a problemas como la galactorrea en algunos casos.

                Ansiedad: Algunas personas pueden experimentar un aumento de la ansiedad como efecto secundario.

                Aumento de los niveles de creatina fosfoquinasa (CPK): Se ha observado un aumento de los niveles de CPK en algunos pacientes que toman cariprazina.
            """.trimIndent(),
            "Clotiapina" to """
                Somnolencia: La clotiapina puede causar somnolencia, por lo que se recomienda precaución al realizar actividades que requieran alerta mental, como conducir o manejar maquinaria pesada.

                Aumento de peso: Al igual que algunos otros antipsicóticos, la clotiapina se ha asociado con el aumento de peso en algunos pacientes.

                Hipotensión ortostática: Puede causar disminución de la presión arterial al ponerse de pie, lo que puede dar lugar a mareos o desmayos, especialmente al principio del tratamiento.

                Estreñimiento: Algunas personas pueden experimentar estreñimiento como efecto secundario.

                Aumento de los niveles de prolactina: La clotiapina puede elevar los niveles de prolactina en la sangre, lo que puede conducir a problemas como la galactorrea.

                Boca seca: La sequedad en la boca es un efecto secundario común asociado con la clotiapina.

                Aumento de la sensibilidad al sol: Algunas personas pueden volverse más sensibles a la luz solar, lo que aumenta el riesgo de quemaduras solares.

                Trastornos del sueño: La clotiapina puede afectar los patrones de sueño y causar insomnio en algunos pacientes.

                Síntomas extrapiramidales: Se ha informado sobre la posibilidad de desarrollar síntomas extrapiramidales, como temblores, rigidez muscular y movimientos involuntarios, aunque esto es menos común con antipsicóticos atípicos como la clotiapina.
            """.trimIndent(),
            "Clozapina" to """
                Sedación o somnolencia: La clozapina puede causar somnolencia, especialmente al principio del tratamiento o al aumentar la dosis.

                Aumento de peso: Muchas personas experimentan un aumento de peso mientras toman clozapina.

                Sialorrea (salivación excesiva): La clozapina puede causar aumento de la producción de saliva, lo que a veces se denomina hipersalivación.

                Estreñimiento: Algunas personas pueden experimentar estreñimiento como efecto secundario de la clozapina.

                Hipotensión ortostática: Puede causar una disminución de la presión arterial al ponerse de pie, lo que puede llevar a mareos o desmayos.

                Taquicardia: Se ha observado un aumento de la frecuencia cardíaca en algunos pacientes que toman clozapina.

                Agranulocitosis: Este es un efecto secundario grave y potencialmente mortal. La clozapina puede causar una reducción significativa en el número de glóbulos blancos, específicamente granulocitos, lo que aumenta el riesgo de infecciones. Los pacientes que toman clozapina deben someterse a pruebas de recuento sanguíneo regularmente para monitorear este riesgo.

                Hipersensibilidad a la glucosa: La clozapina puede afectar el metabolismo de la glucosa y aumentar el riesgo de diabetes.

                Dislipidemia: Puede haber cambios en los niveles de lípidos en sangre, como un aumento en los niveles de colesterol y triglicéridos.

                Síntomas extrapiramidales: Aunque la clozapina tiene menos propensión a causar síntomas extrapiramidales que otros antipsicóticos, aún puede ocurrir temblor, rigidez y otros movimientos involuntarios.
            """.trimIndent(),
            "Flupentixol" to """
                Sedación: Muchas personas experimentan somnolencia o cansancio, especialmente al inicio del tratamiento.

                Hipotensión ortostática: Esto se refiere a una disminución de la presión arterial al ponerse de pie, lo que puede causar mareos o desmayos.

                Aumento de peso: Algunas personas pueden experimentar un aumento de peso como resultado del tratamiento con flupentixol.

                Boca seca: La sequedad bucal es un efecto secundario común de muchos medicamentos psicotrópicos, incluido el flupentixol.

                Estreñimiento: Algunas personas pueden experimentar dificultades para evacuar.

                Trastornos del movimiento: Pueden ocurrir efectos secundarios relacionados con el movimiento, como temblores, rigidez o movimientos involuntarios.

                Aumento de la prolactina: El flupentixol puede elevar los niveles de prolactina, una hormona que regula la lactancia. Esto puede causar efectos secundarios como galactorrea (producción de leche en las mamas) y trastornos menstruales en mujeres.

                Problemas sexuales: Algunas personas pueden experimentar disfunción sexual como resultado del tratamiento.
            """.trimIndent(),
            "Fluphenazina" to """
                Sedación: Puede causar somnolencia o cansancio, especialmente al principio del tratamiento.

                Hipotensión ortostática: Al ponerse de pie, puede experimentarse una disminución de la presión arterial, lo que puede dar lugar a mareos o incluso desmayos.

                Aumento de peso: Algunas personas pueden experimentar un aumento de peso como resultado del tratamiento con flufenazina.

                Boca seca: La sequedad bucal es un efecto secundario común de muchos antipsicóticos, incluida la flufenazina.

                Estreñimiento: Algunas personas pueden experimentar dificultades para evacuar.

                Trastornos del movimiento: Pueden ocurrir efectos secundarios extrapiramidales, como temblores, rigidez muscular o movimientos involuntarios.

                Aumento de la prolactina: La flufenazina puede aumentar los niveles de prolactina, lo que puede causar efectos secundarios como galactorrea (producción de leche en las mamas) y trastornos menstruales en mujeres.

                Problemas sexuales: La disfunción sexual también puede ser un efecto secundario en algunas personas.

                Alteraciones en la función cognitiva: Puede afectar la concentración y la memoria en algunas personas.
            """.trimIndent(),
            "Risperidona" to """
                Sedación: Puede causar somnolencia o fatiga, especialmente al inicio del tratamiento.

                Aumento de peso: Algunas personas pueden experimentar un aumento de peso mientras toman risperidona.

                Mareos: Pueden ocurrir episodios de mareo, especialmente al ponerse de pie rápidamente.

                Hipotensión ortostática: Una disminución de la presión arterial al levantarse, lo que puede provocar mareos o desmayos.

                Boca seca: La sequedad bucal es un efecto secundario común.

                Estreñimiento: Puede causar dificultades para evacuar en algunas personas.

                Aumento de la prolactina: La risperidona puede aumentar los niveles de prolactina, lo que puede causar efectos secundarios como galactorrea (producción de leche en las mamas) y trastornos menstruales en mujeres.

                Trastornos del movimiento: Pueden ocurrir efectos secundarios extrapiramidales, como temblores, rigidez muscular o movimientos involuntarios.

                Disfunción sexual: Algunas personas pueden experimentar problemas sexuales como resultado del tratamiento.

                Alteraciones en los niveles de glucosa: Puede afectar los niveles de glucosa en sangre, por lo que es importante monitorear la glucosa en personas con diabetes.

                Prolongación del intervalo QT: La risperidona puede afectar el intervalo QT en el electrocardiograma, aunque casos graves son raros.
            """.trimIndent(),
            "Sertindol" to """
                Prolongación del intervalo QT: Uno de los efectos secundarios más significativos y específicos de sertindol es la prolongación del intervalo QT en el electrocardiograma. Esto puede aumentar el riesgo de arritmias cardíacas graves. Por esta razón, su uso se asocia con monitoreo regular del electrocardiograma.

                Somnolencia: Al igual que otros antipsicóticos, sertindol puede causar somnolencia o fatiga.

                Hipotensión ortostática: Puede haber una disminución de la presión arterial al ponerse de pie, lo que puede causar mareos o desmayos.

                Aumento de peso: Algunas personas pueden experimentar un aumento de peso durante el tratamiento.

                Mareos: Pueden ocurrir episodios de mareo, especialmente al cambiar de posición rápidamente.

                Boca seca: La sequedad bucal es un efecto secundario común.

                Alteraciones en los niveles de glucosa: Sertindol puede afectar los niveles de glucosa en sangre, por lo que es importante monitorear la glucosa en personas con diabetes.

                Trastornos del movimiento: Pueden ocurrir efectos secundarios extrapiramidales, como temblores, rigidez muscular o movimientos involuntarios.

                Alteraciones en los lípidos: Puede haber cambios en los niveles de lípidos en sangre.
            """.trimIndent(),
            "Paliperidona" to """
                Sedación: Puede causar somnolencia o fatiga, especialmente al principio del tratamiento.

                Aumento de peso: Algunas personas pueden experimentar un aumento de peso durante el tratamiento.

                Mareos: Pueden ocurrir episodios de mareo, especialmente al ponerse de pie rápidamente.

                Hipotensión ortostática: Una disminución de la presión arterial al levantarse, lo que puede provocar mareos o desmayos.

                Molestias gastrointestinales: Pueden incluir náuseas, vómitos o malestar estomacal.

                Boca seca: La sequedad bucal es un efecto secundario común.

                Estreñimiento: Algunas personas pueden experimentar dificultades para evacuar.

                Trastornos del movimiento: Pueden ocurrir efectos secundarios extrapiramidales, como temblores, rigidez muscular o movimientos involuntarios.

                Aumento de la prolactina: La paliperidona puede aumentar los niveles de prolactina, lo que puede causar efectos secundarios como galactorrea (producción de leche en las mamas) y trastornos menstruales en mujeres.

                Disfunción sexual: Algunas personas pueden experimentar problemas sexuales como resultado del tratamiento.

                Insomnio o somnolencia excesiva: Puede afectar el patrón de sueño, causando insomnio en algunas personas o, por el contrario, somnolencia excesiva.
            """.trimIndent(),
            "Citalopram" to """
                Náuseas: Algunas personas pueden experimentar sensación de malestar estomacal o náuseas al tomar citalopram.

                Boca seca: La sequedad bucal es un efecto secundario común de muchos antidepresivos, incluido el citalopram.

                Somnolencia: Puede causar cansancio o somnolencia, especialmente al principio del tratamiento.

                Insomnio: En algunos casos, el citalopram puede interferir con el sueño y causar dificultades para conciliar el sueño.

                Aumento o pérdida de peso: Algunas personas pueden experimentar cambios en el apetito que resultan en aumento o pérdida de peso.

                Sudoración excesiva: El citalopram puede aumentar la sudoración en algunas personas.

                Mareos: Pueden ocurrir episodios de mareo, especialmente al levantarse rápidamente.

                Dolores de cabeza: Algunas personas pueden experimentar dolores de cabeza como efecto secundario.

                Trastornos gastrointestinales: Pueden ocurrir problemas como diarrea o estreñimiento.

                Disminución del deseo sexual o dificultades sexuales: El citalopram, al igual que otros ISRS, puede afectar la libido y la función sexual en algunas personas.
            """.trimIndent(),
            "Olanzapina" to """
                Aumento de peso: La olanzapina está asociada comúnmente con el aumento de peso, que puede ocurrir rápidamente después de comenzar el tratamiento.

                Somnolencia: Puede causar sedación y somnolencia, especialmente al principio del tratamiento.

                Boca seca: La sequedad bucal es un efecto secundario común.

                Estreñimiento: Algunas personas pueden experimentar dificultades para evacuar.

                Aumento de los niveles de glucosa: La olanzapina puede estar asociada con el aumento de los niveles de glucosa en sangre, lo que puede ser relevante para personas con diabetes.

                Trastornos del movimiento: Pueden ocurrir efectos secundarios extrapiramidales, como temblores, rigidez muscular o movimientos involuntarios.

                Hipotensión ortostática: Puede haber una disminución de la presión arterial al ponerse de pie, lo que puede causar mareos o desmayos.

                Mareos: Pueden ocurrir episodios de mareo, especialmente al cambiar de posición rápidamente.

                Aumento de la prolactina: La olanzapina puede aumentar los niveles de prolactina, lo que puede causar efectos secundarios como galactorrea (producción de leche en las mamas) y trastornos menstruales en mujeres.

                Disfunción sexual: Al igual que otros antipsicóticos, la olanzapina puede afectar la libido y la función sexual.

                Alteraciones en los lípidos: Puede haber cambios en los niveles de lípidos en sangre, incluido el colesterol.
            """.trimIndent(),
            "Melperona" to """
                Somnolencia: La melperona puede causar sedación y somnolencia, especialmente al principio del tratamiento.

                Hipotensión ortostática: Puede haber una disminución de la presión arterial al ponerse de pie, lo que puede causar mareos o desmayos.

                Mareos: Pueden ocurrir episodios de mareo, especialmente al cambiar de posición rápidamente.

                Sequedad bucal: La melperona puede causar sequedad en la boca.

                Aumento de peso: Al igual que algunos otros antipsicóticos, la melperona puede estar asociada con el aumento de peso.

                Trastornos gastrointestinales: Pueden ocurrir problemas como estreñimiento.

                Trastornos del movimiento: Pueden ocurrir efectos secundarios extrapiramidales, como temblores, rigidez muscular o movimientos involuntarios.

                Aumento de la prolactina: La melperona puede elevar los niveles de prolactina, lo que puede causar efectos secundarios como galactorrea (producción de leche en las mamas) y trastornos menstruales en mujeres.

                Trastornos del sueño: Puede afectar los patrones de sueño y causar insomnio en algunas personas.

                Alteraciones en la función cognitiva: Algunas personas pueden experimentar dificultades cognitivas, como confusión o problemas de concentración.
            """.trimIndent(),
            "Loxapina" to """
                Somnolencia: Puede causar una sensación de sueño o fatiga, especialmente al principio del tratamiento.

                Mareo: Algunas personas pueden experimentar mareos o vértigo.

                Aumento de peso: Al igual que con muchos antipsicóticos, la loxapina puede estar asociada con ganancia de peso.

                Boca seca: Puede causar sequedad en la boca.

                Estreñimiento: Algunas personas pueden experimentar dificultades para evacuar.

                Visión borrosa: Puede afectar la visión y causar problemas de enfoque.

                Aumento de la prolactina: Puede causar un aumento en los niveles de prolactina, una hormona asociada con la lactancia. Esto puede llevar a efectos secundarios como galactorrea (producción de leche en los pechos), irregularidades menstruales y disminución del deseo sexual.

                Hipotensión ortostática: Puede provocar una disminución de la presión arterial al ponerse de pie, lo que puede causar mareos.

                Aumento de la glucosa en sangre: Puede aumentar los niveles de azúcar en sangre, por lo que las personas con diabetes deben ser monitoreadas de cerca.

                Trastornos extrapiramidales: Puede causar efectos secundarios relacionados con el sistema motor, como temblores, rigidez y movimientos involuntarios.
            """.trimIndent(),
            "Levomepromazina" to """
                Somnolencia: Puede causar una sensación de sueño o fatiga, especialmente al principio del tratamiento.

                Hipotensión ortostática: Puede provocar una disminución de la presión arterial al ponerse de pie, lo que puede causar mareos.

                Taquicardia: Aumento de la frecuencia cardíaca.

                Boca seca: Puede causar sequedad en la boca.

                Visión borrosa: Puede afectar la visión y causar problemas de enfoque.

                Estreñimiento: Algunas personas pueden experimentar dificultades para evacuar.

                Retención urinaria: Puede afectar la capacidad para orinar.

                Aumento de peso: Al igual que con muchos antipsicóticos, la levomepromazina puede estar asociada con ganancia de peso.

                Síndrome neuroléptico maligno (SNM): Aunque es raro, la levomepromazina puede causar SNM, una reacción grave que incluye fiebre, rigidez muscular, confusión y cambios en la presión arterial.

                Disquinesia tardía: En algunos casos, el uso prolongado de antipsicóticos como la levomepromazina puede estar asociado con la aparición de movimientos involuntarios, especialmente en la cara.

                Aumento de la prolactina: Al igual que con otros antipsicóticos, la levomepromazina puede aumentar los niveles de prolactina, lo que puede llevar a efectos secundarios como galactorrea (producción de leche en los pechos), irregularidades menstruales y disminución del deseo sexual.
            """.trimIndent(),
            "Levosulpirida" to """
                Trastornos gastrointestinales: Puede causar efectos secundarios relacionados con el sistema digestivo, como náuseas, vómitos, indigestión y malestar abdominal.

                Aumento de la prolactina: Al igual que otros antipsicóticos, la levosulpirida puede aumentar los niveles de prolactina en sangre, lo que puede llevar a efectos secundarios como galactorrea (producción de leche en los pechos), irregularidades menstruales y disminución del deseo sexual.

                Sedación o somnolencia: Puede causar una sensación de sueño o fatiga, especialmente al principio del tratamiento.

                Aumento de peso: Algunas personas pueden experimentar ganancia de peso como efecto secundario.

                Mareos: Puede provocar mareos o vértigo.

                Hipotensión ortostática: Puede causar una disminución de la presión arterial al ponerse de pie, lo que puede dar lugar a mareos.

                Aumento de la transaminasa hepática: En algunos casos, puede haber elevaciones en las enzimas hepáticas.

                Agitación o inquietud: Algunas personas pueden experimentar agitación o inquietud como efecto secundario.
            """.trimIndent(),
            "Trifluoperazina" to """
                Sedación o somnolencia: La trifluoperazina puede causar una sensación de sueño o fatiga, especialmente al principio del tratamiento.

                Hipotensión ortostática: Puede provocar una disminución de la presión arterial al ponerse de pie, lo que puede dar lugar a mareos.

                Mareos o vértigo: Algunas personas pueden experimentar mareos o sensación de girar.

                Boca seca: La trifluoperazina puede causar sequedad en la boca.

                Estreñimiento: Puede haber dificultades para evacuar.

                Visión borrosa: Puede afectar la visión y causar problemas de enfoque.

                Aumento de peso: Al igual que con muchos antipsicóticos, la trifluoperazina puede estar asociada con ganancia de peso.

                Aumento de la prolactina: Puede elevar los niveles de prolactina en sangre, lo que puede llevar a efectos secundarios como galactorrea (producción de leche en los pechos), irregularidades menstruales y disminución del deseo sexual.

                Temblor o movimientos involuntarios: Puede provocar temblores o movimientos involuntarios, especialmente a dosis más altas.

                Síndrome neuroléptico maligno (SNM): Aunque es raro, la trifluoperazina puede desencadenar SNM, una reacción grave que incluye fiebre, rigidez muscular, confusión y cambios en la presión arterial.
            """.trimIndent(),
            "Amoxapina" to """
                Sedación: Puede causar somnolencia o fatiga, especialmente al principio del tratamiento.

                Boca seca: La amoxapina puede reducir la producción de saliva, lo que resulta en sequedad bucal.

                Estreñimiento: Algunas personas pueden experimentar dificultades para evacuar.

                Visión borrosa: Puede afectar la visión y causar problemas de enfoque.

                Ortostatismo: Puede provocar hipotensión ortostática, es decir, una disminución de la presión arterial al ponerse de pie, lo que puede causar mareos o desmayos.

                Retención urinaria: Puede afectar la capacidad para orinar.

                Aumento de peso: Al igual que algunos otros antidepresivos tricíclicos, la amoxapina puede estar asociada con ganancia de peso.

                Temblor: Algunas personas pueden experimentar temblores como efecto secundario.

                Trastornos del sueño: Puede causar insomnio o alteraciones en los patrones de sueño.

                Aumento de la sudoración: Puede provocar sudoración excesiva.
            """.trimIndent(),
            "Oxitriptán(5-HTP)" to """
                Malestar gastrointestinal: Puede causar náuseas, vómitos o dolor abdominal en algunos casos.

                Insomnio: Algunas personas experimentan dificultades para conciliar el sueño o mantenerse dormidas después de tomar 5-HTP.

                Sensación de somnolencia: Aunque el insomnio es un efecto secundario posible, algunas personas experimentan somnolencia excesiva durante el día.

                Dolor muscular: Algunas personas informan de dolor muscular o sensibilidad después de tomar 5-HTP.

                Mareos: Puede causar mareos o una sensación de desequilibrio en algunas personas.

                Aumento de la frecuencia cardíaca: En algunos casos, el 5-HTP puede llevar a un aumento en la frecuencia cardíaca.

                Síndrome serotoninérgico: Aunque raro, el uso excesivo de 5-HTP puede contribuir al síndrome serotoninérgico, que es una condición potencialmente grave asociada con un exceso de serotonina en el cuerpo. Los síntomas pueden incluir confusión, agitación, fiebre, sudoración, aumento de la frecuencia cardíaca, espasmos musculares y otros.
            """.trimIndent(),
            "Trazodona" to """
                Somnolencia: La trazodona es conocida por su capacidad para inducir somnolencia, y a menudo se prescribe en dosis más bajas como ayuda para dormir.

                Boca seca: La sequedad en la boca es un efecto secundario común de la trazodona.

                Mareos: Algunas personas pueden experimentar mareos o sentirse aturdidas al tomar trazodona.

                Visión borrosa: La trazodona puede afectar la visión y causar visión borrosa en algunas personas.

                Estreñimiento o diarrea: Problemas gastrointestinales como estreñimiento o diarrea son efectos secundarios posibles.

                Aumento de peso: Algunas personas pueden experimentar un aumento de peso como resultado del uso de trazodona.

                Náuseas o malestar estomacal: Algunas personas pueden experimentar náuseas o malestar estomacal al tomar este medicamento.

                Cambio en la libido: La trazodona puede afectar la función sexual y, en algunos casos, causar cambios en la libido.

                Sudoración excesiva: La trazodona puede llevar a sudoración excesiva, especialmente durante la noche.

                Confusión en personas mayores: En adultos mayores, la trazodona puede aumentar el riesgo de confusión.
            """.trimIndent(),
            "Vilazodona" to """
                Náuseas: La náusea es uno de los efectos secundarios más comunes de la vilazodona. Puede ayudar tomar el medicamento con alimentos para reducir este efecto.

                Diarrea: Algunas personas pueden experimentar diarrea como efecto secundario de la vilazodona.

                Insomnio o somnolencia: Puede afectar el patrón del sueño, y algunas personas pueden experimentar insomnio o, por el contrario, sentirse somnolientas.

                Mareos: La vilazodona puede causar mareos en algunas personas.

                Boca seca: La sequedad en la boca es otro efecto secundario posible.

                Estreñimiento: Al igual que la diarrea, el estreñimiento también puede ser un efecto secundario gastrointestinal.

                Aumento de la sudoración: Algunas personas pueden experimentar un aumento en la sudoración al tomar vilazodona.

                Problemas sexuales: Puede afectar la función sexual, como disminución del deseo sexual o dificultades en la erección o la eyaculación.

                Dolor de cabeza: Algunas personas pueden experimentar dolores de cabeza como efecto secundario.

                Temblor: En algunos casos, la vilazodona puede causar temblores leves.
            """.trimIndent(),
            "Lisdexanfetamina" to """
                Insomnio: Puede causar dificultades para conciliar el sueño o mantenerse dormido, especialmente si se toma en horas cercanas al momento de acostarse.

                Pérdida del apetito: La lisdexanfetamina puede disminuir el apetito, lo que puede llevar a la pérdida de peso.

                Náuseas: Algunas personas pueden experimentar náuseas como efecto secundario.

                Dolor abdominal: Se ha informado dolor abdominal en algunos casos.

                Boca seca: La sequedad en la boca es un efecto secundario común de los estimulantes como la lisdexanfetamina.

                Aumento de la presión arterial y frecuencia cardíaca: Este medicamento puede aumentar la presión arterial y la frecuencia cardíaca, por lo que es importante monitorear estos parámetros durante el tratamiento.

                Irritabilidad o ansiedad: Algunas personas pueden experimentar irritabilidad o ansiedad como efecto secundario.

                Sudoración excesiva: La lisdexanfetamina puede aumentar la sudoración en algunas personas.

                Mareos: Se ha informado de casos de mareos en usuarios de lisdexanfetamina.

                Cambios en el estado de ánimo: Puede afectar el estado de ánimo y, en algunos casos, aumentar el riesgo de cambios en el estado de ánimo, incluida la exacerbación de la depresión.
            """.trimIndent(),
            "Maprotilina" to """
                Sedación: La maprotilina puede causar somnolencia o sedación, por lo que a menudo se administra en la noche para minimizar este efecto.

                Boca seca: La sequedad en la boca es un efecto secundario común de los antidepresivos tricíclicos, incluida la maprotilina.

                Estreñimiento: Algunas personas pueden experimentar estreñimiento mientras toman maprotilina.

                Aumento de peso: Puede estar asociada con ganancia de peso en algunas personas.

                Visión borrosa: La maprotilina puede afectar la visión y causar visión borrosa en algunos casos.

                Orinar con dificultad: Puede causar dificultades para orinar o retención urinaria en algunas personas.

                Mareos: Algunas personas pueden experimentar mareos al ponerse de pie o cambiar de posición.

                Taquicardia: Puede aumentar la frecuencia cardíaca en algunas personas.

                Sudoración excesiva: La maprotilina puede causar sudoración excesiva, especialmente durante la noche.

                Náuseas y vómitos: Algunas personas pueden experimentar náuseas o vómitos como efecto secundario.

                Temblor: En algunos casos, la maprotilina puede causar temblores finos en las manos.
            """.trimIndent(),
            "Mianserina" to """
                Sedación: La mianserina a menudo está asociada con sedación o somnolencia, por lo que generalmente se toma antes de acostarse.

                Aumento de peso: Puede estar relacionada con un aumento de peso en algunas personas.

                Boca seca: La sequedad en la boca es un efecto secundario común de muchos antidepresivos, incluida la mianserina.

                Estreñimiento: Al igual que con otros antidepresivos, la mianserina puede causar estreñimiento en algunas personas.

                Mareos: Algunas personas pueden experimentar mareos al tomar mianserina.

                Visión borrosa: La mianserina puede afectar la visión y causar visión borrosa en algunos casos.

                Náuseas: Puede provocar náuseas en algunas personas.

                Aumento de la sudoración: La mianserina puede causar un aumento en la sudoración.

                Confusión en personas mayores: En adultos mayores, la mianserina puede aumentar el riesgo de confusión.

                Hipotensión ortostática: Puede provocar una disminución de la presión arterial al ponerse de pie, lo que puede causar mareos o incluso desmayos.

                Problemas sexuales: Como con muchos antidepresivos, la mianserina puede afectar la función sexual.
            """.trimIndent(),
            "Mirtazapina" to """
                Sedación: La mirtazapina es conocida por causar sedación, y a menudo se prescribe en dosis más bajas antes de dormir para ayudar a mejorar el sueño.

                Aumento de peso: Puede estar asociada con un aumento de peso en algunas personas.

                Boca seca: La sequedad en la boca es un efecto secundario común de la mirtazapina.

                Somnolencia durante el día: Algunas personas pueden experimentar somnolencia durante el día después de tomar mirtazapina.

                Aumento del apetito: Puede aumentar el apetito en algunas personas.

                Estreñimiento: Al igual que con otros antidepresivos, la mirtazapina puede causar estreñimiento en algunas personas.

                Mareos: Se ha informado de mareos en algunos casos.

                Visión borrosa: La mirtazapina puede afectar la visión y causar visión borrosa en algunos casos.

                Baja presión arterial al ponerse de pie: Puede causar una disminución de la presión arterial al ponerse de pie, lo que se conoce como hipotensión ortostática.

                Problemas sexuales: Como con muchos antidepresivos, la mirtazapina puede afectar la función sexual.

                Confusión en personas mayores: En adultos mayores, la mirtazapina puede aumentar el riesgo de confusión.
            """.trimIndent(),
            "Nefazodona" to """
                Náuseas: Puede causar molestias gástricas, incluyendo náuseas, en algunas personas.

                Vértigo o mareos: Se han informado mareos o vértigo como efectos secundarios en algunos usuarios de nefazodona.

                Estreñimiento: Puede causar estreñimiento en algunas personas.

                Visión borrosa: Alteraciones visuales, como visión borrosa, han sido reportadas.

                Sedación: La nefazodona puede causar somnolencia o sedación en algunas personas.

                Insomnio: Aunque puede causar somnolencia en algunos, también puede contribuir a problemas de insomnio en otros.

                Sequedad en la boca: La nefazodona puede estar asociada con sequedad en la boca.

                Disfunción sexual: Como muchos antidepresivos, la nefazodona puede afectar la función sexual, incluyendo la libido y la capacidad de alcanzar o mantener una erección.

                Aumento de peso: Al igual que algunos otros antidepresivos, la nefazodona puede estar asociada con un aumento de peso en algunas personas.

                Hepatotoxicidad: Aunque no es un efecto secundario menor, la hepatotoxicidad es una preocupación importante asociada con la nefazodona y fue una de las razones para su retirada del mercado en algunos lugares.
            """.trimIndent(),
            "Reboxetina" to """
                Insomnio: Algunas personas pueden experimentar dificultades para conciliar el sueño o mantenerse dormidas.

                Sedación: Aunque menos común que el insomnio, algunas personas pueden experimentar somnolencia o sedación.

                Náuseas: La reboxetina puede causar malestar estomacal y náuseas en algunas personas.

                Estreñimiento: El estreñimiento es otro efecto secundario gastrointestinal posible.

                Boca seca: La sequedad en la boca es un efecto secundario común de los inhibidores selectivos de la recaptación de norepinefrina, incluida la reboxetina.

                Aumento de la presión arterial y la frecuencia cardíaca: Puede aumentar la presión arterial y la frecuencia cardíaca en algunas personas.

                Mareos: Se ha informado de mareos en algunos usuarios de reboxetina.

                Sudoración excesiva: La reboxetina puede aumentar la sudoración en algunas personas.

                Problemas sexuales: Como con muchos antidepresivos, la reboxetina puede afectar la función sexual, incluyendo la libido y la función eréctil.

                Pérdida de apetito: Algunas personas pueden experimentar una disminución del apetito.
            """.trimIndent(),
            "Amitriptilina" to """
                Sedación: La amitriptilina puede causar somnolencia, por lo que se suele tomar por la noche para minimizar este efecto.

                Boca seca: Este es un efecto secundario frecuente y puede aliviarse bebiendo agua o chupando caramelos sin azúcar.

                Visión borrosa: Algunas personas pueden experimentar visión borrosa o problemas para enfocar debido a la dilatación de las pupilas.

                Estreñimiento: La amitriptilina puede afectar la función intestinal y causar estreñimiento en algunas personas.

                Aumento de peso: Algunas personas pueden experimentar un aumento de peso mientras toman amitriptilina.

                Latidos cardíacos irregulares: La amitriptilina puede afectar el ritmo cardíaco en algunos casos.

                Retención urinaria: Puede haber dificultades para orinar en algunas personas.

                Baja presión arterial al ponerse de pie: Esto puede causar mareos o desmayos al levantarse rápidamente.

                Sudoración excesiva: Algunas personas pueden experimentar aumento de la sudoración.

                Náuseas y malestar estomacal: Pueden ocurrir problemas gastrointestinales en algunas personas.
            """.trimIndent(),
            "Bupropión" to """
                Insomnio: El bupropión puede causar dificultades para conciliar el sueño o mantenerlo, especialmente si se toma cerca de la hora de acostarse. A veces, el médico puede recomendar tomar la dosis por la mañana para minimizar este efecto.

                Boca seca: La sequedad bucal es un efecto secundario común.

                Dolor de cabeza: Algunas personas pueden experimentar dolores de cabeza como resultado del uso de bupropión.

                Náuseas: Puede haber malestar estomacal o náuseas, especialmente al principio del tratamiento.

                Cambios en el apetito: Puede haber aumento o pérdida del apetito.

                Temblor: En algunos casos, las personas pueden experimentar temblores, especialmente en las manos.

                Aumento de la sudoración: El bupropión puede causar sudoración excesiva en algunas personas.

                Mareos: Algunas personas pueden sentirse mareadas o experimentar vértigo.

                Estreñimiento o diarrea: Puede haber cambios en los hábitos intestinales.

                Aumento de la frecuencia cardíaca: El bupropión puede tener efectos sobre el ritmo cardíaco en algunas personas.

                Aumento de la presión arterial: En algunos casos, se ha observado un aumento de la presión arterial.
            """.trimIndent(),
            "Desipramina" to """
                Boca seca: La desipramina puede causar sequedad en la boca.

                Estreñimiento: Puede haber una disminución de la frecuencia de las evacuaciones intestinales.

                Visión borrosa: Algunas personas pueden experimentar visión borrosa o problemas de enfoque.

                Mareos o vértigo: Pueden ocurrir episodios de mareo, especialmente al ponerse de pie rápidamente.

                Somnolencia o insomnio: La desipramina puede afectar los patrones de sueño, causando somnolencia en algunos casos y dificultades para dormir en otros.

                Aumento de peso: Al igual que algunos otros antidepresivos, la desipramina puede estar asociada con el aumento de peso en algunas personas.

                Aumento del ritmo cardíaco: Puede haber un aumento en la frecuencia cardíaca o cambios en el ritmo cardíaco.

                Presión arterial baja al ponerse de pie: Esto puede causar mareos o desmayos al levantarse rápidamente.

                Náuseas o malestar estomacal: Algunas personas pueden experimentar molestias gastrointestinales.

                Sudoración excesiva: La desipramina puede causar aumento de la sudoración.

                Problemas sexuales: Pueden surgir disfunciones sexuales, como la disminución del deseo sexual o la dificultad para alcanzar el orgasmo.
            """.trimIndent(),
            "Doxepina" to """
                Somnolencia: La doxepina puede causar somnolencia, y generalmente se prescribe en dosis más bajas para ayudar a mejorar el sueño en pacientes con insomnio.

                Mareos: Algunas personas pueden experimentar mareos, especialmente al ponerse de pie rápidamente.

                Boca seca: La doxepina puede provocar sequedad en la boca.

                Estreñimiento: Puede haber una disminución de la frecuencia de las evacuaciones intestinales.

                Visión borrosa: Al igual que con otros antidepresivos tricíclicos, la doxepina puede afectar la visión y causar problemas de enfoque.

                Aumento de peso: Algunas personas pueden experimentar aumento de peso como efecto secundario.

                Retención urinaria: En algunas personas, la doxepina puede dificultar la micción.

                Problemas sexuales: Pueden surgir disfunciones sexuales, como la disminución del deseo sexual o la dificultad para alcanzar el orgasmo.

                Latidos cardíacos irregulares: La doxepina puede afectar el ritmo cardíaco en algunos casos.

                Sudoración excesiva: Puede haber un aumento de la sudoración.
            """.trimIndent(),
            "Imipramina" to """
                Somnolencia: La imipramina puede causar sedación, y se suele tomar por la noche para minimizar este efecto.

                Mareos: Algunas personas pueden experimentar mareos, especialmente al levantarse rápidamente.

                Boca seca: La imipramina puede provocar sequedad en la boca.

                Visión borrosa: Al igual que otros antidepresivos tricíclicos, la imipramina puede afectar la visión y causar problemas de enfoque.

                Estreñimiento: Puede haber una disminución de la frecuencia de las evacuaciones intestinales.

                Aumento de peso: Al igual que con algunos otros antidepresivos, la imipramina puede estar asociada con el aumento de peso en algunas personas.

                Retención urinaria: En algunas personas, la imipramina puede dificultar la micción.

                Problemas sexuales: Pueden surgir disfunciones sexuales, como la disminución del deseo sexual o la dificultad para alcanzar el orgasmo.

                Latidos cardíacos irregulares: La imipramina puede afectar el ritmo cardíaco en algunos casos.

                Sudoración excesiva: Puede haber un aumento de la sudoración.

                Náuseas y malestar estomacal: Algunas personas pueden experimentar molestias gastrointestinales.
            """.trimIndent(),
            "Nortriptilina" to """
                Somnolencia: La nortriptilina puede causar sedación, y a menudo se toma por la noche para minimizar este efecto.

                Mareos: Algunas personas pueden experimentar mareos, especialmente al levantarse rápidamente.

                Boca seca: La nortriptilina puede provocar sequedad en la boca.

                Estreñimiento: Puede haber una disminución de la frecuencia de las evacuaciones intestinales.

                Aumento de peso: Al igual que con algunos otros antidepresivos, la nortriptilina puede estar asociada con el aumento de peso en algunas personas.

                Visión borrosa: Puede haber problemas de enfoque y visión borrosa.

                Retención urinaria: En algunas personas, la nortriptilina puede dificultar la micción.

                Problemas sexuales: Pueden surgir disfunciones sexuales, como la disminución del deseo sexual o la dificultad para alcanzar el orgasmo.

                Latidos cardíacos irregulares: La nortriptilina puede afectar el ritmo cardíaco en algunos casos.

                Sudoración excesiva: Puede haber un aumento de la sudoración.

                Náuseas y malestar estomacal: Algunas personas pueden experimentar molestias gastrointestinales.
            """.trimIndent(),
            "Trimipramina" to """
                Somnolencia: La trimipramina puede causar sedación, y a menudo se toma por la noche para minimizar este efecto.

                Mareos: Algunas personas pueden experimentar mareos, especialmente al levantarse rápidamente.

                Boca seca: La trimipramina puede provocar sequedad en la boca.

                Estreñimiento: Puede haber una disminución de la frecuencia de las evacuaciones intestinales.

                Aumento de peso: Al igual que con algunos otros antidepresivos, la trimipramina puede estar asociada con el aumento de peso en algunas personas.

                Visión borrosa: Puede haber problemas de enfoque y visión borrosa.

                Retención urinaria: En algunas personas, la trimipramina puede dificultar la micción.

                Problemas sexuales: Pueden surgir disfunciones sexuales, como la disminución del deseo sexual o la dificultad para alcanzar el orgasmo.

                Latidos cardíacos irregulares: La trimipramina puede afectar el ritmo cardíaco en algunos casos.

                Sudoración excesiva: Puede haber un aumento de la sudoración.

                Náuseas y malestar estomacal: Algunas personas pueden experimentar molestias gastrointestinales.

                Confusión o problemas cognitivos: En algunos casos, la trimipramina puede causar confusión o problemas de memoria.
            """.trimIndent(),
            "Venlafaxina" to """
                Náuseas: La venlafaxina puede causar sensación de náuseas en algunas personas, especialmente al principio del tratamiento.

                Insomnio o somnolencia: Puede haber dificultades para conciliar el sueño o, en algunos casos, somnolencia excesiva.

                Boca seca: La venlafaxina puede causar sequedad en la boca.

                Estreñimiento o problemas gastrointestinales: Algunas personas pueden experimentar estreñimiento u otros problemas gastrointestinales.

                Pérdida de apetito o aumento de peso: La venlafaxina puede afectar el apetito, y algunas personas pueden experimentar pérdida de apetito, mientras que otras pueden experimentar aumento de peso.

                Sudoración excesiva: Puede haber un aumento de la sudoración, especialmente por las noches.

                Dificultades sexuales: Pueden surgir problemas sexuales, como la disminución del deseo sexual, la dificultad para alcanzar el orgasmo o la disfunción eréctil.

                Aumento de la presión arterial: En algunos casos, la venlafaxina puede elevar la presión arterial.

                Mareos o vértigo: Algunas personas pueden experimentar mareos o sensación de vértigo.

                Dolor de cabeza: Los dolores de cabeza son un efecto secundario común.

                Agitación o nerviosismo: Puede haber un aumento de la agitación o la ansiedad en algunas personas.

                Problemas con la memoria o la concentración: Algunas personas pueden experimentar dificultades con la memoria o la concentración.
            """.trimIndent(),
            "Agomelatina" to """
                Dolor de cabeza: Algunas personas pueden experimentar dolores de cabeza durante el tratamiento con agomelatina.

                Somnolencia o cansancio: La agomelatina puede causar somnolencia o una sensación general de cansancio, por lo que se suele tomar por la noche.

                Insomnio: Aunque es menos común en comparación con otros antidepresivos, algunas personas pueden experimentar dificultades para conciliar el sueño.

                Problemas gastrointestinales: Pueden ocurrir problemas como náuseas, diarrea o malestar estomacal.

                Mareos: Algunas personas pueden experimentar mareos o vértigo.

                Aumento de peso: Aunque la agomelatina generalmente tiene menos efecto sobre el peso en comparación con algunos otros antidepresivos, algunas personas pueden experimentar un aumento de peso.

                Dolor en la espalda o las extremidades: Se han informado casos de dolor musculoesquelético asociado con la agomelatina.

                Aumento de las enzimas hepáticas: En algunos casos, la agomelatina puede afectar las pruebas de función hepática.
            """.trimIndent(),
            "Agomelatina" to """
                Dolor de cabeza: Algunas personas pueden experimentar dolores de cabeza durante el tratamiento con agomelatina.

                Somnolencia o cansancio: La agomelatina puede causar somnolencia o una sensación general de cansancio, por lo que se suele tomar por la noche.

                Insomnio: Aunque es menos común en comparación con otros antidepresivos, algunas personas pueden experimentar dificultades para conciliar el sueño.

                Problemas gastrointestinales: Pueden ocurrir problemas como náuseas, diarrea o malestar estomacal.

                Mareos: Algunas personas pueden experimentar mareos o vértigo.

                Aumento de peso: Aunque la agomelatina generalmente tiene menos efecto sobre el peso en comparación con algunos otros antidepresivos, algunas personas pueden experimentar un aumento de peso.

                Dolor en la espalda o las extremidades: Se han informado casos de dolor musculoesquelético asociado con la agomelatina.

                Aumento de las enzimas hepáticas: En algunos casos, la agomelatina puede afectar las pruebas de función hepática.
            """.trimIndent(),
            "Milnaciprán" to """
                Náuseas: Algunas personas pueden experimentar náuseas como efecto secundario del milnaciprán.

                Dolor de cabeza: Los dolores de cabeza son otro efecto secundario común.

                Estreñimiento o diarrea: Algunas personas pueden experimentar cambios en los hábitos intestinales.

                Insomnio o somnolencia: El milnaciprán puede afectar los patrones de sueño, ya sea causando insomnio en algunas personas o somnolencia en otras.

                Aumento de la sudoración: Algunas personas pueden experimentar un aumento en la transpiración.

                Boca seca: La sequedad bucal es otro efecto secundario posible.

                Aumento de la frecuencia cardíaca: En algunos casos, se ha observado un aumento en la frecuencia cardíaca.

                Presión arterial elevada: Puede haber un aumento en la presión arterial en algunas personas.

                Mareos: Algunas personas pueden experimentar mareos o vértigo.

                Cambios en el apetito: Puede haber cambios en el apetito, como pérdida o aumento de peso.
            """.trimIndent(),
            "Clorazepato" to """
                Somnolencia: La somnolencia es un efecto secundario común de las benzodiazepinas, incluido el clorazepato.

                Mareos: Puedes experimentar sensación de mareo o aturdimiento.

                Dificultades de coordinación: Algunas personas pueden experimentar problemas de coordinación motora.

                Confusión: La confusión mental es un efecto secundario posible, especialmente en personas sensibles o mayores.

                Dolor de cabeza: Al igual que con muchos medicamentos, el clorazepato puede causar dolores de cabeza.

                Boca seca: Puedes experimentar sequedad en la boca como efecto secundario.

                Problemas gastrointestinales: Esto puede incluir náuseas o estreñimiento en algunos casos.

                Cambios en la libido: Algunas personas pueden experimentar cambios en la libido o la función sexual.

                Retención de líquidos: Puedes experimentar retención de líquidos y edema en algunas partes del cuerpo.

                Aumento de peso: En algunos casos, el uso de clorazepato puede estar asociado con un aumento de peso.
            """.trimIndent()






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

                    val medicamentoSeleccionado = medicamentos[position]
                    val mensaje = efectosSecundarios[medicamentoSeleccionado] ?: "Información no disponible" // Restamos 1 porque la posición 0 es "Seleccione un medicamento"

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