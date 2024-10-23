package com.damon.algorithm.heap;

import java.util.PriorityQueue;

public class MedianFinder_Hot100_295 {

    PriorityQueue<Integer> queueMax;
    PriorityQueue<Integer> queueMin;

    public MedianFinder_Hot100_295() {
        queueMin = new PriorityQueue<Integer>((a, b) -> (b - a));
        queueMax = new PriorityQueue<Integer>((a, b) -> (a - b));
    }

    public void addNum(int num) {
        if (queueMin.isEmpty() || num <= queueMin.peek()) {
            queueMin.offer(num);
            if (queueMax.size() + 1 < queueMin.size()) {
                queueMax.offer(queueMin.poll());
            }
        } else {
            queueMax.offer(num);
            if (queueMax.size() > queueMin.size()) {
                queueMin.offer(queueMax.poll());
            }
        }
    }

    public double findMedian() {
        if (queueMin.size() > queueMax.size()) {
            return queueMin.peek();
        }

        return (queueMin.peek() + queueMax.peek()) / 2.0;
    }

}
