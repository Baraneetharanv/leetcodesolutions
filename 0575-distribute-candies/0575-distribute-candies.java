class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        int sum=0;
        if(n<=2)
        {
            return n/2;
        }
        Arrays.sort(candyType);
        int uniquecandy=1;
        for(int i=1;i<n;i++)
        {
            if(candyType[i]!=candyType[i-1])
            {
                uniquecandy++;
            }
        }
        return Math.min(uniquecandy,n/2);
    }
}