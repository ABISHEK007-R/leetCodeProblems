class Solution {
    public boolean isMatch(String s, String p) {
        int m=s.length();
        int n=p.length();   
        boolean ans[][]=new boolean[n+1][m+1];
        ans[0][0]=true;
        for (int i = 1; i <= n; i++) {
            if (p.charAt(i - 1) == '*') {
                ans[i][0] = ans[i - 1][0];
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
            if(p.charAt(i-1)=='*'&&j-1==0){
               ans[i][j-1]=ans[i-1][j-1]; 
            }
              if(p.charAt(i-1)=='*'){
                ans[i][j]=ans[i-1][j]||ans[i][j-1];
              }
              else if(p.charAt(i-1)=='?'){
                ans[i][j]=ans[i-1][j-1];
              }
              else if(p.charAt(i-1)==s.charAt(j-1)){
                ans[i][j]=ans[i-1][j-1];
              }
            }
        }
        return ans[n][m];
    }
}