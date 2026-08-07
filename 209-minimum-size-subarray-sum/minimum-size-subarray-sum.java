class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int right=0;right<nums.length;right++)
        {
            if(nums[right]==target)
            {
                min=1;
                break;
            }
            sum=sum+nums[right];
            while(sum>=target)
            {
                min=Math.min(min,right-left+1);
                 sum =sum-nums[left];
                left++;
            }
        }
        if(min!=Integer.MAX_VALUE)
        {
        return min;
        }
        return 0;
    }
}