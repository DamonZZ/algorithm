package com.damon.algorithm.stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MaxQueue_Offer_59 {

    private Queue<Integer> queue;
    private Deque<Integer> deque;

    public MaxQueue_Offer_59() {
        this.queue = new LinkedList<>();
        this.deque = new LinkedList<>();
    }

    public int max_value() {
        if (this.deque.isEmpty()) {
            return -1;
        }
        return this.deque.peekFirst();
    }

    public void push_back(int value) {
        while (!this.deque.isEmpty() && this.deque.peekLast() < value) {
            this.deque.pollLast();
        }
        this.deque.offerLast(value);
        this.queue.offer(value);
    }

    public int pop_front() {
        if (this.queue.isEmpty()) {
            return -1;
        }
        int res = this.queue.poll();
        if (res == this.deque.peekFirst()) {
            this.deque.pollFirst();
        }
        return res;
    }

}
