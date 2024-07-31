package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class KthSmallest_Hot100_230 {

    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack = new LinkedList();
        int i = 0;
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            i++;
            if (i == k)
                return root.val;
            root = root.right;
        }
        return -1;
    }

}
