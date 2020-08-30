package com.damon.algorithm.stack;

import java.util.Stack;

public class StackWithMin_Offer_30 {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        this.stack1.push(node);
        if (this.stack2.empty()) {
            this.stack2.push(node);
        } else {
            int min = this.stack2.peek();
            if (node < min) {
                this.stack2.push(node);
            } else {
                this.stack2.push(min);
            }
        }
    }

    public void pop() {
        if (!this.stack2.empty()) {
            this.stack2.pop();
        }
        if (!this.stack1.empty()) {
            this.stack1.pop();
        }
    }

    public int top() {
        int result = 0;
        if (!this.stack1.empty()) {
            return this.stack1.peek();
        }
        return result;
    }

    public int min() {
        int result = 0;
        if (!this.stack2.empty()) {
            return this.stack2.peek();
        }
        return result;
    }

}
