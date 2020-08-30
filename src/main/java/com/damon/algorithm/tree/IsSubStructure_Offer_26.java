package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;

public class IsSubStructure_Offer_26 {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) return false;
        return this.match(A, B) || this.isSubStructure(A.left, B) || this.isSubStructure(A.right, B);
    }

    public boolean match(TreeNode A, TreeNode B) {
        if (B == null) return true;
        if (A == null || A.val != B.val) return false;
        return this.match(A.left, B.left) && this.match(A.right, B.right);
    }


}
