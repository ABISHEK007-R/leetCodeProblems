class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
    int hash[]=new int[50+1];
    int ans[]=new int[A.length];
    int count=0;
    for(int i=0;i<A.length;i++){
        hash[A[i]]++;
        hash[B[i]]++;
        if(hash[A[i]]==2){
            count++;
        }
         if(hash[B[i]]==2){
            count++;
        }
        if(A[i]==B[i]){
            count--;
        }
        ans[i]=count;
    }
    return ans;   
    }
}
