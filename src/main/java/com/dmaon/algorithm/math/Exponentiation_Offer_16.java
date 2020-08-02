package com.dmaon.algorithm.math;

public class Exponentiation_Offer_16 {

    public double power(double base, int exponent) {
        double result = 0.0;
        if (base == 0.0 && exponent < 0) {
            System.err.println("Invalid input! Base=0.0 and Exponent=" + exponent);
            return result;
        }

        int absExponent = Math.abs(exponent);

        result = this.powerWithUnsignedExponent(base, absExponent);

        if (exponent < 0) {
            result = 1 / result;
        }

        return result;
    }

    private double powerWithUnsignedExponent(double base, int absExponent) {

        if (absExponent == 0) {
            return 1.0;
        }
        if (absExponent == 1) {
            return base;
        }

        double result = this.powerWithUnsignedExponent(base, absExponent >> 1);
        result = result * result;
        if ((absExponent & 1) == 1) {
            result = result * base;
        }
        return result;
    }

    public double myPow(double x, int n) {
        if (x == 0) return 0;
        long b = n;
        double res = 1.0;
        if (b < 0) {
            x = 1 / x;
            b = -b;
        }
        while (b > 0) {
            if ((b & 1) == 1) res *= x;
            x *= x;
            b >>= 1;
        }
        return res;
    }
}
