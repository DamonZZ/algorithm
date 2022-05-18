package com.damon.algorithm.string;

public class ZStringConvert_LeetCodeHot100_6 {

    public String convert(String s, int numRows) {

        if (numRows == 1 || numRows >= s.length()) return s;

        int len = s.length(), t = 2 * numRows - 2;
        int columns = (len + t - 1) / t * (numRows - 1);

        char[] chars = s.toCharArray();
        char[][] zConvertArray = new char[numRows][columns];


        for (int i = 0, x = 0, y = 0; i < len; i++) {
            zConvertArray[x][y] = chars[i];
            if (i % t < numRows - 1) {
                x++;
            } else {
                x--;
                y++;
            }

        }

        StringBuilder sb = new StringBuilder();

        for (char[] row : zConvertArray) {
            for (char ch : row) {
                if (ch != 0) {
                    sb.append(ch);
                }
            }
        }

        return sb.toString();
    }

}
