class Solution {
    public int kthFactor(int n, int k) {
    if(k==1) return 1;
    int temp=1;
    int ans=1;
    for(int i=2;i<=n;i++){
     if(n%i==0){
      ans=i;
      while(n%i!=0){
        n=n/i;
      }
      temp++;  
     }
        if(temp==k){
        break;
     } 
    } 
    if(k!=temp) return -1;
    return ans;  
    }
}