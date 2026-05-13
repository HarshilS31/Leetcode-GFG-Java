
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        int len=length(head);
        k%=len;
        if(k==0) return head;
        ListNode fast=head;
        ListNode slow=head;
        for(int i=0;i<k;i++) {
            fast=fast.next;
        }
        while(fast.next!=null) {
            slow=slow.next;
            fast=fast.next;
        }
        ListNode temp2=slow.next;
        slow.next=null;
        fast.next=head;
        return temp2;
      
    }
    int length(ListNode head) {
        int count=0;
        ListNode temp=head;
        while(temp!=null) {
            count++;
            temp=temp.next;
        }
        return count;
    }
}