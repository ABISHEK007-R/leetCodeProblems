class Solution {
    public int findTargetSumWays(int[] arr, int target) {
        int sum=arr[0];
        int n=arr.length;
            for(int i=1;i<n;i++){
                sum+=arr[i];
            }
            if((target+sum)%2==1||target+sum<0) return 0;

        int ans[][]=new int[n+1][((target+sum)/2)+1];
        for(int i=0;i<=n;i++){
            ans[i][0]=1;
        }
        for(int i=1;i<=n;i++){
            for(int j=0;j<=(target+sum)/2;j++){
                if(j>=arr[i-1]){
                    ans[i][j]=ans[i-1][j]+ans[i-1][j-arr[i-1]];
                }
                else{
                    ans[i][j]=ans[i-1][j];
                }
            }
        }
        return ans[n][(target+sum)/2];  
    }
}