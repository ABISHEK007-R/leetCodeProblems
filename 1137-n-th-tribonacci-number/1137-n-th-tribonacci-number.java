class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n<=2) return 1;
        int nth[]=new int[n+1];
        nth[0]=0;
        nth[1]=1;
        nth[2]=1;
        for(int i=3;i<=n;i++){
           nth[i]=nth[i-1]+nth[i-2]+nth[i-3];
        }
        return nth[n];
    }
}