class Solution {
    public int countDigits(int num) {
        if(num==0)
        {
            return 0;
        }
        int count=0;
        int updatednum =num;
        while(num>0)
        {
            int d=num%10;
            num=num/10;
            if(d!=0 && updatednum%d==0)
            {
                count++;
            }
        }
        return count;
    }
}