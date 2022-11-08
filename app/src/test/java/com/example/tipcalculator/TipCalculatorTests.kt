package com.example.tipcalculator

import org.junit.Assert.assertEquals
import org.junit.Test

class TipCalculatorTests {

    @Test
    fun calculate_20_percent_tip_no_roundup() {
        var amount = 10.0
        var tipPercent = 20.0
        var expectedTip = "£2.00"

        var actualTip = calculateTip(amount, tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }

}