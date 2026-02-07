class Solution {
    public int search(int[] arr, int target) {
        int n = arr.length;
        if (n == 0) return -1;
        if (arr[0] == target) return 0;
        if (arr[n - 1] == target) return n - 1;
        
        int lo = 0, hi = n - 1;
        
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            
            if (arr[mid] == target) return mid;
            
            // Check if left side is sorted
            if (arr[lo] <= arr[mid]) {
                // Left side is sorted
                if (target >= arr[lo] && target < arr[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {
                // Right side is sorted
                if (target > arr[mid] && target <= arr[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        
        return -1;
    }
}