class Solution {
    public int diagonalPrime(int[][] nums) {
        int n=nums.length;
        int maximum=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i][i]>maximum && isPrime(nums[i][i]))
            {
                maximum=nums[i][i];
            }
            if(nums[i][n-1-i]>maximum && isPrime(nums[i][n-1-i]))
            {
                maximum=nums[i][n-1-i];
            }
        }
        return maximum;

    }
    public static boolean isPrime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}