package com.damon.algorithm.array;

import java.util.Deque;
import java.util.LinkedList;

public class MaxSlidingWindow_Offer_59 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) return new int[0];
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) deque.removeLast();
            deque.addLast(nums[i]);

        }
        res[0] = deque.getFirst();
        for (int i = k; i < nums.length; i++) {
            if (deque.getFirst() == nums[i - k]) deque.removeFirst();
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) deque.removeLast();
            deque.addLast(nums[i]);
            res[i - k + 1] = deque.getFirst();
        }
        return res;
    }

}
