package com.damon.algorithm.backtrack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class GenerateParenthesis_Hot100_22_Test {

    private GenerateParenthesis_Hot100_22 generateParenthesis_hot100_22;

    @Before
    public void before() {
        this.generateParenthesis_hot100_22 = new GenerateParenthesis_Hot100_22();
    }

    @Test
    public void generateParenthesisTest() {

        List<String> ans= this.generateParenthesis_hot100_22.generateParenthesis(3);

        Assert.assertEquals(5, ans.size());
    }
}
