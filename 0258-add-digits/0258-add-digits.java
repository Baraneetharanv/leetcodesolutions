class Solution {
    public int addDigits(int num) {
        if(num<10)
        {
            return num;
        }
        int sum=0;
        while(true){
            
            while(num>0)
            {
                sum+=num%10;
                num=num/10; 
            }      
            if(sum<10)
            {
            break;
            }
            num=sum;
            sum=0;
        }    
        return sum;
    }
}