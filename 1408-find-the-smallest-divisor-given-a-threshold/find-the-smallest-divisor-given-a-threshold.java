class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = 0;
        
        for (int num : nums) {
            if (num > right) {
                right = num;
            }
        }
        
        int result = right;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (isValid(nums, mid, threshold)) {
                result = mid;    
                right = mid - 1; 
            } else {
                left = mid + 1;  
            }
        }
        
        return result;
    }
    
    private boolean isValid(int[] nums, int divisor, int threshold) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + divisor - 1) / divisor; 
        }
        return sum <= threshold;
    }
}