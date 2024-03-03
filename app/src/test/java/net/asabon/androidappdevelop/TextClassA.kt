package net.asabon.androidappdevelop

import org.junit.Assert.assertEquals
import org.junit.Test

class TextClassA {
    @Test
    fun test() {
        val classA = ClassA()
        val result = classA.calculate(1, 2)
        assertEquals(8, result)
    }
}
