package com.example.binarydecoder

class Decoder {
    fun decode(input: String): String{
        val reversedInput = input.reversed()
        var iteration = 1
        var value = 0
        for (digit in reversedInput){
            if (digit == '1'){
                value += iteration
            }
            iteration *= 2
        }
        return value.toString()
    }
    fun filter(input: String): String{
        return input.filter { e -> isOneOrZero(e) }
    }
    fun isOneOrZero(input: Char): Boolean {
        if (input == '1' || input == '0'){
            return true
        }
        return false
    }
    fun isFactorOfEight(input: String):Boolean{
        if (input.length % 8 == 0){
            return true
        }
        return false
    }
    fun toAscii(input: String){
        //Divide into chunks of 8
        //Decode to int
        //translate to ASCII
        //Add to string
        //Send to textView
    }
}