class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] colored=new int[n];
        Arrays.fill(colored,-1);
        //0->Red,1->Blue
        for(int i=0;i<n;i++) {
            if(colored[i]==-1) {
                if(!bfs(graph,colored,i)) return false;
            }
        }
        return true;

    }
    boolean bfs(int[][] graph,int[] colored,int idx) {
        Queue<Integer> q = new LinkedList<>();
        q.add(idx);
        colored[idx]=0;

        while(q.size()>0) {
            int front=q.remove();
            int color=colored[front];
            for(int node:graph[front]) {
                if(colored[front]==colored[node]) return false;
                if(colored[node]==-1) q.add(node);
                colored[node]=1-colored[front];
                
            }
        }
        return true;    
    }

}