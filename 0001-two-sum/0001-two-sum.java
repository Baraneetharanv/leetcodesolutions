class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int j=1;j<n;j++){
            for(int k=j;k<n;k++){
                if(nums[k] + nums[k-j] == target) {
                    return new int[] {k-j, k};
                }
            }
        }
        return new int[2];
    }
}