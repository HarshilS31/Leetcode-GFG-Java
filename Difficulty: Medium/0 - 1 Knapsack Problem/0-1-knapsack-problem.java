class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        int[][] dp= new int[val.length][W+1];
        for(int i=0;i<dp.length;i++) {
            for(int j=0;j<dp[0].length;j++) {
                dp[i][j]=-1;
                
            }
        }
        return profit(0,val,wt,W,dp);
       
        
    }
    public int profit(int i, int val[], int wt[],int W,int[][] dp) {
        if(i==wt.length) return 0;
        if (dp[i][W]!=-1) return dp[i][W];
        int skip=profit(i+1,val,wt,W,dp);
        if(wt[i]>W) return dp[i][W]=skip;
        int pick=val[i]+profit(i+1,val,wt,W-wt[i],dp);
        return dp[i][W]=Math.max(pick,skip);
        
    }
}
