package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;

public class LowestCommonAncestor_Offer_68 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (root.val > p.val && root.val > q.val) root = root.left;
            else if (root.val < p.val && root.val < q.val) root = root.right;
            else break;
        }
        return root;
    }

    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = this.lowestCommonAncestor2(root.left, p, q);
        TreeNode right = this.lowestCommonAncestor2(root.right, p, q);
        if (left == null) return right;
        if (right == null) return left;
        return root;
    }
}
