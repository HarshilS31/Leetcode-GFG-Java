class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        
        // Calculate sum of all elements
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        
        // Calculate F(0)
        int f = 0;
        for (int i = 0; i < n; i++) {
            f += i * nums[i];
        }
        
        // Find max using the recurrence relation
        int maxVal = f;
        for (int k = 1; k < n; k++) {
            // F(k) = F(k-1) + sum - n * nums[n-k]
            // Or using our derived formula: F(k) = F(k-1) + n * nums[k-1] - sum
            f = f + n * nums[k - 1] - sum;
            maxVal = Math.max(maxVal, f);
        }
        
        return maxVal;
    }
}