package com.damon.algorithm.stack;

public class Stack {

    public boolean IsPopOrder(int[] pushA, int[] popA) {
        boolean result = false;
        if (pushA == null || popA == null || pushA.length < 1 || popA.length < 1) {
            return result;
        }

        java.util.Stack<Integer> stack = new java.util.Stack<Integer>();

        int j = 0;
        stack.push(pushA[j++]);
        for (int i = 0; i < popA.length; i++) {
            while (popA[i] != stack.peek()) {
                if (j == pushA.length) {
                    return false;
                }
                stack.push(pushA[j++]);
            }
            stack.pop();
        }

        return stack.empty();
    }

}
