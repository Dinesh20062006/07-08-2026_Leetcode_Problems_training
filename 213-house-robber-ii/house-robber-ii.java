class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int ans1=robb(nums,0,nums.length-2);
        int ans2=robb(nums,1,nums.length-1);
        return Math.max(ans1,ans2);
    }
    public int robb(int[] nums,int l,int h) {
        int oldest =0;
        int older = 0;
        for(int i=l;i<=h;i++)
        {
            int curr=Math.max(older,nums[i]+oldest);
            oldest=older;
            older=curr;
        }
        return older;
    }
}