package com.example.aboutme

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    // poralguna razon, esto rompe la app
  //      findViewById<Button>(R.id.done_button).setOnClickListener {
   //         addNick(it)
    //    }
    }


    @SuppressLint("WrongViewCast")
    private fun addNick(view: View){
        val editText = findViewById<EditText>(R.id.hola_persona)
        val nickname = findViewById<TextView>(R.id.hola_persona)

        nickname.text = editText.text
        //escondo el cuadro de texto y el boton
        editText.visibility = View.GONE
        view.visibility = View.GONE
        //text view visible
        nickname.visibility = View.VISIBLE
        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)

    }
}