class Solution {
    public int kthFactor(int n, int k) {
        for(int i=1;i<3;i++) {
            if (i==k && i==n) return n;
        }
        if(n<=k) return -1;
        ArrayList<Integer> factors = new ArrayList<>();
        for(int i=1;i<=n;i++) {
            if(n%i==0) factors.add(i);
        }
        if(factors.size()<k) return -1;
        else return factors.get(k-1);      
    }
}