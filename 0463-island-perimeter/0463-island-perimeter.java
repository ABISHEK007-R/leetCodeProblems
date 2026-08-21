class Solution {
    int peri=0;
    public void rec(int i,int j,int[][] grid){
        if(i!=-1&&j!=-1&&i!=grid.length&&j!=grid[0].length&&grid[i][j]==-1){
        return;
    }
    if(i==-1||j==-1||i==grid.length||j==grid[0].length||grid[i][j]==0){
        peri+=1;
        return;
    }
    else{
        grid[i][j]=-1;
    }

    rec(i,j-1,grid);
    rec(i-1,j,grid);
    rec(i,j+1,grid);
    rec(i+1,j,grid);
    }
    public int islandPerimeter(int[][] grid) {
    int i=0,j=0;
    for(int k=0;k<grid.length;k++){
        int flag=0;
        for(int l=0;l<grid[0].length;l++){
            if(grid[k][l]==1){
                i=k;
                j=l;
                flag=1;
                break;
            }
            if(flag==1){
                break;
            }
        }
    }
    rec(i,j,grid);
    return peri;   
    }
}