class Solution {
    public int findGCD(int[] nums) {
    int min=Integer.MAX_VALUE,max=0;
    for(int i=0;i<nums.length;i++){
        if(min>nums[i]){
            min=nums[i];
        }
        if(max<nums[i]){
            max=nums[i];
        }
    }
    while(min!=0){
    int temp=min;
    min=max%min;
    max=temp;
    }
    return max;
    }
}