package com.damon.algorithm.string;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Permutation_Offer_38 {

    private List<String> res = new LinkedList<>();

    private char[] c;

    public String[] permutation(String s) {
        this.c = s.toCharArray();
        this.dfs(0);
        return this.res.toArray(new String[this.res.size()]);
    }

    private void dfs(int x) {
        if (x == this.c.length - 1) {
            this.res.add(String.valueOf(this.c));
            return;
        }
        Set<Character> set = new HashSet<>();
        for (int i = x; i < this.c.length; i++) {
            if (set.contains(this.c[i])) continue;
            set.add(this.c[i]);
            System.out.println(set);
            swap(x, i);
            dfs(x + 1);
            swap(i, x);
        }
    }

    private void swap(int a, int b) {
        if (a == b) return;
        char tmp = c[a];
        c[a] = c[b];
        c[b] = tmp;
    }

}
