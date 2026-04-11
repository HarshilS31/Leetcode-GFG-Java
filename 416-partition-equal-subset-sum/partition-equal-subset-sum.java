class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int ele:nums) sum+=ele;
        if(sum%2==1) return false;
        int target=sum/2;
        int[][] dp = new int[nums.length][target+1];
        for(int i =0;i<dp.length;i++) {
            for(int j=0;j<target+1;j++){
                dp[i][j]=-1;
            }
        }
        return subset(0,nums,target,dp);   
    }
    public boolean subset(int i,int[]nums,int target,int[][] dp) {
        if(i==nums.length) {
            if(target==0) return true;
            else return false;

        }
        if (dp[i][target]!=-1) return dp[i][target]==1;
        boolean ans=false;
        boolean skip = subset(i+1,nums,target,dp);
        if(target-nums[i]<0) ans=skip;
        else {
            boolean pick=subset(i+1,nums,target-nums[i],dp);
            ans=pick || skip;
        }
        dp[i][target]=(ans) ? 1:0;
        return ans;
    }
}