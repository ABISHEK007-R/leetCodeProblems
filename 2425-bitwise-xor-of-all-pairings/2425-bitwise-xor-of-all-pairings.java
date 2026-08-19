class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
    int n=nums1.length;
    int m=nums2.length;
    if(n%2==0&&m%2==0) return 0;
    int sum1=0,sum2=0;
    for(int i=0;i<n;i++){
        sum1^=nums1[i];
    }    
    for(int i=0;i<m;i++){
        sum2^=nums2[i];
    }
    if(n%2!=0&&m%2!=0) return sum1^sum2;
    return n%2==0?sum1:sum2;
    }
}