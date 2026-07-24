class Solution {
    public boolean check(int mid,int d,int[] w){
        int count=0;
        int sum=0;
        for(int i=0;i<w.length;i++){
            if(sum+w[i]<=mid){
                sum+=w[i];
            }
            else{
                count++;
                sum=w[i];
            }
        }
        count++;
        return count<=d;
    } 
    public int shipWithinDays(int[] weights, int days) {
      int high=weights[0];
      int low=weights[0];
      int ans=0;
      for(int i=1;i<weights.length;i++){
        high+=weights[i];
      if(low<weights[i]){
        low=weights[i];
      }
      }
      while(low<=high){
        int mid=low+(high-low)/2;
        if(check(mid,days,weights)){
            high=mid-1;
            ans=mid;
        }
        else{
            low=mid+1;
        }
      }
      return ans; 
    }
}