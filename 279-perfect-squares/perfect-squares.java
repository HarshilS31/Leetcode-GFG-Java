class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            if (isPerfectSquare(i)) {
                dp[i] = 1;
            } else {
                int min = Integer.MAX_VALUE;
                for (int j = 1; j * j <= i; j++) {
                    int count = 1 + dp[i - j * j];
                    min = Math.min(min, count);
                }
                dp[i] = min;
            }
        }
        return dp[n];
    }
    
    public boolean isPerfectSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
}