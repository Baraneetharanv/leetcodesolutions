class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i=0; i<details.length; i++) {
            int age = ((details[i].charAt(11)-'0') * 10) + details[i].charAt(12)-'0';
            count = age > 60 ? count+1 : count;
        }
        return count;
    }
}
    