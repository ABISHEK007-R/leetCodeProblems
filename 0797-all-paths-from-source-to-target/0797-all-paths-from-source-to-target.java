class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> temp=new ArrayList<>();
    public void rec(int i,int[][] graph){
        if(i==graph.length-1)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int j=0;j<graph[i].length;j++){
           temp.add(graph[i][j]);
           rec(graph[i][j],graph);
           temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    temp.add(0);
    rec(0,graph);
    return ans;
    }
}