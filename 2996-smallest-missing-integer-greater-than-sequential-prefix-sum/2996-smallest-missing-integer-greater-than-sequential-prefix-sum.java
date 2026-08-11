class Solution {
    public int missingInteger(int[] nums) {
    int hash[]=new int[1301];
    int sum=nums[0];
    int i;
    for(i=1;i<nums.length;i++){
        if(nums[i-1]-nums[i]==-1){
          sum+=nums[i];
        }
        else{
            break;
        }
    } 
    for(int j=0;j<nums.length;j++){
        hash[nums[j]]++;
    }
    while(hash[sum]>=1){
        sum++;
    }
    return sum;
    }
}