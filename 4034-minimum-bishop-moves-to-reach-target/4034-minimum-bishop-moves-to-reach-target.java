class Solution {
    public int minBishopMoves(int[] source, int[] target) {
    int c1=0;
    int c2=0;
    for(int i=0;i<2;i++){
        c1+=source[i];
        c2+=target[i];
    }  
    if((c1+c2)%2==0){
       if(c1==c2){
        return 1;
       }
       c1=source[0]-source[1];
       c2=target[0]-target[1];
       if(c1==c2){
       return 1;
       }
       else{
        return 2;
       }
    } 
    return -1; 
    }
}