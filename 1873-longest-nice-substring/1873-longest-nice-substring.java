class Solution {
    public String longestNiceSubstring(String s) {
        if(s.length()<2)
        {
            return "";
        }
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            if(s.indexOf(Character.toLowerCase(a))==-1||s.indexOf(Character.toUpperCase(a))==-1)
            {
                String left=longestNiceSubstring(s.substring(0,i));
                String right=longestNiceSubstring(s.substring(i+1));
                return left.length()>=right.length() ? left:right;
            }
        }
        return s;
    }
}