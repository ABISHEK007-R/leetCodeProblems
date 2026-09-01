class Solution {
    public int numIdenticalPairs(int[] nums) {  
    Map<Integer,Integer> map=new HashMap<>();
    int sum=0;
    for(int i=0;i<nums.length;i++){
     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    }
    for(int i=0;i<nums.length;i++){
     if(map.get(nums[i])>1){
        int n=map.get(nums[i])-1;
        sum+=(n*(n+1))/2;
        map.put(nums[i],0);
     }
    }
    return sum;  
    }
}