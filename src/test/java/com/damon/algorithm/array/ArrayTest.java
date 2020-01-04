package com.damon.algorithm.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTest {

    private Array array;

    @Before
    public void before() {
        this.array = new Array();
    }

    @After
    public void after() {
        this.array = null;
    }

    @Test
    public void reOrderTest() {
        int[] testArray = null;
        int[] expected = null;
        int[] result = this.array.reOrder(testArray);

        Assert.assertEquals(expected, result);

        testArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        expected = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8};
        result = this.array.reOrder(testArray);

        Assert.assertTrue(Arrays.equals(result, expected));

    }

    @Test
    public void printMatrixTest() {
        String expected = "1,2,3,4,8,12,16,20,19,18,17,13,9,5,6,7,11,15,14,10,";
        String strResult = "";

        int[][] testArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}, {17, 18, 19, 20}};
        ArrayList<Integer> result = this.array.printMatrix(testArray);
        for (Integer i : result) {
            strResult += i + ",";
        }
        Assert.assertEquals(expected, strResult);

        expected = "1,2,3,4,";
        testArray = new int[][]{{1}, {2}, {3}, {4}};
        result = this.array.printMatrix(testArray);
        strResult = "";
        for (Integer i : result) {
            strResult += i + ",";
        }

        Assert.assertEquals(expected, strResult);

        expected = "1,2,3,4,";
        testArray = new int[][]{{1, 2, 3, 4}};
        result = this.array.printMatrix(testArray);
        strResult = "";
        for (Integer i : result) {
            strResult += i + ",";
        }

        Assert.assertEquals(expected, strResult);
    }

    @Test
    public void moreThanHalfNumberTest() {
        int[] testArray = new int[]{3, 1, 2, 2, 2};
        int expected = 2;
        int result = this.array.moreThanHalfNumber(testArray);
        Assert.assertEquals(expected, result);

    }

    @Test
    public void getLeastNumbers() {
        int[] testArray = new int[]{3, 5, 1, 4, 2};
        int testIndex = 3;
        String expected = "3,1,2,";
        String strResult = "";
        ArrayList<Integer> result = this.array.getLeastNumbers(testArray, testIndex);
        for (int i = 0; i < result.size(); i++) {
            strResult += result.get(i) + ",";
        }
        Assert.assertEquals(expected, strResult);
    }

    @Test
    public void findGreatestSumOfSubArrayTest() {
        int[] testArray = new int[]{3, -5, -1, 4, 2};
        int expected = 6;
        int result = this.array.findGreatestSumOfSubArray(testArray);
        Assert.assertEquals(expected, result);

    }

    @Test
    public void numberOf1Between1AndNTest() {
        int testInt = 21345;
        int expected = 18821;
        int result = this.array.numberOf1Between1AndN(testInt);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void printMinNumberTest() {
        int[] testArray = new int[]{3, 32, 321};
        String expected = "321323";
        String result = this.array.printMinNumber(testArray);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void getNumberOfKTest() {
        int[] testArray = new int[]{1, 2, 3, 3, 3, 4, 5, 6, 7, 8};
        int testK = 3;
        int expected = 3;
        int result = this.array.getNumberOfK(testArray, testK);
        Assert.assertEquals(expected, result);
    }

    // #56
    @Test
    public void findNumsAppearOnceTest() {
        int[] testArray = new int[]{2, 4, 3, 6, 3, 2, 5, 5, 8, 8};
        int[] testNum1 = new int[]{0};
        int[] testNum2 = new int[]{0};
        int expected1 = 6;
        int expected2 = 4;
        this.array.findNumsAppearOnce(testArray, testNum1, testNum2);
        Assert.assertEquals(expected1, testNum1[0]);
        Assert.assertEquals(expected2, testNum2[0]);
    }

    // #57 - 1
    @Test
    public void findContinuousSequenceTest() {
        int testSum = 15;
        int expected = 3;
        ArrayList<ArrayList<Integer>> result = this.array.findContinuousSequence(testSum);
        Assert.assertEquals(expected, result.size());
    }

    // #57 - 2
    @Test
    public void findNumbersWithSumTest() {
        int[] testArray = new int[]{1, 2, 4, 7, 11, 15};
        int testSum = 15;
        int expected1 = 4;
        int expected2 = 11;
        ArrayList<Integer> result = this.array.findNumbersWithSum(testArray, testSum);
        Assert.assertEquals(expected1, result.get(0).intValue());
        Assert.assertEquals(expected2, result.get(1).intValue());
    }

    // #61
    @Test
    public void isContinuousTest() {
        int[] testArray = new int[]{2, 0, 0, 4, 7};
        boolean expected = false;
        boolean result = this.array.isContinuous(testArray);
        Assert.assertEquals(expected, result);
    }

    // #3
    @Test
    public void duplicateTest() {
        int[] testArray = new int[]{2, 3, 4, 1, 4};
        int testLength = 4;
        int[] duplicateArray = new int[1];
        boolean expected = true;
        boolean result = this.array.duplicate(testArray, testLength, duplicateArray);
        Assert.assertEquals(expected, result);
    }

    //
    @Test
    public void multiplyTest() {
        int[] testArray = new int[]{1, 2, 3, 4, 5};
        int[] expected = new int[]{120, 60, 40, 30, 24};
        int[] result = this.array.multiply(testArray);
        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], result[i]);
        }
    }
}
