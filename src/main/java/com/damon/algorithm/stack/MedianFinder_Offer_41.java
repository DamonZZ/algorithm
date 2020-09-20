package com.damon.algorithm.stack;

import java.util.PriorityQueue;

public class MedianFinder_Offer_41 {

    private PriorityQueue<Integer> queueA, queueB;

    public MedianFinder_Offer_41() {
        this.queueA = new PriorityQueue<>();
        this.queueB = new PriorityQueue<>((x, y) -> (y - x));
    }

    public void addNum(int num) {
        if (this.queueA.size() != this.queueB.size()) {
            this.queueA.add(num);
            this.queueB.add(this.queueA.poll());
        } else {
            this.queueB.add(num);
            this.queueA.add(this.queueB.poll());
        }
    }

    public double findMedian() {
        return this.queueA.size() == this.queueB.size() ? (this.queueA.peek() + this.queueB.peek()) / 2.0 : this.queueA.peek();
    }

}
