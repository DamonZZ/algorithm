package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;

public class DiameterOfBinaryTree_Hot100 {


    int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return ans;
    }

    private int depth(TreeNode node) {
        if (node == null)
            return 0;
        int left = depth(node.left);
        int right = depth(node.right);
        ans = Math.max(ans, left + right);
        return Math.max(left, right) + 1;
    }

}
