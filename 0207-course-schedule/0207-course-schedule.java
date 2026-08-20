class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
    int arr[]=new int[numCourses];
    List<List<Integer>> map=new ArrayList<>(numCourses);
    for(int i=0;i<numCourses;i++){
        map.add(new ArrayList<>());
    }
    List<Integer> ans=new ArrayList<>();
    for(int[] a:prerequisites){
        int u=a[1];
        int v=a[0];
        arr[v]++;
        map.get(u).add(v);
    }
    Queue<Integer> topo=new LinkedList<>();
    for(int i=0;i<numCourses;i++){
       if(arr[i]==0)
       {
        topo.offer(i);
       }
    }
    while(!topo.isEmpty()){
        int k=topo.poll();
        ans.add(k);
        for(int i=0;i<map.get(k).size();i++){
            if(--arr[map.get(k).get(i)]==0){
             topo.offer(map.get(k).get(i));
            }
        }
    }
    if(ans.size()!=numCourses){
        return false;
    }
    else{
        return true;
    }
    }
}