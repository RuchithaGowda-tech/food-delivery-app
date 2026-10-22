package com.fooddelivery;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DeliveryChargeParameterizedTest {

    DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();

    @ParameterizedTest
    @CsvSource({
        "600, true, 0",
        "600, false, 20",
        "400, true, 10",
        "400, false, 40"
    })
    void testDeliveryCharge(double amount, boolean premiumMember, int expected) {

        assertEquals(expected,
                calculator.calculateDeliveryCharge(amount, premiumMember));
    }
}