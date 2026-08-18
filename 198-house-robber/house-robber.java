class Solution {
    public int rob(int[] nums) {
        int oldest =0;
        int older = nums[0];
        for(int i=2;i<=nums.length;i++)
        {
            int curr=Math.max(older,nums[i-1]+oldest);
            oldest=older;
            older=curr;
        }
        return older;
    }
}