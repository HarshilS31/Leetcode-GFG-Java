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
        List<Integer> check=new ArrayList<>();
        List<Integer> check2=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null) {
            check.add(temp.val);
            temp=temp.next;
        }

        for(int i=check.size()-1;i>0;i--) {
            check2.add(check.get(i));
        }
        for(int i=0;i<check.size()-1;i++) {
            if (check.get(i)!=check2.get(i)) return false;
        }
        return true;

        
    }
}