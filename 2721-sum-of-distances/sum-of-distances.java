class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];
        Map<Integer, long[]> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int val = nums[i];
            if (map.containsKey(val)) {
                long count = map.get(val)[0];
                long sumOfIndices = map.get(val)[1];
                ans[i] += count * i - sumOfIndices;
            }
            long[] cur = map.getOrDefault(val, new long[]{0, 0});
            map.put(val, new long[]{cur[0]+1, cur[1]+i});
        }
        map.clear();
        for (int i = n - 1; i >= 0; i--) {
            int val = nums[i];
            if (map.containsKey(val)) {
                long count = map.get(val)[0];
                long sumOfIndices = map.get(val)[1];
                ans[i] += sumOfIndices - count * i;
            }
            long[] cur = map.getOrDefault(val, new long[]{0, 0});
            map.put(val, new long[]{cur[0]+1, cur[1]+i});
        }
        return ans;
    }
}
