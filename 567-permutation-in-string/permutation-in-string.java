class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
        {
            return false;
        }

        int[] fre1=new int[26];
        int[] fre2=new int[26];

        for(char c:s1.toCharArray())
        {
            fre1[c-'a']++;
        }

        int k=s1.length();

        for(int i=0;i<k;i++)
        {
            fre2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(fre1,fre2))
        {
            return true;
        }
        for(int i=k;i<s2.length();i++)
        {
            fre2[s2.charAt(i)-'a']++;
            fre2[s2.charAt(i-k)-'a']--;
            if(Arrays.equals(fre1,fre2))
            {
                return true;
            }
        }
        return false;
    }
}