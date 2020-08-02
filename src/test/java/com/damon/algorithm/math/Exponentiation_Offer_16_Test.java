package com.damon.algorithm.math;

import com.dmaon.algorithm.math.Exponentiation_Offer_16;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Exponentiation_Offer_16_Test {

    private Exponentiation_Offer_16 exponentiationOffer16;

    @Before
    public void befbore() {
        this.exponentiationOffer16 = new Exponentiation_Offer_16();
    }

    @After
    public void after() {
        this.exponentiationOffer16 = null;
    }

    @Test
    public void powerTest() {
        double base = 0.0;
        int exponent = -1;
        double expected = 0.0;

        double result = this.exponentiationOffer16.power(base, exponent);
        Assert.assertEquals(expected, expected, 0.0);

        base = 10.0;
        exponent = 0;
        expected = 1.0;
        result = this.exponentiationOffer16.power(base, exponent);
        Assert.assertEquals(expected, expected, 0.0);

        base = 10.0;
        exponent = 2;
        expected = 100.0;
        result = this.exponentiationOffer16.power(base, exponent);
        Assert.assertEquals(expected, expected, 0.0);

        base = 10.0;
        exponent = -2;
        expected = 0.01;
        result = this.exponentiationOffer16.power(base, exponent);
        Assert.assertEquals(expected, expected, 0.0);
    }

    @Test
    public void myPowTest() {
        double result = this.exponentiationOffer16.myPow(2.0, 8);
        Assert.assertTrue(result >= 256);
    }
}
