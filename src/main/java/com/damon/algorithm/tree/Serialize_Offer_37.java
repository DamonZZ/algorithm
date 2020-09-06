package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Serialize_Offer_37 {

    // Encodes a tree to a single string.
    public String serialize(final TreeNode root) {
        if (root == null) return "[]";
        Queue<TreeNode> queue = new LinkedList() {{
            add(root);
        }};
        StringBuffer sb = new StringBuffer("[");
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                sb.append(node.val + ",");
                queue.add(node.left);
                queue.add(node.right);
            } else {
                sb.append("null,");
            }
        }
        sb = sb.deleteCharAt(sb.length() - 1);
        sb = sb.append("]");
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.equalsIgnoreCase("[]")) return null;
        final String[] vals = data.substring(1, data.length() - 1).split(",");
        int i = 1;
        final TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        Queue<TreeNode> queue = new LinkedList() {{
            add(root);
        }};
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (!vals[i].equalsIgnoreCase("null")) {
                node.left = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(node.left);
            }
            i++;
            if (!vals[i].equalsIgnoreCase("null")) {
                node.right = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(node.right);
            }
            i++;
        }
        return root;
    }

}
