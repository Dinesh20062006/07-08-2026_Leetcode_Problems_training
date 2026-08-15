class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean[] seen = new boolean[52]; 
        
        for (int[] range : ranges) {
            for (int i = range[0]; i <= range[1]; i++) {
                seen[i] = true;
            }
        }
        
        for (int i = left; i <= right; i++) {
            if (!seen[i]) {
                return false; 
            }
        }
        
        return true; 
    }
}