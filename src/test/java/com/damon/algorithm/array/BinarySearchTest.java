package com.damon.algorithm.array;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class BinarySearchTest {

    private int[] arryas;

    @Before
    public void before() {
        this.arryas = new int[]{3, 4, 5, 7, 8, 10, 12, 15};
    }

    @Test
    public void javaBinaryTest() {

        int target = 6;
        int result = Arrays.binarySearch(this.arryas, target);
        System.out.println("Search " + target + " result: " + result);

        target = 2;
        result = Arrays.binarySearch(this.arryas, target);
        System.out.println("Search " + target + " result: " + result);

        target = 10;
        result = Arrays.binarySearch(this.arryas, target);
        System.out.println("Search " + target + " result: " + result);
    }

}
