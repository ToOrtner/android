package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    private fun addNick(view: View){
        val editText = findViewById<EditText>(R.id.hola_persona)
        val nickname = findViewById<TextView>(R.id.hola_persona)

        nickname.text = editText.text
        editText.visibility = view.GONE

    }
}