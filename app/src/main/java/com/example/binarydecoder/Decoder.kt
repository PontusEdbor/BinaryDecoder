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
}