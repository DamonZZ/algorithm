package com.damon.algorithm.string;

public class ReplaceSpace_Offer_05 {

    // double pointer
    public String replaceSpace(String s) {
        if (s == null) return null;
        String result;
        char[] array = s.toCharArray();
        int length = s.length();
        int newLength = length;
        for (int i = 0; i < length; i++) {
            if (array[i] == ' ') {
                newLength += 2;
            }
        }

        char[] newArray = new char[newLength];
        int j = newLength - 1;
        for (int i = length - 1; i >= 0; i--) {
            if (array[i] == ' ') {
                newArray[j--] = '0';
                newArray[j--] = '2';
                newArray[j--] = '%';
            } else {
                newArray[j--] = array[i];
            }
        }
        result = new String(newArray, 0, newLength);
        return result;
    }

}
