package com.damon.algorithm.integer;

public class IntToRoman_LeetCode_Hot100_12 {

    private String[] thousands = new String[]{"", "M", "MM", "MMM"};
    private String[] hundreds = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private String[] tens = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private String[] ones = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        sb.append(thousands[num / 1000]);
        sb.append(hundreds[(num / 100) % 10]);
        sb.append(tens[(num / 10) % 10]);
        sb.append(ones[num % 10]);
        return sb.toString();
    }

}
