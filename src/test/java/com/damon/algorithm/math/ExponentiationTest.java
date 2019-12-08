package com.damon.algorithm.math;

import com.dmaon.algorithm.math.Exponentiation;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExponentiationTest {

    private Exponentiation exponentiation;

    @Before
    public void befbore() {
        this.exponentiation = new Exponentiation();
    }

    @After
    public void after() {
        this.exponentiation = null;
    }

    @Test
    public void powerTest() {
        double base = 0.0;
        int exponent = -1;
        double expected = 0.0;

        double result = this.exponentiation.power(base, exponent);
        Assert.assertEquals(expected, expected, 0.0);

        base = 10.0;
        exponent = 0;
        expected = 1.0;
        result = this.exponentiation.power(base, exponent);
        Assert.assertEquals(expected, expected, 0.0);

        base = 10.0;
        exponent = 2;
        expected = 100.0;
        result = this.exponentiation.power(base, exponent);
        Assert.assertEquals(expected, expected, 0.0);

        base = 10.0;
        exponent = -2;
        expected = 0.01;
        result = this.exponentiation.power(base, exponent);
        Assert.assertEquals(expected, expected, 0.0);
    }
}
