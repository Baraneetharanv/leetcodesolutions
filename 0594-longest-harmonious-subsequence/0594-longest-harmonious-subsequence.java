class Solution {
    public int findLHS(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int start=0;
        int maxlength=0;
        for(int end=0;end<n;end++)
        {
            while(nums[end]-nums[start]>1)
            {
                start++;
            }
            if(nums[end]-nums[start]==1)
            {
                maxlength=Math.max(maxlength,end-start+1);
            }
        }
        return maxlength;
    }
}