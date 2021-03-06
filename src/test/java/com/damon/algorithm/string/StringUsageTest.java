package com.damon.algorithm.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringUsageTest {

    private StringUsage stringUsage;

    @Before
    public void before() {
        this.stringUsage = new StringUsage();
    }

    @After
    public void after() {
        this.stringUsage = null;
    }

    @Test
    public void reverseSentenceTest() {
        String testStr = "I am a student.";
        String expected = "student. a am I";
        String result = this.stringUsage.reverseSentence(testStr);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void leftRotateStringTest() {
        String testStr = "abcdefg";
        int testN = 2;
        String expected = "cdefgab";
        String result = this.stringUsage.leftRotateString(testStr, 2);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void strToIntTest() {
        String testStr = "-2147483649";
        int expected = 0;
        int result = this.stringUsage.strToInt(testStr);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void matchTest() {
        char[] testStr = new char[]{'a'};
        char[] testPartern = new char[]{'.'};
        boolean expected = true;
        boolean result = this.stringUsage.match(testStr, testPartern);
        Assert.assertEquals(expected, result);
    }

}
