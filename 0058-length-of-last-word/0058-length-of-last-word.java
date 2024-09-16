class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int n=s.length();
        int lastspace=s.lastIndexOf(' ');
        return n-lastspace-1;
    }
}