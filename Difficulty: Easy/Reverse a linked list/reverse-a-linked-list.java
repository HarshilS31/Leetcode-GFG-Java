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
    Node reverseList(Node head) {
        Node curr=head;
        Node prev=null;
        while(curr!=null) {
            Node fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
            
            
        }
        return prev;
        
        
    
        
       
    
        
        
    }
}