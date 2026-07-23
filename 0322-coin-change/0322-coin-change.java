class Solution {
    public int coinChange(int[] coins, int amount) {
      int n=amount;
      int m=coins.length;
      int ans[][]=new int[m+1][n+1];
      for(int i=1;i<=n;i++){
        ans[0][i]=Integer.MAX_VALUE-1;
      }  
      for(int i=1;i<=m;i++){
        for(int j=1;j<=n;j++){
            if(j>=coins[i-1]){
                ans[i][j]=Math.min(ans[i-1][j],ans[i][j-coins[i-1]]+1);
            }
            else
            ans[i][j]=ans[i-1][j];
        }
      }
      int temp=ans[m][n];
      if(Integer.MAX_VALUE-1==temp) return -1;
      else return temp;
    }
}