class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevTail = dummy;
        ListNode temp = head;
        while (temp != null) {
            ListNode[] pair = detacher(temp, k);
            ListNode revHead = pair[0];
            ListNode nextGrp = pair[1];
            if (revHead == null) {
                prevTail.next = temp;
                break;
            }
            prevTail.next = revHead;
            prevTail = temp;
            temp = nextGrp;
        }

        return dummy.next;
    }
    private ListNode[] detacher(ListNode head, int k) {
        ListNode check = head;
        for (int i = 0; i < k; i++) {
            if (check == null) return new ListNode[]{null, null};
            check = check.next;
        }
        ListNode prev = null;
        ListNode curr = head;
        for (int i = 0; i < k; i++) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return new ListNode[]{prev, curr};
    }
}