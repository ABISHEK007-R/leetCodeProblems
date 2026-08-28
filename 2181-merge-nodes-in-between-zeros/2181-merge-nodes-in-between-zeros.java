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
    public ListNode mergeNodes(ListNode head) {
    ListNode temp=head.next;
    ListNode head1=null,temp1=null;
    int sum=0;
    while(temp!=null){
    if(temp.val==0){
        ListNode newNode =new ListNode(sum);
        if(head1==null){
         head1=temp1=newNode;
        }
        else{
            temp1.next=newNode;
            temp1=newNode;
        }
        sum=0;
    }
    else{
         sum+=temp.val;
    }
    temp=temp.next;
    } 
    return head1;  
    }
}
