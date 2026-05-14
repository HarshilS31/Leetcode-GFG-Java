class Solution {
    long MOD=1000000007;
    public int countGoodNumbers(long n) {
        long even =(n+1)/2;
        long odd=n/2;
        long first=Power(5,even);
        long second=Power(4,odd);
        return (int)((first*second)%MOD);

    }
    long Power(long x,long y) {
        if(y==0) return 1;
        long res=Power(x,y/2);
        res=(res*res)%MOD;
        if(y%2!=0) res=(res*x)%MOD;
        return res;
    }
}