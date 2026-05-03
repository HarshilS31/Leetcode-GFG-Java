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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode prev=temp;
        ListNode fwd=temp;
        for(int i=0;i<=n;i++) {
            fwd=fwd.next;

        }

        while(fwd!=null) {
            prev=prev.next;
            fwd=fwd.next;

        }
        prev.next=prev.next.next;
        return temp.next;
        


        
    }
}