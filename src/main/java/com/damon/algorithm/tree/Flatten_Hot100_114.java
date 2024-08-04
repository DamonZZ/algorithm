package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class Flatten_Hot100_114 {

    public void flatten(TreeNode root) {
        if (root == null)
            return;
        Deque<TreeNode> stack = new LinkedList();
        stack.push(root);
        TreeNode prev = null;
        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            if (prev != null) {
                prev.left = null;
                prev.right = curr;
            }
            if (curr.right != null)
                stack.push(curr.right);
            if (curr.left != null)
                stack.push(curr.left);
            prev = curr;
        }
    }

}
