class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        int h=hours.length;
        for(int i=0;i<h;i++)
        {
            if(target<=hours[i])
            {
                count++;
            }
        }
        return count;
    }
}