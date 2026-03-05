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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode i=list1;
        ListNode j=list2;
        ListNode k=dummy;
        while(i!=null && j!=null) {
            if(i.val<=j.val) {
                k.next=i;
                i=i.next;
            }
            else {// i.val>j.val
            k.next=j;
            j=j.next; 
            }
            k=k.next;

        }
        if(i==null) k.next=j;
        else  k.next=i;
        return dummy.next;


    
        
        
    }
}