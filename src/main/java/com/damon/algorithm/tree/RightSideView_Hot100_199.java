package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

}
