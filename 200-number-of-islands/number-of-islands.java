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
    void dfs(char[][] grid, boolean[][] visited, int i, int j)  {
        int[][] directions ={{1,0},{-1,0},{0,1},{0,-1}};
        visited[i][j]=true;
        for(int[] d:directions) {
            int i1=i+d[0];
            int j1=j+d[1];
            if(i1>=0 && j1>=0 && i1<grid.length && j1<grid[0].length && !visited[i1][j1] && grid[i1][j1]=='1') dfs(grid,visited,i1,j1);
        }
    }
     

}