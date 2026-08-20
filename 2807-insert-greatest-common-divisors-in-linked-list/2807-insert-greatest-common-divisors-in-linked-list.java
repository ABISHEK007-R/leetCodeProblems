/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
     if(head==null||head.next==null) return head;
     ListNode temp1=head;
     ListNode temp2=head.next;
     while(temp2!=null){
        int flag=1;
        int a,b;
       a = Math.max(temp1.val, temp2.val);
       b = Math.min(temp1.val, temp2.val);
        while(flag!=0){
         if(b==0)
         {
         ListNode newValue=new ListNode(a);
         newValue.next=temp2; 
         temp1.next=newValue;
         flag=0;
         } 
         else{
            int temp=b;
            b=a%b;
            a=temp;
         }
        }
        temp1=temp2;
        temp2=temp2.next;
     }   
     return head;
    }
}