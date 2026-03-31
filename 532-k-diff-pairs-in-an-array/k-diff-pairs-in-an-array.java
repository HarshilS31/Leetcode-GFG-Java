class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> pairs = new HashSet<>();
        
        for (int ele : nums) {
            if (set.contains(ele - k)) pairs.add(ele - k);
            if (set.contains(ele + k)) pairs.add(ele);
            set.add(ele);
        }
        return pairs.size();
    }
}
