class Solution {
    public int splitArray(int[] nums, int k) {
        int maxElement = 0;
        long totalSum = 0;
        
        for (int num : nums) {
            maxElement = Math.max(maxElement, num);
            totalSum += num;
        }
        
        long low = maxElement;
        long high = totalSum;
        long result = 0;
        
        while (low <= high) {
            long mid = low + (high - low) / 2;
            
            if (canSplit(nums, k, mid)) {
                result = mid;      
                high = mid - 1;  
            } else {
                low = mid + 1;    
            }
        }
        
        return (int) result;
    }
    
    private boolean canSplit(int[] nums, int k, long targetSum) {
        int subarrayCount = 1;
        long currentSum = 0;
        
        for (int num : nums) {
            if (currentSum + num > targetSum) {
                subarrayCount++;
                currentSum = num;
                
                if (subarrayCount > k) {
                    return false;
                }
            } else {
                currentSum += num;
            }
        }
        
        return true;
    }
}