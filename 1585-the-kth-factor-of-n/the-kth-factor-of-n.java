class Solution {
    public int kthFactor(int n, int k) {
        int Kth=0;
        for(int i=1;i<=n;i++) {
            if(n%i==0) Kth++;
            if(Kth==k) return i;
        }
    return -1;
    }
}