class Solution {
    public int smallestIndex(int[] nums) {
        int ans=Integer.MAX_VALUE;
    for(int i=0;i<nums.length;i++){
        int sum=0;
        int temp=nums[i];
        while(temp!=0){
            sum+=temp%10;
            temp=temp/10;
        }
        if(sum==i){
           ans=Math.min(ans,sum); 
        }
    } 
    if(ans==Integer.MAX_VALUE){
        return -1;
    } 
    else
    {
        return ans;
    }
    }
}