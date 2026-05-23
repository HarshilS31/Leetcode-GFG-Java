class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        boolean[] visited = new boolean[isConnected.length]; 
        
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) { 
                bfs(isConnected, i, visited); 
                count++;
                
            }
        }
        return count;
    }
    void bfs(int[][] cities, int node, boolean[] visited) {
        visited[node] = true; 
        int m = cities.length; 
        int n = cities[0].length; 
        Queue<Integer> q = new LinkedList<>(); 
        q.add(node); 
        while (q.size() > 0) { 
            int front = q.remove(); 
            for (int a = 0; a < cities.length; a++) { 
                if (cities[front][a] == 1 && !visited[a]) { 
                    q.add(a); 
                    visited[a] = true; 
                } 
            } 
        } 
    }
}