package com.damon.algorithm.stack;

import java.util.Collections;
import java.util.LinkedList;

public class DecodeString_Hot100_394 {

    int ptr = 0;

    public String decodeString(String s) {
        LinkedList<String> stk = new LinkedList();
        while (ptr < s.length()) {
            char cur = s.charAt(ptr);
            if (Character.isDigit(cur)) {
                String digits = getDigits(s);
                stk.addLast(digits);
            } else if (Character.isLetter(cur) || cur == '[') {
                stk.addLast(String.valueOf(s.charAt(ptr++)));
            } else {
                ++ptr;
                LinkedList<String> sub = new LinkedList();
                while (!"[".equals(stk.peekLast())) {
                    sub.addLast(stk.removeLast());
                }
                Collections.reverse(sub);
                stk.removeLast();
                int repTime = Integer.parseInt(stk.removeLast());
                StringBuffer t = new StringBuffer();
                String o = getString(sub);
                while (repTime-- > 0) {
                    t.append(o);
                }
                stk.addLast(t.toString());
            }
        }
        return getString(stk);
    }

    private String getDigits(String s) {
        StringBuffer sb = new StringBuffer();
        while (Character.isDigit(s.charAt(ptr))) {
            sb.append(s.charAt(ptr++));
        }
        return sb.toString();
    }

    private String getString(LinkedList<String> v) {
        StringBuffer sb = new StringBuffer();
        for (String s : v) {
            sb.append(s);
        }
        return sb.toString();
    }

}
