class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int MOD = 1000000007;
        int[] prev = new int[n];
        int[] next = new int[n];
        pse(arr, prev);
        nsee(arr, next);
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long left = i - prev[i];
            long right = next[i] - i;
            sum = (sum + (long) arr[i] * left % MOD * right) % MOD;
        }
        return (int) sum;
    }

    void pse(int[] arr, int[] prev) {
        int n=arr.length;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i])
                stack.pop();
            prev[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
    }

    void nsee(int[] arr, int[] next) {
        int n =arr.length;
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i])
                stack.pop();
            next[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
    }
}