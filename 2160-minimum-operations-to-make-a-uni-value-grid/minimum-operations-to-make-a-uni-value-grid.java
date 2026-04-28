class Solution {
    public int minOperations(int[][] grid, int x) {
        int rows = grid.length, cols = grid[0].length;
        int rem = grid[0][0] % x;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (grid[i][j] % x != rem) return -1;
        int n = rows * cols;
        int[] flat = new int[n];
        int idx = 0;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                flat[idx++] = grid[i][j];
        Arrays.sort(flat);
        int median = flat[n / 2];
        int ops = 0;
        for (int val : flat)
            ops += Math.abs(val - median) / x;

        return ops;
    }
}