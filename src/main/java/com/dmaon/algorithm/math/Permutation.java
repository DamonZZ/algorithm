package com.dmaon.algorithm.math;

import java.util.ArrayList;
import java.util.TreeSet;

public class Permutation {

    public ArrayList<String> stringPermutation(String input) {
        ArrayList<String> result = new ArrayList<>();

        if (input == null || input.length() < 1) {
            return result;
        }

        TreeSet<String> temp = new TreeSet<>();
        this.stringPermutation(input.toCharArray(), 0, temp);
        result.addAll(temp);
        return result;
    }

    private void stringPermutation(char[] chars, int begin, TreeSet<String> set) {
        if (chars == null || chars.length < 1 || begin < 0 || begin > chars.length - 1) {
            return;
        }

        if (begin == chars.length - 1) {
            set.add(String.valueOf(chars));
        } else {
            for (int i = begin; i < chars.length; i++) {
                this.swao(chars, begin, i);
                this.stringPermutation(chars, begin + 1, set);
                this.swao(chars, begin, i);
            }
        }
    }

    private void swao(char[] chars, int a, int b) {
        char temp = chars[a];
        chars[a] = chars[b];
        chars[b] = temp;
    }

}
