class Solution {
    public int findCenter(int[][] edges) {
    int n=edges.length;
    int ans[]=new int[n+2];
    for(int i=0;i<n;i++){
        ans[edges[i][0]]++;
        ans[edges[i][1]]++;
    } 
    for(int i=0;i<=n+1;i++){
    if(ans[i]==n)
    {
        return i;
    }
    }
    return 0;
    }
}