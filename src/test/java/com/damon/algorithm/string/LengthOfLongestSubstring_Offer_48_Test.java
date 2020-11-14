package com.damon.algorithm.string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LengthOfLongestSubstring_Offer_48_Test {

    private LengthOfLongestSubstring_Offer_48 lengthOfLongestSubstring_offer_48;

    @Before
    public void before() {
        this.lengthOfLongestSubstring_offer_48 = new LengthOfLongestSubstring_Offer_48();
    }

    @Test
    public void lengthOfLongestSubstringTest() {
        String testStr = "abcabcbb";
        int result = this.lengthOfLongestSubstring_offer_48.lengthOfLongestSubstring(testStr);
        Assert.assertEquals(3, result);
    }

}
