class Solution {
    public int[] concatWithReverse(int[] nums) {
     int ans[]=new int[2*nums.length];
     for(int i=0;i<nums.length;i++){
        ans[i]=nums[i];
     }   
     int k=0;
     for(int j=nums.length-1;j>=0;j--){
        ans[k+nums.length]=nums[j];
        k++;
     }
     return ans;
    }
}