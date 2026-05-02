class Solution {
    public int subarraySum(int[] arr, int k) {
        int ans = 0;
        int currSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
    
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (map.containsKey(currSum - k)) {
                ans += map.get(currSum - k);
            }

            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }
    
        return ans;
}    


}