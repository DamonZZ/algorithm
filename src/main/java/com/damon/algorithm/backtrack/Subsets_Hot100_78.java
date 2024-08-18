package com.damon.algorithm.backtrack;

import java.util.ArrayList;
import java.util.List;

public class Subsets_Hot100_78 {

    private List<Integer> t = new ArrayList();
    private List<List<Integer>> ans = new ArrayList();

    public List<List<Integer>> subsets(int[] nums) {
        this.dfs(0, nums);
        return this.ans;
    }

    private void dfs(int cur, int[] nums) {
        if (cur == nums.length) {
            this.ans.add(new ArrayList(this.t));
            return;
        }

        this.t.add(nums[cur]);

        this.dfs(cur + 1, nums);
        this.t.remove(this.t.size() - 1);
        this.dfs(cur + 1, nums);
    }

}
