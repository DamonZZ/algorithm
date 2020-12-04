package com.damon.algorithm.string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseWords_Offer_58_Test {

    private ReverseWords_Offer_58 reverseWords_offer_58;

    @Before
    public void before() {
        this.reverseWords_offer_58 = new ReverseWords_Offer_58();
    }

    @Test
    public void reverseWordsTest() {
        String testStr = "I am a student.";
        String res = this.reverseWords_offer_58.reverseWords(testStr);
        Assert.assertTrue(res.length() == testStr.length());
    }

    @Test
    public void reverseLeftWordsTest() {
        String testStr = "iamastudent.";
        String res = this.reverseWords_offer_58.reverseLeftWords(testStr, 3);
        Assert.assertTrue(res.length() == testStr.length());
    }

}
