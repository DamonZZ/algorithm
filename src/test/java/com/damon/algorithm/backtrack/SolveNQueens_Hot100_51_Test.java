package com.damon.algorithm.backtrack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class SolveNQueens_Hot100_51_Test {

    private SolveNQueens_Hot100_51 solveNQueens_hot100_51;

    @Before
    public void before() {
        this.solveNQueens_hot100_51 = new SolveNQueens_Hot100_51();
    }

    @Test
    public void solveNQueensTest() {
        List<List<String>> ans= this.solveNQueens_hot100_51.solveNQueens(4);
        Assert.assertEquals(".Q..", ans.get(0).get(0));
    }

}
