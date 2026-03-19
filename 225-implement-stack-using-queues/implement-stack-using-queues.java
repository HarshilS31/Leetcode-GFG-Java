
class MyStack {
    Queue<Integer> q=new LinkedList<>();
    Queue<Integer> helper=new LinkedList<>();



    public MyStack() {

        
    }
    
    public void push(int x) {
        q.add(x);


        
    }
    
    public int pop() {
        int n=q.size();
        for (int i=1;i<n;i++) q.add(q.remove());
        int x =q.remove();
        return x; 
    }
    
    public int top() {
        int n=q.size();
        for (int i=1;i<n;i++) q.add(q.remove());
        int x =q.peek();
        q.add(q.remove());
        return x; 
        
    }
    
    public boolean empty() {
        return (q.size()==0);
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */