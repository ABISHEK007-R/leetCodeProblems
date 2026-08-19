class Solution {
    public long maxScore(int n, int[][] edges) {
      long ans=0;
      int e=edges.length-1;
      ans=(long)n*(n-1);
      int i=0,j=2;
      long temp=0;
      while(e!=0){
      temp=(long)(n-i)*(n-j);
      if(temp==0){
        temp=n-i;
      }
      i++;
      j++;
      ans+=temp;
      e--;
      }
      return ans;
    }
}