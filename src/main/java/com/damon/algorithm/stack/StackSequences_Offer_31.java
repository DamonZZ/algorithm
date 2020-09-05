package com.damon.algorithm.stack;


public class StackSequences_Offer_31 {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed == null || popped == null) return false;
        java.util.Stack<Integer> stack = new java.util.Stack();
        int i = 0;
        for (int num : pushed) {
            stack.push(num);
            while (!stack.isEmpty() && popped[i] == stack.peek()) {
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }

}
