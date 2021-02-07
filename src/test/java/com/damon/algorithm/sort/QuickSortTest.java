package com.damon.algorithm.sort;

import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {

    private QuickSort quickSort = new QuickSort();

    @Test
    public void quickSort() {
        int[] array = new int[]{4, 6, 8, 2, 3, 1};
        this.quickSort.quickSort(array, 0, array.length - 1);
        Assert.assertTrue(array[0] < array[array.length - 1]);
    }

}
