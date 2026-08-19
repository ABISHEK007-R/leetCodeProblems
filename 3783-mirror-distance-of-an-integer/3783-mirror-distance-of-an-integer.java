class Solution {
    public int mirrorDistance(int n) {
     int temp=n;
     int mirror=0;
     while(temp!=0){
        int rem=temp%10;
        temp=temp/10;
        mirror=mirror*10+rem;
     }   
     return Math.abs(n-mirror);
    }
}
