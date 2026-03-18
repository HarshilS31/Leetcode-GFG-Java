class Solution {
    public void reverseQueue(Queue<Integer> q) {
        int n=q.size();
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++) s.push(q.remove());
        for (int j=0;j<n;j++) q.add(s.pop());
        
    }
}