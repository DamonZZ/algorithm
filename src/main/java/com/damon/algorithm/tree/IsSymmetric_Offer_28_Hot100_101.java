package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class IsSymmetric_Offer_28_Hot100_101 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return this.match(root.left, root.right);
    }

    public boolean match(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null || left.val != right.val) return false;
        return this.match(left.right, right.left) && this.match(left.left, right.right);
    }


    private boolean check(TreeNode u, TreeNode v) {
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(u);
        queue.offer(v);

        while (!queue.isEmpty()) {
            u = queue.poll();
            v = queue.poll();
            if (u == null && v == null)
                continue;
            if ((u == null || v == null) || (u.val != v.val))
                return false;
            queue.offer(u.left);
            queue.offer(v.right);

            queue.offer(u.right);
            queue.offer(v.left);
        }
        return true;
    }

}
