package com.fooddelivery;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DeliveryChargeCalculatorTest {

    DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();

    @Test
    void testPremiumMemberAbove500() {
        assertEquals(0, calculator.calculateDeliveryCharge(600, true));
    }

    @Test
    void testNonPremiumMemberAbove500() {
        assertEquals(20, calculator.calculateDeliveryCharge(600, false));
    }

    @Test
    void testPremiumMemberBelow500() {
        assertEquals(10, calculator.calculateDeliveryCharge(400, true));
    }

    @Test
    void testNonPremiumMemberBelow500() {
        assertEquals(40, calculator.calculateDeliveryCharge(400, false));
    }
}