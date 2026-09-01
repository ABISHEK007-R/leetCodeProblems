class Solution {
    public int findMaxLength(int[] arr) {
    Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
            sum--;
            if(arr[i]==1)
            sum++;
            if(sum==0){
                max=Math.max(max,i+1);
            }
            if(map.getOrDefault(sum,-1)!=-1){
                max=Math.max(max,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        return max;    
    }
}