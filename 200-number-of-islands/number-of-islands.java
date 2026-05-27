class Solution {
    
    public int numIslands(char[][] grid) {
        int islands=0;
        int r=grid.length;
        int c=grid[0].length;
        boolean[][] visited =new boolean[r][c];
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                if(!visited[i][j] && grid[i][j]=='1') {
                    bfs(grid,visited,i,j);
                    islands++;
                    
                }
            }
        } 
        return islands;  
    }
    void bfs(char[][] grid, boolean[][] visited, int i, int j) {
        int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Queue<int[]> q = new LinkedList<>();
        visited[i][j] = true; 
        q.add(new int[]{i, j});
        while (q.size() > 0) {
            int[] front = q.remove(); 
            for (int[] d : dir) {
                int i1 = front[0] + d[0];
                int j1 = front[1] + d[1];
                if (i1 >= 0 && i1 < grid.length && j1 >= 0 && j1 < grid[0].length 
                    && grid[i1][j1] == '1' && !visited[i1][j1]) {
                    visited[i1][j1] = true; 
                    q.add(new int[]{i1, j1});
                }
            }
        }
    }

}