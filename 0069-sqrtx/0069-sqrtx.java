class Solution {
    public int mySqrt(int x) {
        long low=1;
        long high=x;
        long mid;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            long temp=mid*mid;
            if(temp==x)
            return (int)mid;
            else if(temp>x)
            high=mid-1;
            else
            low=mid+1;
        }
        return (int)high;
    }
}