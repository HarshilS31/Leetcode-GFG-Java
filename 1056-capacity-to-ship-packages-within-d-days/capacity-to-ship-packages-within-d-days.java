class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int lo = 0, hi = 0;
        for (int ele : weights) {
            if (ele > lo) lo = ele;
            hi += ele;          
        }
        
        int ans = hi;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (canTransport(weights, days, mid)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }
    
    boolean canTransport(int[] weights, int days, int capacity) {
        int totalDays = 1, current = 0;
        for (int w : weights) {
            if (current + w > capacity) {
                totalDays++;
                current = 0;
            }
            current += w;
        }
        return totalDays <= days;
    }
}