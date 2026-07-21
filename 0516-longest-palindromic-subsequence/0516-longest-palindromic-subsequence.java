class Solution {
    public int longestPalindromeSubseq(String s) {
    String text1=s;
    String text2=new StringBuilder(s).reverse().toString();
      int ans[][]=new int[text1.length()+1][text2.length()+1];
        for(int i=1;i<text1.length()+1;i++){
            for(int j=1;j<text2.length()+1;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    ans[i][j]=ans[i-1][j-1]+1;;
                }
                else{
                    ans[i][j]=Math.max(ans[i][j-1],ans[i-1][j]);
                }
            }
        }
        return ans[text1.length()][text2.length()];
    }
}