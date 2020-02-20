package com.example.binarydecoder

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class DencodingTests {
    @Test
    fun spaceDecodesCorrect() {//Space should be ascii code 32
        assertEquals(" ", Decoder().toAscii("00100000"))
    }
    @Test
    fun newlineDecodesCorrect(){
        assertEquals("\n",Decoder().toAscii("00001010"))
    }
}
