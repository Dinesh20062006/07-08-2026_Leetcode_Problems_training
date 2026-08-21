import java.util.Arrays;

class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] memo = new int[n][n + 1];
        
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        
        return LIS(nums, n, 0, -1, memo);
    }
    
    public int LIS(int[] nums, int n, int i, int prev, int[][] memo) {
        if (i == n) {
            return 0;
        }
        
        if (memo[i][prev + 1] != -1) {
            return memo[i][prev + 1];
        }
        
        int np = LIS(nums, n, i + 1, prev, memo);
        int p = 0;
        if (prev == -1 || nums[i] > nums[prev]) {
            p = 1 + LIS(nums, n, i + 1, i, memo);
        }
        
        return memo[i][prev + 1] = Math.max(np, p);
    }
}
