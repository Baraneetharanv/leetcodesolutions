class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        /*int n=nums1.length;
        int m=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if(n==m)
        {
            return nums2[0]-nums1[0];
        }
        return 0;
        
    }
}*/    int sum1=0,sum2=0;
       int n=nums1.length;
       for(int num:nums1)
       {
            sum1+=num;
       }
       for(int num:nums2)
       {
            sum2+=num;
       }
       return (sum2-sum1)/n;

    }
}           