package com.example.dado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var numerito:TextView
    lateinit var imagen:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         numerito = findViewById<TextView>(R.id.txtNumero)
        imagen = findViewById(R.id.Dadoimg)

    }

    /**
     * Es un metodo que llama el click del boton
     */
    fun lanzaclick(v : View){

        val numRandom = Random.nextInt(6)+1
        val res=numRandom%2
        numerito.setText("$numRandom")
        val miImagen = when(numRandom){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else-> R.drawable.dice_6
        }
            imagen.setImageResource(miImagen)
        if(res==0){
            Toast.makeText(this,"Es un numero par", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(this,"Es un numero impar", Toast.LENGTH_LONG).show()
        }

    }
}