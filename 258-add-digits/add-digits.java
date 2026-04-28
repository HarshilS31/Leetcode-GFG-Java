class Solution {
    public int addDigits(int num) {
        int ans=SOD(num);
        while(ans>9) {
            int newans=SOD(ans);
            ans=newans;

        }
        return ans;
    }
    int SOD(int num) {
        int sum=0;
        while(num>0) {
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        return sum;
    }
}