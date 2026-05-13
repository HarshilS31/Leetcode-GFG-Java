class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevTail = dummy;
        ListNode temp = head;
        while (temp != null) {
            ListNode check = temp;
            for (int i = 0; i < k; i++) {
                if (check == null) {
                    prevTail.next = temp;
                    return dummy.next;
                }
                check = check.next;
            }
            ListNode prev = null;
            ListNode curr = temp;
            for (int i = 0; i < k; i++) {
                ListNode nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }
            prevTail.next = prev;
            prevTail = temp;
            temp = check;
        }
        return dummy.next;
    }
}