package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;

public class MirrorTree_Offer_27 {

    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;

        mirrorTree(root.right);
        mirrorTree(root.left);
        return root;
    }


}

