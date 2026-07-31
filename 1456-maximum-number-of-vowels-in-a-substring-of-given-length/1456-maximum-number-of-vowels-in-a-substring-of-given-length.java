class Solution {
    public int maxVowels(String s, int k) {
    int count=0;
    int max=0;
    int j=0;
    for(int i=0;i<k;i++){
    if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
        count++;
    }
    }  
    max=Math.max(count,max);
    for(int i=k;i<s.length();i++){
        if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u'){
            count--;
        }
        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
            count++;
        }
        max=Math.max(max,count);
        j++;
    }  
    return max;
    }
}