class Solution {
    public long minimumSteps(String s) {
        int i=0;
        int j=s.length()-1;
        long count=0;
        while(i<j){
            if(s.charAt(i)=='1' && s.charAt(j)=='0'){
                count+=j-i;
                i++;
                j--;
            }
            else if(s.charAt(i)=='1') j--;
            else i++;
        }
        return count;
    }
}