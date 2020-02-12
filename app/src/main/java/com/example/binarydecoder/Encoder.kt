package com.example.binarydecoder

import java.lang.Character.isDigit

class Encoder {
    fun filter(input: String): String {
        return input.filter { e -> isDigit(e) }
    }
    /*
    * fun encode
    * Prereq: String may not be empty
    * */
    fun encode(input: String):String{
        var sum = input.toInt()
        var iterator = 1
        var value = ""
        while (iterator*2 < sum){
            iterator *= 2
        }
        while (iterator > 0){
            if (sum < iterator){
                iterator /= 2
                value += "0"
            }
            else {
                sum -= iterator
                iterator /= 2
                value += "1"
            }
        }
        return value
    }
    fun toAscii(input: String):String{
        var returnString = ""
        for (character in input){
            returnString += encode(character.toInt().toString()).padStart(8,'0')
        }
        return returnString
    }
}