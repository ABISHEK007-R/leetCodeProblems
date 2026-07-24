class Solution {
    public int findMin(int[] nums) {
    int low=0;
    int high=nums.length-1;
    int ans=nums[low];
    while(low<high){
        int mid=low+(high-low)/2;
        if(nums[low]<=nums[mid]){
            low=mid+1;
           if(ans>nums[low]){
            ans=nums[low];
           }
        }
        else{
            high=mid;
        }
    } 
    return ans;
    }
}