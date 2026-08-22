class Solution {
    boolean ans=false;
    public void rec(int i,int j,char[][] board,String word,int k){
        if(ans){
            return ;
        }
        if(k==word.length()){
            ans=true;
            return ;
        }
        if(i==-1||i==board.length||j==-1||j==board[0].length){
            return ;
        }
        if(board[i][j]!=word.charAt(k)){
            return ;
        }
        char temp=board[i][j];
            board[i][j]='$';
        rec(i,j-1,board,word,k+1);
        rec(i-1,j,board,word,k+1);
        rec(i,j+1,board,word,k+1);
        rec(i+1,j,board,word,k+1);
        board[i][j]=temp;
    }
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
             if(board[i][j]==word.charAt(0)){
                rec(i,j,board,word,0);
             }
            }
        } 
        return ans;   
    }
}