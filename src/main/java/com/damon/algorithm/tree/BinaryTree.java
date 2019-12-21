package com.damon.algorithm.tree;

public class BinaryTree {

    public boolean VerifySquenceOfBST(int[] sequence) {
        boolean result = false;

        if (sequence == null || sequence.length < 1) {
            return result;
        }

        int root = sequence[sequence.length - 1];
        int i = 0;
        while (sequence[i] < root) {
            i++;
        }

        int j = i;
        for (; j < sequence.length - 1; j++) {
            if (sequence[j] < root) {
                return false;
            }
        }

        boolean left = true;
        if (i > 0) {
            left = this.VerifySquenceOfBST(this.getLeftChildren(i, sequence));
        }

        boolean right = true;
        if (i < sequence.length - 1) {
            right = this.VerifySquenceOfBST(this.getRightChildren(i, sequence));
        }

        return (left && right);
    }

    private int[] getLeftChildren(int index, int[] sequence) {
        int[] children = new int[index];
        for (int i = 0; i < index; i++) {
            children[i] = sequence[i];
        }
        return children;
    }

    private int[] getRightChildren(int index, int[] sequence) {
        int[] children = new int[sequence.length - 1 - index];
        int j = 0;
        for (int i = index; i < sequence.length - 1; i++) {
            children[j] = sequence[i];
            j++;
        }
        return children;
    }



}
