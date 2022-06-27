package com.damon.algorithm.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class IsValid_LeetCode_Hot100_20 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<Character, Character>() {
            {
                put(')', '(');
                put(']', '[');
                put('}', '{');
            }
        };
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[') {
                stack.push(chars[i]);
            } else if (chars[i] == ')' || chars[i] == '}' || chars[i] == ']') {
                if (stack.empty() || map.get(chars[i]) != stack.peek()) return false;
                stack.pop();
            }
        }

        return stack.empty();
    }

}
