package com.example.binarydecoder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val decoder = Decoder()
        val startTV = findViewById(R.id.editText4) as TextView
        val translatedTV = findViewById(R.id.editText5) as TextView


        val decodeButton = findViewById(R.id.button5) as Button
        decodeButton.setOnClickListener{
            val testInput = startTV.text.toString()
            translatedTV.text = decoder.filter(testInput)
            //Here we take what is in the upper textfield and translate it and set the lower field to the answer
        }

    }
}
