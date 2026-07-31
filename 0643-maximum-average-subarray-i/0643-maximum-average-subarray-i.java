class Solution {
    public double findMaxAverage(int[] nums, int k) {
     double max=Integer.MIN_VALUE;
     double sum=0;
     double avg=Integer.MIN_VALUE;
     int j=0;
     for(int i=0;i<k;i++){
        sum+=nums[i];
     }   
     max=Math.max(sum/k,max);
     for(int i=k;i<nums.length;i++){
         sum-=nums[j];
         sum+=nums[i];
        avg=sum/k;
         if(max<avg){
            max=avg;
         }
         avg=0;
         j++;
     }
     return max;
    }
}