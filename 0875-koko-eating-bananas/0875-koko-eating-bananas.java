class Solution {
    public boolean check(int mid,int h,int[] p){
        int count=0;
        for(int i=0;i<p.length;i++){
            if(p[i]%mid==0) count+=p[i]/mid;
            else count+=p[i]/mid+1;
        }
        return count<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
    int low=1;
    int ans=0;
    int high=piles[0];
    for(int i=0;i<piles.length;i++){
    if(high<piles[i]){
      high=piles[i];
    }
    }
    high=Integer.MAX_VALUE;
    System.out.println(high);
    while(low<=high){
        int mid=low+(high-low)/2;
        if(check(mid,h,piles)){
            high=mid-1;
            ans=mid;
        }
        else{
            low=mid+1;
        }
    } 
    return ans;   
    }
}