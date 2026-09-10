class Solution {
    public void left(int i,int j,int[][] m){
        if(j<0){
            return ;
        }
        else{
        m[i][j]=0;
        left(i,j-1,m); 
        }
    }
        public void right(int i,int j,int[][] m){
        if(j>=m[i].length){
            return ;
        }
        else{
        m[i][j]=0;
        right(i,j+1,m);  
        }
    }
        public void up(int i,int j,int[][] m){
        if(i<0){
            return ;
        }
        else{
        m[i][j]=0;
        up(i-1,j,m);  
        }
    }
        public void down(int i,int j,int[][] m){
        if(i>=m.length){
            return ;
        }
        else{
        m[i][j]=0;
        down(i+1,j,m); 
        }
    }
    public void setZeroes(int[][] matrix) {
    Queue<int []> q=new LinkedList<>();
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            if(matrix[i][j]==0){
                q.offer(new int[]{i,j});
            }
        }
    }
    while(!q.isEmpty()){
        int t[]=q.poll();
        left(t[0],t[1],matrix);
        right(t[0],t[1],matrix);
        up(t[0],t[1],matrix);
        down(t[0],t[1],matrix);
    }    
    }
}