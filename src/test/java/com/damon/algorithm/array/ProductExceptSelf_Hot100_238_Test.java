package com.damon.algorithm.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductExceptSelf_Hot100_238_Test {

    private ProductExceptSelf_Hot100_238 productExceptSelf_hot100_238;

    @Before
    public void before() {
        this.productExceptSelf_hot100_238 = new ProductExceptSelf_Hot100_238();
    }

    @Test
    public void productExceptSelfTest() {
        int[] result = this.productExceptSelf_hot100_238.productExceptSelf(new int[]{1, 2, 3, 4});
        Assert.assertEquals(24, result[0]);
    }

}
