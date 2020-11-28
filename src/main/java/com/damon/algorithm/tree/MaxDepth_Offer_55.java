package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class MaxDepth_Offer_55 {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        List<TreeNode> queue = new LinkedList<TreeNode>() {{
            add(root);
        }}, temp;
        int res = 0;
        while (!queue.isEmpty()) {
            temp = new LinkedList<>();
            for (TreeNode node : queue) {
                if (node.left != null) temp.add(node.left);
                if (node.right != null) temp.add(node.right);
            }
            queue = temp;
            res++;
        }
        return res;
    }

    public boolean isBalanced(TreeNode root) {
        return this.recur(root) != -1;
    }

    public int recur(TreeNode treeNode) {
        if (treeNode == null) return 0;
        int left = recur(treeNode.left);
        if (left == -1) return -1;
        int right = recur(treeNode.right);
        if (right == -1) return -1;
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }

}
