class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int k=nums[0];
        for(int i=0;i<n;i++)
        {
            if(k>nums[i])
            {
                k=nums[i];
            }
        }
        return k;
    }
}