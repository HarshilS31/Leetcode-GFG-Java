class Solution {
    public int minimumMountainRemovals(int[] arr) {
        int n = arr.length;
        int[] dp1 = new int[n];
        for(int i = 0; i < n; i++) { 
            for(int j = 0; j <= i-1; j++) {
                if(arr[j] < arr[i]) dp1[i] = Math.max(dp1[i], dp1[j]);
            }
            dp1[i] += 1;
        }

        int[] dp2 = new int[n];
        for(int i = n-1; i >= 0; i--) { 
            for(int j = i+1; j <= n-1; j++) {
                if(arr[j] < arr[i]) dp2[i] = Math.max(dp2[i], dp2[j]);
            }
            dp2[i] += 1;
        }

        int max = 0;
        for(int i = 0; i < n; i++) {
            if(dp1[i] > 1 && dp2[i] > 1) {
                int maxLen = dp1[i] + dp2[i] - 1;
                if(maxLen > max) max = maxLen;
            }
        }

        return n - max;    
    }
}