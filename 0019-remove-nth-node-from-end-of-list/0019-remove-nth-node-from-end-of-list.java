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
    ListNode reverse(ListNode head)
    {
     ListNode prev=null,cur=head,nex;
     while(cur!=null)
     {
        nex=cur.next;
        cur.next=prev;
        prev=cur;
        cur=nex;
     }
     return prev;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        head=reverse(head);
        ListNode temp=head,pre=null;
       for(int i=1;i<n;i++)
       {
         pre=temp;
         temp=temp.next;
       }
       if(pre==null)
       {
        head=temp.next;
       }
       else
       {
        pre.next=temp.next;
       }
       head=reverse(head);
       return head;
    }
}