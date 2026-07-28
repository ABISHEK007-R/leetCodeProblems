class Solution {
    public int addDigits(int num) {
     if(num<=9) return num;
     int temp=num;
     while(true){
        num=temp;
        temp=0;
        if(num<=9) return num;
        while(num!=0){
            temp+=num%10;
            num=num/10;
        }
     }   
    }
}