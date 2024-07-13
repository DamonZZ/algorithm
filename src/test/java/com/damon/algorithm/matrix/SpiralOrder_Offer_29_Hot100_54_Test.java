package com.damon.algorithm.matrix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SpiralOrder_Offer_29_Hot100_54_Test {

    private SpiralOrder_Offer_29_Hot100_54 spiralOrder_offer_29;

    @Before
    public void before() {
        this.spiralOrder_offer_29 = new SpiralOrder_Offer_29_Hot100_54();
    }

    @Test
    public void spiralOrderTest() {
        int[][] test = new int[3][3];
        int[] row1 = new int[]{1, 2, 3};
        int[] row2 = new int[]{4, 5, 6};
        int[] row3 = new int[]{7, 8, 9};

        test[0] = row1;
        test[1] = row2;
        test[2] = row3;

        int[] result = this.spiralOrder_offer_29.spiralOrder(test);
        for (int i : result) {
            System.out.println(i);
        }
        Assert.assertEquals(6, result[3]);
    }

}
