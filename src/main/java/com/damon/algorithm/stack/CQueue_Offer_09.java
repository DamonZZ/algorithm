package com.damon.algorithm.stack;

import java.util.Deque;
import java.util.LinkedList;

public class CQueue_Offer_09 {

    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public CQueue_Offer_09() {
        this.stack1 = new LinkedList<>();
        this.stack2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        this.stack1.push(value);
    }

    public int deleteHead() {
        if (!this.stack2.isEmpty()) {
            return this.stack2.pop();
        } else {
            while (!this.stack1.isEmpty()) {
                this.stack2.push(this.stack1.pop());
            }
            return this.stack2.isEmpty() ? -1 : this.stack2.pop();
        }
    }
}
