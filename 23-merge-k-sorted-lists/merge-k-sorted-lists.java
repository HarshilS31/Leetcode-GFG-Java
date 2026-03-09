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
    public ListNode mergeKLists(ListNode[] arr) {
        if(arr.length==0) return null;
        ArrayList<ListNode> lists = new ArrayList<>();
        for(ListNode n:arr) lists.add(n);
        while(lists.size()>1) {
            ListNode a=lists.get(lists.size()-1);
            lists.remove(lists.size()-1);
            ListNode b=lists.get(lists.size()-1);
            lists.remove(lists.size()-1);
            ListNode c= merge(a,b);
            lists.add(c);
        }
        return lists.get(0);
    }
    ListNode merge(ListNode a,ListNode b) {
        ListNode i=a;
        ListNode j=b;
        ListNode dummy=new ListNode(-1);
        ListNode k=dummy;
        while(i!=null && j!=null) {
            if(i.val<j.val) {
                k.next=i;
                i=i.next;

            }
            else {
                k.next=j;
                j=j.next;

            }
            k=k.next;

        }
        if(i==null) k.next=j;
        else k.next=i;
        return dummy.next;

    }
}