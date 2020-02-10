package com.example.binarydecoder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val decoder = Decoder()
        val encoder = Encoder()
        val binaryTV = findViewById(R.id.BinaryInput) as TextView
        val decimalTV = findViewById(R.id.DecimalInput) as TextView


        val decodeButton = findViewById(R.id.decodeButton) as Button
        decodeButton.setOnClickListener{
            filterBinaryInput(decoder)
            decimalTV.text = decoder.decode(binaryTV.text.toString())
        }
        val encodeButton = findViewById(R.id.encodeButton) as Button
        encodeButton.setOnClickListener{
            filterDecimalInput(encoder)
            binaryTV.text = encoder.encode(decimalTV.text.toString())
        }
        val decodeAsciiButton = findViewById(R.id.decodeASCIIButton) as Button
        decodeAsciiButton.setOnClickListener{
            filterBinaryInput(decoder)
            if (decoder.isFactorOfEight(binaryTV.text.toString())){
                Toast.makeText(this, getString(R.string.BadFormatInput), Toast.LENGTH_LONG).show()
            }
            else {
                //TODO
            }
        }
        val encodeAsciiButton = findViewById(R.id.encodeASCIIButton) as Button
        encodeAsciiButton.setOnClickListener{
            filterDecimalInput(encoder)
        }
    }
    fun filterBinaryInput(decoder: Decoder){
        val binaryTV = findViewById(R.id.BinaryInput) as TextView
        val binaryInput = binaryTV.text.toString()
        binaryTV.text = decoder.filter(binaryInput)//First filter the input
    }
    fun filterDecimalInput(encoder: Encoder){
        val decimalTV = findViewById(R.id.DecimalInput) as TextView
        val decimalInput = decimalTV.text.toString()
        decimalTV.text = encoder.filter(decimalInput)
    }
}
