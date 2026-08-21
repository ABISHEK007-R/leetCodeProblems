class Solution {
    int check=0;
    public void rec(int[][] image, int i, int j, int col){
    if(i==-1||j==-1||i==image.length||j==image[0].length||image[i][j]==col||image[i][j]!=check){
        return;
    }
    else if(image[i][j]!=col){
        image[i][j]=col;
    }
   rec(image,i,j-1,col); 
   rec(image,i-1,j,col); 
   rec(image,i+1,j,col); 
   rec(image,i,j+1,col); 
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    check=image[sr][sc];
    rec(image,sr,sc,color); 
    return image;    
    }
}