class Node {
    String url;
    Node prev;
    Node next;
    Node() {
    }
    Node(String url) {
        this.url=url;

    }

} 
class BrowserHistory {
    private Node head,tail;
    private Node curr;
    public BrowserHistory(String homepage) {
        head= new Node();
        tail= new Node();
        curr = new Node(homepage);
        insert(head,curr,tail);   
    }
    private void insert(Node prev,Node node,Node next) {
        prev.next=node;
        node.prev=prev;
        node.next=next;
        next.prev=node;    
    }
    
    public void visit(String url) {
        Node curr2=new Node(url);
        insert(curr,curr2,tail);
        curr=curr2;  
    } 
    public String back(int steps) { 
        while(steps>0 && curr.prev!=head) {
            curr=curr.prev;
            steps--;
        }
        return curr.url;    
    }  
    public String forward(int steps) {
        while(steps>0 && curr.next!=tail) {
            curr=curr.next;
            steps--;

        }
        return curr.url;
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */