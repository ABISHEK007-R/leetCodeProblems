class Solution {
    public int maximum69Number (int num) {
        int a=10;
        int ans=0;
        int flag=0;
        ArrayList<Integer> al=new ArrayList<Integer>();
        while(num!=0){
            al.add(num%10);
            num=num/10;
        }
        for(int i=al.size()-1;i>=0;i--){
          int temp=al.get(i);
          if(flag==0&&temp==6){
            flag++;
            ans=ans*a+9;
          }
          else{
            ans=ans*a+temp;
          }
        }
        return ans;
    }
}