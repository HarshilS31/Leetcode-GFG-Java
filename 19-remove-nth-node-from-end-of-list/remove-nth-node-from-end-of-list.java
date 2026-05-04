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
        ListNode nxt=temp;
        for(int i=0;i<=n;i++) {
            nxt=nxt.next;

        }

        while(nxt!=null) {
            prev=prev.next;
            nxt=nxt.next;

        }
        prev.next=prev.next.next;
        return temp.next;
        


        
    }
}