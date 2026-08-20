class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
    Map<Integer,Integer> hash=new HashMap<>();
    for(int i=0;i<friends.length;i++){
        hash.put(friends[i],1);
    }    
    int ans[]=new int[friends.length];
    int j=0;
    for(int i=0;i<order.length;i++){
        if(hash.getOrDefault(order[i],0)!=0){
        ans[j]=order[i];
        j++;
        }
    }
    return  ans;
    }
}
