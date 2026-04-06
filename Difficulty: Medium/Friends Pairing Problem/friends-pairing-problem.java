// User function Template for Java

class Solution {
    public long countFriendsPairings(int n) {
        long[] dp = new long[n+1];
        Arrays.fill(dp,-1);
        return pairs(n,dp);
        
        
    }
    public long pairs(int n,long[] dp) {
        if(n<=2) return n;
        if (dp[n]!=-1) return dp[n];
        return  dp[n]=pairs(n-1,dp)+(n-1)*pairs(n-2,dp);
        
       
    }
}
