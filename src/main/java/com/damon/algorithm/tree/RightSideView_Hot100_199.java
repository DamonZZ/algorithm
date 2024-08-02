package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;

import java.util.*;

public class RightSideView_Hot100_199 {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList();
        if (root == null) return ans;
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);
        int count;
        while (!q.isEmpty()) {
            count = q.size();
            for (int i = 0; i < count; i++) {
                TreeNode node = q.poll();
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
                if (i == count - 1) ans.add(node.val);
            }
        }
        return ans;
    }


    public List<Integer> rightSideViewDsf(TreeNode root) {
        List<Integer> ans = new ArrayList();
        if (root == null) return ans;
        Deque<TreeNode> queue = new LinkedList();
        Deque<Integer> depthQueue = new LinkedList<>();
        queue.push(root);
        depthQueue.push(1);
        int maxDepth = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.pop();
            Integer depth = depthQueue.pop();
            if (depth > maxDepth) {
                maxDepth = depth;
                ans.add(node.val);
            }
            if (node.left != null) {
                queue.push(node.left);
                depthQueue.push(depth + 1);
            }
            if (node.right != null) {
                queue.push(node.right);
                depthQueue.push(depth + 1);
            }
        }
        return ans;
    }

}
