class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int lo=1;
        int hi=0;
        for(int ele:nums) hi=Math.max(ele,hi);
        int ans=hi;
        while(hi>=lo) {
            int mid=lo+(hi-lo)/2;
            if(canDivide(nums,threshold,mid)) {
                ans=mid;
                hi=mid-1;

            }
            else  lo=mid+1;
            
        }
        return ans;

        }
        boolean canDivide(int[] nums,int threshold,int val) {
            int res=0;
            for(int ele:nums){
                res+=(ele+val-1)/val;
            }
            return res<=threshold;
        

        
    }
}