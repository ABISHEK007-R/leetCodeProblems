class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
      if(n==0)  return 0;
      if(n==1) return nums[0];
      if(n==2) return Math.max(nums[0],nums[1]);
      int temp1[]=new int[n-1];
      int temp2[]=new int[n];
      temp1[0]=nums[0];
      temp1[1]=Math.max(nums[0],nums[1]);
      for(int i=2;i<n-1;i++){
        temp1[i]=Math.max(temp1[i-1],temp1[i-2]+nums[i]);
      } 
      temp2[1]=nums[1];
      temp2[2]=Math.max(nums[1],nums[2]);
      for(int i=3;i<n;i++){
        temp2[i]=Math.max(temp2[i-1],temp2[i-2]+nums[i]);
      } 
      return Math.max(temp1[n-2],temp2[n-1]); 
    }
}