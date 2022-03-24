package ru.netology

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commissionMir() {
        val amount = 1005009
        val cards = MIR

        val result = commission(
            amount = amount,
            cards = cards
        )

        assertEquals(7537, result)
    }

    @Test
    fun commissionVisa() {
        val amount = 1005009
        val cards = VISA

        val result = commission(
            amount = amount,
            cards = cards
        )

        assertEquals(7537, result)
    }

    @Test
    fun commissionMasterCard() {
        val amount = 1005009
        val cards = MASTERCARD

        val result = commission(
            amount = amount,
            cards = cards
        )

        assertEquals(8000, result)
    }

    @Test
    fun commissionMaestro() {
        val amount = 1005009
        val cards = MAESTRO

        val result = commission(
            amount = amount,
            cards = cards
        )

        assertEquals(8030, result)
    }

    @Test
    fun commissionVK() {
        val amount = 1005009
        val cards = VK_PAY

        val result = commission(
            amount = amount,
            cards = cards
        )

        assertEquals(0, result)
    }

    @Test
    fun masterMaestro() {
        val amount = 1005009

        val result = masterMaestro(
            amount = amount
        )

        assertEquals(8030, result)
    }

    @Test
    fun visaMir() {
        // arrange
        val amount = 1005009

        // act
        val result = visaMir(
            amount = amount
        )

        // assert
        assertEquals(7537, result)
    }

    @Test
    fun visaMirMin() {
        // arrange
        val amount = 1005
        val min = 3500

        // act
        val result = visaMir(
            amount = amount
        )

        // assert
        assertEquals(min, result)
    }

    @Test
    fun convectorInRubles() {
        val amount = 1005009

        val result = convectorInRubles(
            amount = amount
        )

        assertEquals("10050 руб. 9 коп.", result)
    }
}