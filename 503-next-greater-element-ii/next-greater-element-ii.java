class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> temp= new Stack<>();
        for(int i=2*nums.length-1;i>=0;i--) {
            int idx=i%nums.length;
            while(temp.size()>0 && temp.peek()<=nums[idx]) temp.pop();
            if(i<nums.length) {
                ans[idx]=temp.size()==0 ? -1:temp.peek();
            }
            temp.push(nums[idx]);
        }
        return ans;  
    }
}