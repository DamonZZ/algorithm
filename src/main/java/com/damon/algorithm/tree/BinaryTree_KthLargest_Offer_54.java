package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;

public class BinaryTree_KthLargest_Offer_54 {

    int res, k;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        this.dfs(root);
        return this.res;
    }

    public void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.right);
        if (this.k == 0) return;
        if (--this.k == 0) {
            this.res = root.val;
        }
        dfs(root.left);
    }
}
