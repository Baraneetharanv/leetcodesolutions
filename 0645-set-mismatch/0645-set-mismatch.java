class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int a[]=new int[n+1];
        int miss=0;
        int dup=0;
        for(int i=0;i<n;i++)
        {
            a[nums[i]]++;
        }
        for(int i=1;i<a.length;i++)
        {
            if(a[i]==2)
            {
                dup=i;
            }
            if(a[i]==0)
            {
                miss=i;
            }
        }
        return new int[]{dup,miss};
    }
}