class Solution {
    public boolean isPalindrome(String s) {
    StringBuilder sb=new StringBuilder();
    int i=0;
    while(i!=s.length()){
        if(s.charAt(i)>64&&s.charAt(i)<=90){
            sb.append((char)(s.charAt(i)+32));
        i++;
        }
        else if(s.charAt(i)>96&&s.charAt(i)<=122){
            sb.append(s.charAt(i));
            i++;
        }
        else if(s.charAt(i)>47&&s.charAt(i)<=57){
            sb.append(s.charAt(i));
            i++;
        }
        else{
            i++;
        }
    } 
     String temp1=sb.toString();
     System.out.println(temp1);
      String temp2=sb.reverse().toString();
     System.out.println(temp1);   
     return temp1.equals(temp2);      
    }
}