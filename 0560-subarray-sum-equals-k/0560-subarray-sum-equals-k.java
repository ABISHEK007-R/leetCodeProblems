class Solution {
    public int subarraySum(int[] arr, int k) {
      Map<Integer,Integer> map=new HashMap<>();
      Map<Integer,Integer> map1=new HashMap<>();
            int sum=0;
            int count=0;
            for(int i=0;i<arr.length;i++){
                sum+=arr[i];                
                if(sum==k){
                    count++;
                }
                    count+=map1.getOrDefault(sum-k,0);
                    map1.put(sum,map1.getOrDefault(sum,0)+1);
            }
            return count;    
    }
}