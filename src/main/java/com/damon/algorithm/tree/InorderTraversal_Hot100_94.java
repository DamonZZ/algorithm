package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class InorderTraversal_Hot100_94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList();
        Deque<TreeNode> queue = new LinkedList();
        while (root != null || !queue.isEmpty()) {
            while (root != null) {
                queue.push(root);
                root = root.left;
            }

            root = queue.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }

}
