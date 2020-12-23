package com.example.dice
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    lateinit var diceimg: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "rollea"
        rollButton.setOnClickListener { Toast.makeText(this, "boton apretado", Toast.LENGTH_SHORT).show() }
        rollButton.setOnClickListener { rollDice() }
        diceimg =  findViewById(R.id.dado_img)
    }

    private fun rollDice() {
        val alea = (1 until 7).random()
        val nro_dado = when (alea){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5

            else -> R.drawable.dice_6
        }

        dado_img.setImageResource(nro_dado)
    }
}

