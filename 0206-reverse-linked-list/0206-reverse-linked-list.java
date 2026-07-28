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
    ListNode redirect=null;
    public void reverse(ListNode temp,ListNode head){
        if(head.next==null) return ;
        temp=head;
        redirect=head=head.next;
        reverse(temp,head);
        head.next=temp;
        temp.next=null;
    }
    public ListNode reverseList(ListNode head) {
    if(head==null||head.next==null) return head;
    reverse(head,head);
    return redirect;    
    }
}