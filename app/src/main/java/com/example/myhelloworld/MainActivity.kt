package com.example.myhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
         //   var diceImg : ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
             diceImage = findViewById(R.id.diceImage)
        val rollBtn: Button = findViewById(R.id.button)
        rollBtn.setOnClickListener{rollDice()}
    }

    private fun rollDice(){

        val randomNumb = (1..6).random()
        val textView: TextView = findViewById(R.id.textView)
        textView.text = randomNumb.toString()

      //  val diceImg : ImageView = findViewById(R.id.diceImage)
        val imgSrc = when(randomNumb){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(imgSrc)
        Toast.makeText(this, "Button Clicked",
        Toast.LENGTH_SHORT).show()



        val numberText: TextView = findViewById(R.id.textView)
        numberText.text = randomNumb.toString()
        Toast.makeText(this, randomNumb.toString(),
            Toast.LENGTH_SHORT).show()

    }
}