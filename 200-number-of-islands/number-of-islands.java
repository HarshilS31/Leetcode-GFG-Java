class Solution {
    public int numIslands(char[][] grid) {
        int islands=0;
        int r=grid.length;
        int c=grid[0].length;
        boolean[][] visited =new boolean[r][c];
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                if(!visited[i][j] && grid[i][j]=='1') {
                    dfs(grid,visited,i,j);
                    islands++;
                    
                }
            }
        } 
        return islands;  
    }
    void dfs(char[][] grid, boolean[][] visited, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || visited[i][j] || grid[i][j] == '0')  return;

        visited[i][j] = true;
        dfs(grid, visited, i - 1, j); 
        dfs(grid, visited, i + 1, j);
        dfs(grid, visited, i, j - 1); 
        dfs(grid, visited, i, j + 1); 
}


}