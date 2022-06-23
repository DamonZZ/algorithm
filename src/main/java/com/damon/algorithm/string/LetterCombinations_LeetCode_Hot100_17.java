package com.damon.algorithm.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations_LeetCode_Hot100_17 {
    
    private Map<Character, String> phoneMap = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};

    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits.length() == 0) {
            return combinations;
        }
        backtrack(combinations, digits, 0, new StringBuffer());
        return combinations;
    }

    private void backtrack(List<String> combinations, String digits, int index, StringBuffer combination) {
        if (index == digits.length()) {
            combinations.add(combination.toString());
        } else {
            Character character = digits.charAt(index);
            String letter = this.phoneMap.get(character);
            for (int i = 0; i < letter.length(); i++) {
                combination.append(letter.charAt(i));
                backtrack(combinations, digits, index + 1, combination);
                combination.deleteCharAt(index);
            }
        }
    }


}
