class Solution {
    public int mySqrt(int x) {
        if(x==1) return 1;
        long low=1;
        long high=x/2;
        long ans=0;
        while(low<=high){
        long mid=low+(high-low)/2;
         long temp=mid*mid;
        if(temp==x)
        {
            return (int)mid;
        }
        if(temp<x){
            low=mid+1;
            ans=mid;
        }
        else{
            high=mid-1;
        }
        }
        return (int)ans;
    }
}