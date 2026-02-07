class Solution {
    public int mySqrt(int x) {
        int lo=1,hi=x;
        if(x==0) return 0;
        
        while(hi>=lo) {
            int m=lo+(hi-lo)/2;// to prevent integer overflow!
            if(m==(x/m)) return m;


            else if ((m)>(x/m)) hi=m-1;
            else  lo=m+1;
            
            
        }
        return hi;

        
    }
}