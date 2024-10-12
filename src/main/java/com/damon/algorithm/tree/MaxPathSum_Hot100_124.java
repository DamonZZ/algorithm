package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;

public class MaxPathSum_Hot100_124 {

    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return maxSum;
    }

    public int maxGain(TreeNode node) {
        if (node == null)
            return 0;
        int leftGain = Math.max(maxGain(node.left), 0);
        int rightGain = Math.max(maxGain(node.right), 0);

        int maxGain = node.val + leftGain + rightGain;
        maxSum = Math.max(maxSum, maxGain);
        return node.val + Math.max(leftGain, rightGain);
    }

}
