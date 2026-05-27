class Solution {
    public int findCircleNum(int[][] adj) {
        int count=0;
        int n=adj.length;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++) {
            if(!visited[i]) {
                bfs(adj,visited,i);
                count++;
            }
        }
        return count;
    }
    void bfs(int[][] adj,boolean[] visited,int idx) {
        Queue<Integer> q = new LinkedList<>();
        q.add(idx);
        while(q.size()>0) {
            int front=q.remove();
            for(int k=0;k<adj.length;k++) {
                if(adj[front][k]==1 && !visited[k]) {
                    visited[k]=true;
                    q.add(k);
                }
            }   
        }
        

    }
}