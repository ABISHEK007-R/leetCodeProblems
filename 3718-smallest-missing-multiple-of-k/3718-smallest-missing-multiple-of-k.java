class Solution {
    public int missingMultiple(int[] nums, int k) {
    int ans=0;    
    boolean hash[]=new boolean[1000];
    for(int i=0;i<nums.length;i++){
        hash[nums[i]]=true;
    }   
    for(int i=1;i<=nums.length*k+1;i++){
        if(hash[i*k]==false){
            ans=i*k;
            break;
        }
    }
    return ans;
    }
}