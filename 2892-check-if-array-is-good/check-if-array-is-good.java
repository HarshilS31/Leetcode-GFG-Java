class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        
        int n=nums.length;
        if(n<=1) return false;
        if(nums[n-1]!=nums[n-2] || n!=nums[n-1]+1) return false;
        if(nums[0]==nums[n-1] && n>2) return false;
        for(int i=n-3;i>=1;i--){
            if(nums[i]==nums[i-1]) return false;
        }
        return true;

        
        

    }
}