class Solution {
    static int [] dp;
    public int fibo(int n) {
        if (n<=1) return n;
        if(dp[n]!=0) return dp[n];
        int ans=fibo(n-2)+fibo(n-1);
        dp[n]=ans; 
        return ans;
        
    }
    public int fib(int n) {
        dp= new int[n+1];
        return fibo(n);


        
    }
}