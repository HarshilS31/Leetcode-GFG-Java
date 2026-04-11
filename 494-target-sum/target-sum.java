class Solution {
    public int findTargetSumWays(int[] nums, int target) {
           
        return ways(0,nums,target);
        
    }
    public int ways(int i ,int[] nums,int target) {
        if(i==nums.length) {
            if(target==0) return 1;//Valid way
            else return 0;
        }
        int add=ways(i+1,nums,target-nums[i]);
        int sub=ways(i+1,nums,target+nums[i]);
        return add+sub;
    }
}