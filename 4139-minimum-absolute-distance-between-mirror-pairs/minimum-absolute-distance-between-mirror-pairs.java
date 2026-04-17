class Solution {
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer, Integer> lastSeen = new HashMap<>();
        int minDist = Integer.MAX_VALUE;
        
        for (int j = 0; j < nums.length; j++) {
            int num = nums[j];
            if (lastSeen.containsKey(num)) {
                minDist = Math.min(minDist, j - lastSeen.get(num));
            }
            int mirror = reverse(num);
            lastSeen.put(mirror, j);
        }
        
        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
    
    private int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }
}