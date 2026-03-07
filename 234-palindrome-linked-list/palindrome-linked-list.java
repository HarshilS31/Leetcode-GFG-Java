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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        
        ListNode s = head;
        ListNode f = head;
        while(f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        
        ListNode prev = null;
        ListNode curr = s;
        while(curr != null) {
            ListNode fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        
        ListNode checker = head;
        ListNode checker2 = prev;
        
        while(checker2 != null) {
            if(checker.val != checker2.val) return false;
            checker = checker.next;
            checker2 = checker2.next;
        }
        
        return true;
    }
}
        //List<Integer> check=new ArrayList<>();
        //List<Integer> check2=new ArrayList<>();
        //ListNode temp=head;
        //while(temp!=null) {
        //    check.add(temp.val);
        //    temp=temp.next;
        //}
        //for(int i=check.size()-1;i>0;i--) {
        //    check2.add(check.get(i));
        //}
        //for(int i=0;i<check.size()-1;i++) {
        //    if (check.get(i)!=check2.get(i)) return false;
        //}
        //return true;
