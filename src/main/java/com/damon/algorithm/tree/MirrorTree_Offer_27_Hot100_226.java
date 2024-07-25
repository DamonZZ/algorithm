package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;

public class MirrorTree_Offer_27_Hot100_226 {

    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return root;
        }
//        TreeNode temp = root.right;
//        root.right = root.left;
//        root.left = temp;

        TreeNode right = mirrorTree(root.right);
        TreeNode left = mirrorTree(root.left);
        root.left =right;
        root.right =left;
        return root;
    }


}

