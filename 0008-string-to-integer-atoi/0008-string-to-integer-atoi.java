class Solution {
    public int myAtoi(String s) {
      int i=0;
      int sign=1;
      int ans=0;
      if(s.length()==0) return 0;
      while(i<s.length()&&s.charAt(i)==' '){
        i++;
      }  
      if(i==s.length()) return 0;
      if(s.charAt(i)=='-'){
        sign=-1;
        i++;
      }
      else if(s.charAt(i)=='+') i++;

      while(i!=s.length()){
        if(s.charAt(i)<'0'||s.charAt(i)>'9')
        {
            break;
        }
        if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && s.charAt(i)-'0' > Integer.MAX_VALUE % 10)) {
        return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }
        else{
            ans=ans*10+(s.charAt(i)-'0');
            i++;
        }
      }
      return ans*sign;
    }
}