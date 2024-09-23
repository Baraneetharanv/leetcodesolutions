class Solution {
    public String toHex(int num) {
        if(num==0)
        {
            return "0";
        }
        if (num < 0) {
            String hex = Integer.toHexString(num);
            return hex;
        }    
        StringBuilder hex = new StringBuilder();
        while (num > 0) {
            int remainder = num % 16;
            if (remainder < 10) {
                hex.append((char) (remainder + '0')); 
            } else {
                hex.append((char) (remainder - 10 + 'a'));  
            }
            num /= 16;
        }

       
        return (hex.reverse().toString());
    }
}
