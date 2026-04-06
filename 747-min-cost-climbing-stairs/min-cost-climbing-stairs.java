class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);//All values will be -1 initially!
        return Math.min(minCost(cost,n-1,dp),minCost(cost,n-2,dp));
    }
    public int minCost(int[] arr,int idx,int[] dp) {
        if(idx<=1) return arr[idx];
        if (dp[idx]!=-1) return dp[idx];
        int cost=arr[idx]+Math.min(minCost(arr,idx-1,dp),minCost(arr,idx-2,dp));
        dp[idx]=cost;
        return cost;
    }

}