package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;

public class IsSymmetric_Offer_28 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return this.match(root.left, root.right);
    }

    public boolean match(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null || left.val != right.val) return false;
        return this.match(left.right, right.left) && this.match(left.left, right.right);
    }

}
