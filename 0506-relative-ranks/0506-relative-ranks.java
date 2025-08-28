class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String result[]=new String[n];
        Integer indices[]=new Integer[n];
        for(int i=0;i<n;i++)
        {
            indices[i]=i;
        }    
        Arrays.sort(indices, (a,b) -> score[b] - score[a]);
        for(int rank=0;rank<n;rank++)
        {
          int ind=indices[rank];
          if(rank==0)
          {
             result[ind]="Gold Medal";
          }
          else if(rank==1)
          {
             result[ind]="Silver Medal";
          }
          else if(rank==2){
            result[ind]="Bronze Medal";
          }
          else{
            result[ind]=String.valueOf(rank+1);
          }
        }
        return result;
    }
}