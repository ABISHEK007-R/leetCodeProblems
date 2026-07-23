class Solution {
    public String toLowerCase(String s) {
        int i=0;
        StringBuilder sb=new StringBuilder(s);
       while(i!=s.length()){
        if(s.charAt(i)>64&&s.charAt(i)<=90){
            sb.setCharAt(i,(char)(s.charAt(i)+32));
            i++;
        }
        else{
            i++;
        }
       } 
       return sb.toString();
    }
}