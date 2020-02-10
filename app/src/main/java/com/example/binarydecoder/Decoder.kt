package com.example.binarydecoder

class Decoder {
    fun decode(input: String){

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