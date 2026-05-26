import java.util.Stack;

class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long totalSum = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || nums[stack.peek()] < nums[i])) {
                int mid = stack.pop();
                int leftBound = stack.isEmpty() ? -1 : stack.peek();
                int rightBound = i; 
                long count = (long) (mid - leftBound) * (rightBound - mid);
                totalSum += count * nums[mid];
            }
            stack.push(i);
        }
        stack.clear();
        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || nums[stack.peek()] > nums[i])) {
                int mid = stack.pop();
                int leftBound = stack.isEmpty() ? -1 : stack.peek();
                int rightBound = i;
                
                long count = (long) (mid - leftBound) * (rightBound - mid);
                totalSum -= count * nums[mid];
            }
            stack.push(i);
        }
        
        return totalSum;
    }
}