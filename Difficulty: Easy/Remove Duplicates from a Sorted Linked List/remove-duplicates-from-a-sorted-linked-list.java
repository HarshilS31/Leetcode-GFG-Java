/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head) {
        Node i= head;
        Node j=head;
        while(j!=null) {
            if(i.data==j.data) j=j.next;
            else {
                 i.next=j;
                 i=j;
            }
        }
         i.next=j;
         return head;
         
        
       
       
        
    }
}