package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class BuildTree_Offer_07 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0 || inorder == null || inorder.length == 0) return null;
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < preorder.length; i++) {
            map.put(preorder[i], i);
        }
        TreeNode root = buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);
        return root;
    }


    public TreeNode buildTree(int[] preorder, int preorderStart, int preorderEnd, int[] inorder, int inorderStart, int inorderEnd, Map<Integer, Integer> indexMap) {
        if (preorderStart > preorderEnd) {
            return null;
        }
        int rootVal = preorder[preorderStart];
        TreeNode root = new TreeNode(rootVal);
        if (preorderStart == preorderEnd) {
            return root;
        }
        int rootIndex = indexMap.get(rootVal);
        int leftNodes = rootIndex - inorderStart, rightNodes = inorderEnd - rootIndex;
        TreeNode left = buildTree(preorder, preorderStart + 1, preorderStart + leftNodes, inorder, inorderStart, rootIndex - 1, indexMap);
        TreeNode right = buildTree(preorder, preorderEnd - rightNodes + 1, preorderEnd, inorder, rootIndex + 1, inorderEnd, indexMap);
        root.left = left;
        root.right = right;
        return root;
    }

}
