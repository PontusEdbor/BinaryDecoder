package com.example.binarydecoder

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class EncodingTests {
    @Test
    fun spaceEncodesCorrect() {//Space should be ascii code 32
        assertEquals("00100000", Encoder().toAscii(" "))
    }
    @Test
    fun aEncodesCorrect() {//Space should be ascii code 32
        assertEquals("01100001", Encoder().toAscii("a"))
    }
    @Test
    fun newlineEncodesCorrect(){
        assertEquals("00001010", Encoder().toAscii("\n"))
    }
    @Test
    fun whatIsToChar(){
        assertEquals(32,' '.toInt())
    }
}
