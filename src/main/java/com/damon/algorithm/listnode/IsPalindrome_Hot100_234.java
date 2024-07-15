package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.ListNode;

import java.util.ArrayList;
import java.util.List;

public class IsPalindrome_Hot100_234 {

    public boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList();
        ListNode currentNode = head;
        while (currentNode != null) {
            vals.add(currentNode.val);
            currentNode = currentNode.next;
        }

        int front = 0, back = vals.size() - 1;
        while (front < back) {
            if (!vals.get(front).equals(vals.get(back))) {
                return false;
            }

            front++;
            back--;
        }
        return true;
    }

}
