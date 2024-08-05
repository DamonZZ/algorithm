package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PathSum_Offer_34_Hot100_434 {

    private List<List<Integer>> res = new LinkedList<>();
    private LinkedList<Integer> path = new LinkedList<>();
    int count = 0;
    int targetSum = 0;

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        this.recur(root, sum);
        return this.res;
    }

    private void recur(TreeNode root, int num) {
        if (root == null) return;
        num = num - root.val;
        path.add(root.val);
        if (num == 0 && root.left == null && root.right == null) {
            res.add(new LinkedList(this.path));
        }
        this.recur(root.left, num);
        this.recur(root.right, num);
        this.path.removeLast();
    }




    public int pathSum2(TreeNode root, int targetSum) {
        if (root == null)
            return this.count;
        this.targetSum = targetSum;
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                dfsCheck(node, 0);
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
        }
        return this.count;
    }

    private void dfsCheck(TreeNode node, long sum) {
        if (node == null)
            return;
        sum = sum + node.val;
        if (sum == this.targetSum)
            this.count++;
        dfsCheck(node.left, sum);
        dfsCheck(node.right, sum);
    }

}