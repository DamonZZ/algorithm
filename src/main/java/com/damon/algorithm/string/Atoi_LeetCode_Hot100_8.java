package com.damon.algorithm.string;

import java.util.HashMap;
import java.util.Map;

public class Atoi_LeetCode_Hot100_8 {


    public int myAtoi(String s) {
        char[] chars = s.toCharArray();
        Automation automation = new Automation();
        for (char c : chars) {
            automation.get(c);
        }
        return (int) (automation.sign * automation.ans);
    }

    class Automation {
        public int sign = 1;
        public long ans = 0;
        public String state = "start";

        public Map<String, String[]> stateMap = new HashMap<String, String[]>() {{
            put("start", new String[]{"start", "signed", "number", "end"});
            put("signed", new String[]{"end", "end", "number", "end"});
            put("number", new String[]{"end", "end", "number", "end"});
            put("end", new String[]{"end", "end", "end", "end"});
        }};


        public void get(char c) {
            state = stateMap.get(state)[getStateIndex(c)];
            if (state.equalsIgnoreCase("number")) {
                ans = ans * 10 + c - '0';
                ans = sign == 1 ? Math.min(ans, (long) Integer.MAX_VALUE) : Math.min(ans, -(long) Integer.MIN_VALUE);
            } else if (state.equalsIgnoreCase("signed")) {
                sign = c == '+' ? 1 : -1;
            }
        }

        private int getStateIndex(char c) {
            if (c == ' ') return 0;
            if (c == '+' || c == '-') return 1;
            if (Character.isDigit(c)) return 2;
            return 3;
        }

    }
}
