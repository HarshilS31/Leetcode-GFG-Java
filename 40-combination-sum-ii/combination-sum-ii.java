class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>>  ans=new ArrayList<>();
        List<Integer> arr= new ArrayList<>();
        Arrays.sort(nums);
        findSubsets(ans,arr,nums,target,0);
        return ans;
  
    }
    void findSubsets(List<List<Integer>> ans,List<Integer> arr,int[] nums,int target,int idx) {
        if(target==0) {
            ans.add(new ArrayList<>(arr));
            return;
        }
        if(idx==nums.length || target<0) return;
        if(nums[idx]<=target) {
            arr.add(nums[idx]);
            findSubsets(ans,arr,nums,target-nums[idx],idx+1);
            arr.remove(arr.size()-1);
        }
        while(idx<nums.length-1 && nums[idx]==nums[idx+1]) idx++;
        findSubsets(ans,arr,nums,target,idx+1);
    }
}