class Solution {
    public double myPow(double a, int n) {
      double ans=1.0;
      long b=Math.abs((long)n);
      while(b!=0){
        if(b%2==1) ans=ans*a;
        a=a*a;
        b/=2;
      }
    if(n<0)  return 1/ans;
      return ans;
    }
}