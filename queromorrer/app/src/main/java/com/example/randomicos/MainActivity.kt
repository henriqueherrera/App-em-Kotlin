package com.example.randomicos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(supportActionBar != null) {
            supportActionBar!!.hide()
        }
        buttomRandom.setOnClickListener(this)
        textNumber.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.buttomRandom) {
            var t = texto()
            println(t)
            textNumber.text = t
        }

    }

    fun random(): Int {
        return Random.nextInt(30)
    }
    fun texto(): String {
        var text = arrayOf("Não desista. Geralmente é a última chave no chaveiro que abre a porta",
            "Então não desista, sorria. Você é mais forte do que pensa e será mais feliz do que imagina",
            "As pessoas que te amam vão sofrer",
            "O Naruto nunca desistiu",
            "Chore agora, para sorir depois",
            "Tudo vai dar certo",
            "Você é importante",
            "Procure ajuda, Ligue 188",
            "Seu esforço não faz sentido, se você não acredita em si mesmo",
            "A universidade não é sua vida, é so uma pequena parte dela",
            "Você não precisa carregar o mundo em suas costas",
            "Você não está sozinho",
            "Busque ajuda",
            "Um dia a dor passa",
            "Cada dia começa com um ato de coragem e de esperança: sair da cama",
            "Tempos difíceis sempre revelam os bons amigos",
            "Com um passo de cada vez,Você alcançará seus objetivos",
            "Haverá situações em que sozinho você será aniquilado, mas com a ajuda dos seus amigos, as coisas vão se resolver",
            "Pense nas pessoas que sentirão sua falta",
            "Um ninja deve ver através da decepção.",
            "O caminho é dificil, mas há uma reconpensa no final",
            "Você não pode reescrever o passado, mas pode escrever seu futuro",
            "A maior glória não é ficar de pé, mas levantar-se cada vez que se cai.",
            "Torne-se a pessoa que atrairia os resultados que você procura.",
            "O fracasso é apenas uma oportunidade para recomeçar com mais inteligência",
            "Diante de uma dificuldade substitua o eu não consigo pelo vou tentar outra vez.",
            "A morte so vale a pena quando se vive até o fim!",
            "Lute até o fim de suas forças e daí a morte valerá a pena, fora isso é so perca de tempo",
            "Afaste-se que quem te faz sentir mal",
            "Então eu não vou desistir até que chegue o dia em que eu possa dividir minha felicidade com todos",
            "Sua dor um dia passa, das pessoas que vão te perder nunca passará")

        return text[random()]
    }
}
