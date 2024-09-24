class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        char[] c=s.toCharArray();
        int n=c.length;
        for(int i=0;i<=n-3;++i)
        {
            if(c[i]!=c[i+1] && c[i]!=c[i+2] && c[i+1]!=c[i+2])
            {
                ++count;
            }
        }
        return count;
    }
}