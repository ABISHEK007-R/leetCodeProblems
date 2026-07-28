class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;
        int temp=n;
      while(true){
        n=temp;
        temp=0;
        if(n<=6) break;
        while(n!=0){
         temp+=(n%10)*(n%10);
         n=n/10;
        }
        if(temp==1){
        return true;
      }
      }  
        return false;
    }
}