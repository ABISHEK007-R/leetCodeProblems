class Solution {
    int search(int l,int h,int t,int[] n){
        if(h<l) return -1;
        int mid=l+(h-l)/2;
        if(n[mid]==t) return mid;
        if(n[mid]>t)
        return search(l,mid-1,t,n);
        else
        return search(mid+1,h,t,n);
    }
    public int search(int[] nums, int target) {
        int ans=search(0,nums.length-1,target,nums);
        return ans;
    }
}