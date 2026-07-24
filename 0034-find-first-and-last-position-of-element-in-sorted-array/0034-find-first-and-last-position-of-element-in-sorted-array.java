class Solution {
    public int[] searchRange(int[] nums, int target){
      int low=0;
      int high=nums.length-1;
      int mid;
      int ans[]={-1,-1};
      while(low<=high){
        mid=low+(high-low)/2;
        if(nums[mid]==target){
            high=mid-1;
            ans[0]=mid;
            ans[1]=mid;
        }
        else if(nums[mid]>target)
        {
            high=mid-1;
        }
        else{
            low=mid+1;
        }
      }  
      low=0;
      high=nums.length-1; 
       while(low<=high){
        mid=low+(high-low)/2;
        if(nums[mid]==target){
            low=mid+1;
            ans[1]=mid;
        }
        else if(nums[mid]<target)
        {
            low=mid+1;
        }
        else{
            high=mid-1;
        }
      }
      return ans;   
    }
}