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
        val encoder = Encoder()
        val startTV = findViewById(R.id.editText4) as TextView
        val translatedTV = findViewById(R.id.editText5) as TextView


        val decodeButton = findViewById(R.id.button5) as Button
        decodeButton.setOnClickListener{
            val testInput = startTV.text.toString()
            val filteredInput = decoder.filter(testInput)
            //First filter the input
            startTV.text = filteredInput
            //Here we take what is in the upper textfield and translate it and set the lower field to the answer
            translatedTV.text = decoder.decode(filteredInput)
        }
        val encodeButton = findViewById(R.id.button6) as Button
        encodeButton.setOnClickListener{
            val testInput = translatedTV.text.toString()
            val filteredInput = encoder.filter(testInput)
            startTV.text = encoder.encode(filteredInput)
        }
    }
}
