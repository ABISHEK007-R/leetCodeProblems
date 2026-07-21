class Solution {
    public int minDistance(String word1, String word2) {
      String text1=word1;
    String text2=word2;
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
        return text1.length()+text2.length()-2*(ans[text1.length()][text2.length()]);   
    }
}