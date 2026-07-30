class Solution {
    public int singleNonDuplicate(int[] nums) {
     int low=0;
     int high=nums.length;
     while(low<high){
       int mid=low+(high-low)/2;
       if(mid%2==1){
        if(mid==0) return nums[mid];
         if(nums[mid-1]==nums[mid]){
            low=mid+1;
         }
         else{
            high=mid;
         }
       }
       else{
         if(mid==0) return nums[mid];
         if(nums[mid-1]==nums[mid]){
            high=mid;
         }
         else{
            low=mid+1;
         }
       }
       } 
     return nums[low-1];  
    }
}