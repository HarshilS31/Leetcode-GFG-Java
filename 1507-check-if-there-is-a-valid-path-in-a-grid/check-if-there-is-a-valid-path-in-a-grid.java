class Solution {
    private int[][][] dirs = {
        {{0,-1},{0,1}},
        {{-1,0},{1,0}},  
        {{0,-1},{1,0}},
        {{0,1},{1,0}},    
        {{0,-1},{-1,0}}, 
        {{0,1},{-1,0}}    
    };

    public boolean hasValidPath(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        visited[0][0] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];
            for (int[] dir : dirs[grid[x][y] - 1]) {
                int nx = x + dir[0], ny = y + dir[1];
                if (nx < 0 || nx >= m || ny < 0 || ny >= n || visited[nx][ny])
                    continue;
                for (int[] backDir : dirs[grid[nx][ny] - 1]) {
                    if (nx + backDir[0] == x && ny + backDir[1] == y) {
                        visited[nx][ny] = true;
                        q.add(new int[]{nx, ny});
                        break;
                    }
                }
            }
        }

        return visited[m-1][n-1];
    }
}