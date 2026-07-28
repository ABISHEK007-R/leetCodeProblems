class Solution {
    public int getLucky(String s, int k) {
        k--;
    int n=0;
    int m=0;
    for(int i=0;i<s.length();i++){
     int temp=s.charAt(i)-'`';
     int rem=0;
     if(temp>9){
       while(temp!=0){
        rem+=temp%10;
        temp=temp/10;
       }
       n+=rem;
     }
     else{
        n+=temp;
     }
    }  
    while(k-->0){
     m=n;
     n=0;
     while(m!=0){
        n+=(m%10);
        m=m/10;
     }
    }
    return n;
    }
}