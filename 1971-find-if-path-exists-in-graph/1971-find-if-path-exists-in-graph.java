class Solution {
    boolean ans=false;
    Map<Integer,Boolean> hash=new HashMap<>();
    public void SearchPath(int source,int destination,int[][] edges,List<List<Integer>> searchList){
        if(ans){
            return ;
        }
        if(source==destination){
            ans=true;
        }
        for(int i=0;i<searchList.get(source).size();i++){
         if(hash.getOrDefault(searchList.get(source).get(i),false)){
            continue;
         }
         else{
            hash.put(searchList.get(source).get(i),true);
            SearchPath(searchList.get(source).get(i),destination,edges,searchList);
         }
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
    List<List<Integer>> searchList=new ArrayList<>(n);
    for(int i=0;i<n;i++){
        searchList.add(new ArrayList<>());
    }
    for(int[] a: edges){
        int u=a[0];
        int v=a[1];
        searchList.get(u).add(v);
        searchList.get(v).add(u);
    }
    SearchPath(source,destination,edges,searchList);
    return ans; 
    }
}