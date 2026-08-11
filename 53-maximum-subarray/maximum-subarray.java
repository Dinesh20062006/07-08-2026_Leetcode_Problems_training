class Solution {
    public int maxSubArray(int[] nums) {
        int bestStanding = nums[0];
        int max = nums[0];
        for(int i = 1 ; i< nums.length ; i++){
            bestStanding =  Math.max(nums[i] , bestStanding + nums[i]);
            max = Math.max(bestStanding , max);
        }
        return max;
        
    }
}