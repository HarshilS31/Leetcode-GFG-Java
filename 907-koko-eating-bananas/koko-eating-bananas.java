class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo=1,hi=Integer.MIN_VALUE;
        for(int ele:piles) if (ele>hi) hi=ele;
        int ans=hi;
        while(lo<=hi) {
            int mid=lo+(hi-lo)/2;
            if(canFinish(piles,mid,h)) {
                ans=mid;
                hi=mid-1;
            }
            else lo=mid+1;
        }
        return ans;
    }
    boolean canFinish(int[] piles, int k, int h) {
    long totalHours = 0;
    for (int pile : piles) {
        totalHours += (pile + k - 1) / k;
    }
    return totalHours <= h;
}
}