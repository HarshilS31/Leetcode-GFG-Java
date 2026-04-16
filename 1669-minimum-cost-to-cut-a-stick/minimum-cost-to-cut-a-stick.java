class Solution {
    public int minCost(int n, int[] cuts) {
        int[] cuts2= new int[cuts.length+2];
        int i;
        for( i=0;i<cuts.length;i++) {
            cuts2[i]=cuts[i];
        }
        cuts2[i++]=0;
        cuts2[i]=n;
        Arrays.sort(cuts2);
        int[][] dp = new int[cuts2.length-1][cuts2.length-1];
        for(int u=0;u<dp.length;u++) {
            for(int j=0;j<dp.length;j++) dp[u][j]=-1;
        }
        return cost(1,cuts.length,cuts2,dp);
    }
    public static int cost(int i,int j,int[] arr,int[][] dp) {
        if(i>j) return 0;
        if (dp[i][j]!=-1) return dp[i][j];
        int minCost=Integer.MAX_VALUE;
        for(int k=i;k<=j;k++) {
            int len=arr[j+1]-arr[i-1];
            int totalCost=cost(i,k-1,arr,dp)+cost(k+1,j,arr,dp)+len;
            minCost=Math.min(totalCost,minCost);
        }
        return dp[i][j]=minCost;


    }

}