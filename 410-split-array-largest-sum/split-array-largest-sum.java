class Solution {
    public int splitArray(int[] nums, int k) {
        int lo=Integer.MIN_VALUE;
        int hi=0;
        for(int n:nums) {
            if(n>lo) lo=n;
            hi+=n;
        }
        while(hi>=lo){
            int mid=lo+(hi-lo)/2;
            if(canSplit(nums,k,mid)>k) lo=mid+1;
            else hi=mid-1;
        }
        return lo;    
    }
    int canSplit(int[] nums,int k,int sum) {
        int curr=0;
        int count=1;
        for(int n:nums) {
            if(n+curr>sum) {
                count++;
                curr=n;
            }
            else {
                curr+=n;
            }
        }
        return count;
    }
}