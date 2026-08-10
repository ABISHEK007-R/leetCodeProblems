class Solution {
    public int findPoisonedDuration(int[] time, int d) {
    int count=0;
    int temp[]=new int[time.length];
    temp[temp.length-1]=Integer.MAX_VALUE;
    for(int i=temp.length-2;i>=0;i--){
     temp[i]=time[i+1]-time[i];
    }
    for(int i=0;i<time.length;i++){
        if(temp[i]>=d) {
            count+=d;
        }
        else{
            count+=temp[i];
        }
    }
    return count;
    }
}