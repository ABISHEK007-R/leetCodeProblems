class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
     int count=0;
     if((f[0]==0&&f.length==1)||(f[0]==0&&f.length>1&&f[1]==0)){
        count++;
        f[0]=1;
     }
     for(int i=1;i<f.length-1;i++){
        if(f[i]==1){
            continue;
        }
        else if(f[i-1]==0&&f[i+1]==0){
            f[i]=1;
            count++;
        }
     }
     if(f[f.length-1]==0&&f[f.length-2]==0){
        count++;
     }
     return count>=n;
    }
}