class Solution {
    static int sum;
    public int findTargetSumWays(int[] nums, int target) {
        sum=0;
        int n = nums.length;
        for(int ele:nums) sum+=ele;
        int [][] dp = new int[n][2*sum+1];
        for(int i=0;i<dp.length;i++) {
            for(int j=0;j<dp[0].length;j++) {
                dp[i][j]=-1;
            }
        }

            
        return ways(0,nums,0,target,dp);
        
    }
    public int ways(int i ,int[] nums,int res,int target,int [][] dp) {
        if(i==nums.length) {
            if(target==0) return 1;//Valid way
            else return 0;
        }
        if(dp[i][res+sum]!=-1) return dp[i][res+sum];
        int add=ways(i+1,nums,res+nums[i],target-nums[i],dp);
        int sub=ways(i+1,nums,res-nums[i],target+nums[i],dp);
        return add+sub;
    }
}