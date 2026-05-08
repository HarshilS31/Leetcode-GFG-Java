class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1) return nums[0];
        int lo=0;
        int hi=nums.length-1;
        while(hi>=lo){
            int mid=lo+(hi-lo)/2;
            if (mid == 0 && nums[mid] != nums[mid + 1]) return nums[mid];
            if (mid == nums.length - 1 && nums[mid] != nums[mid - 1]) return nums[mid];
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1] && mid>0 && mid<nums.length-1) return nums[mid];
            int first=mid;
            int second=mid;
            if(nums[mid-1]==nums[mid]) first=mid-1;
            else second=mid+1;
            int leftCount=first-lo;
            int rightCount=hi-second;
            if(leftCount%2==0) lo=second+1;
            else hi=first-1;
        }
        return -1;

        
    }
}