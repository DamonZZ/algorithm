package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class PathSum_Offer_34 {

    private List<List<Integer>> res = new LinkedList<>();
    private LinkedList<Integer> path = new LinkedList<>();

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

}
