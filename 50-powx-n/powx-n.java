class Solution {
    public double myPow(double x, int n) {
        long n2=n;
        if(n2<0) {
            x=1/x;
            n2=-n2;
        }
        return Pow(x,n2);

    }
    double Pow(double x,long n) {
        if(n==0) return 1.0;
        double half=Pow(x,n/2);
        if(n%2==0) {
            return half*half;

        }
        else {
            return half*half*x;

        }
    }

}