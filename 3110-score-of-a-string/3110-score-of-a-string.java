class Solution {
    public int scoreOfString(String s) {
        int score=0;
     int values[]=new int [s.length()];
     for(int i=0;i<s.length();i++){
        values[i]=s.charAt(i);
     } 
     for(int i=0;i<values.length-1;i++){
     score+=Math.abs(values[i]-values[i+1]);
     }
     return score;  
    }
}