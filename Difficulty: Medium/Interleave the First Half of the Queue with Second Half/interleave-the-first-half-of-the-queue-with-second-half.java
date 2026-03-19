class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        int n=q.size();
        Queue <Integer> h1= new LinkedList<>();
        Queue <Integer> h2= new LinkedList<>();
        for (int i=0;i<(n/2);i++) h1.add(q.remove());
        for (int i=0;i<(n/2);i++) {
            q.add(h1.remove());
            q.add(q.remove());
            
           
        }
    }
}
