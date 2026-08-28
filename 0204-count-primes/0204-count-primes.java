class Solution {
    public int countPrimes(int n) {
    int count=0;
    boolean hash[]=new boolean[n];
    for(int i=2;i<n;i++){
        hash[i]=true;
    }
    for(int p=2;p*p<n;p++){
        if(hash[p]==false){
            continue;
        }
        for(int i=p*p;i<n;i+=p){
            hash[i]=false;
        }
    } 
        for(int i=2;i<n;i++){
        if(hash[i]==true)
        {
            count++;
        }
    } 
    return count;  
    }
}