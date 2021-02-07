package com.damon.algorithm.sort;

import org.junit.Assert;
import org.junit.Test;

public class InsertSortTest {

    private InsertSort insertSort = new InsertSort();

    @Test
    public void insertSortTest() {
        int[] array = new int[]{4, 6, 8, 2, 3, 1};
        this.insertSort.insertSort(array);
        Assert.assertTrue(array[0] < array[array.length - 1]);
    }

}
