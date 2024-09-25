class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> r=new HashSet<>();
        for(char c:s.toCharArray())
        {
            if(r.contains(c))
            {
                return c;
            }
            r.add(c);
        }
        return  ' ';
    }
}