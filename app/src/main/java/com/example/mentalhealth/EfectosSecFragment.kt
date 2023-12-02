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