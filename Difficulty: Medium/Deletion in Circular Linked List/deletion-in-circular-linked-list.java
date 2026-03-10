/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int key) {
        if (head == null) return head;
        if (head.data == key) {
            if (head.next == head) {
                return null;
            }
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }
            last.next = head.next;
            head = head.next;
            return head;
        }
        Node current = head;
        while (current.next != head && current.next.data != key) {
            current = current.next;
        }

        if (current.next.data == key) {
            current.next = current.next.next;
        }
        
        return head;
    }
}