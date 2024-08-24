package com.damon.algorithm.backtrack;

import java.util.ArrayList;
import java.util.List;

public class Partition_Hot100_131 {

    private List<List<String>> ans = new ArrayList();

    public List<List<String>> partition(String s) {
        List<String> cur = new ArrayList();
        dfs(cur, s, 0);
        return ans;
    }

    private void dfs(List<String> cur, String s, int k) {
        if (k == s.length()) {
            this.ans.add(new ArrayList(cur));
            return;
        }

        for (int i = k; i < s.length(); i++) {
            String str = s.substring(k, i + 1);
            if (!check(str))
                continue;
            cur.add(str);
            dfs(cur, s, i + 1);
            cur.remove(cur.size() - 1);
        }
    }

    private boolean check(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end && s.charAt(start) == s.charAt(end)) {
            start++;
            end--;
        }
        return start >= end;
    }

}
