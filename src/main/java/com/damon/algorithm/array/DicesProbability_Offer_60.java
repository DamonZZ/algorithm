package com.damon.algorithm.array;

public class DicesProbability_Offer_60 {

    public double[] dicesProbability(int n) {
        double[] pre = new double[]{1 / 6d, 1 / 6d, 1 / 6d, 1 / 6d, 1 / 6d, 1 / 6d};
        for (int i = 2; i <= n; i++) {
            double[] temp = new double[5 * i + 1];
            for (int j = 0; j < pre.length; j++) {
                for (int k = 0; k < 6; k++) {
                    temp[j + k] += pre[j] / 6;
                }
            }
            pre = temp;
        }
        return pre;
    }

}
