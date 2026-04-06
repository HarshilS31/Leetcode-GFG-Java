class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return Stairs(n,dp);
        
    }
    public int Stairs(int n,int[] dp) {
        if(n<=2) return n;
        if (dp[n]!=-1) return dp[n];
        else return dp[n]=Stairs(n-1,dp)+Stairs(n-2,dp);
    }
}