class Solution {
    public int minDays(int[] days, int m, int k) {
        int lo=0;
        int ans=-1;
        int hi=Integer.MIN_VALUE;
        for(int day:days) {
            if(day>hi) hi=day;
        }
        while(hi>=lo) {    
            int mid=lo+(hi-lo)/2;
            
            if(canBloom(days,m,k,mid)){
                ans=mid;
                hi=mid-1;
            }
            else lo=mid+1;
        }
        return ans;
    }
    boolean canBloom(int[] days,int m,int k,int day){
        long flowers=m*k;
        if(flowers>days.length) return false;
        int count=0;
        int bouquets=0;
        for(int i=0;i<days.length;i++){
            if(day>=days[i]){
                count++;
                if(count==k){
                    bouquets++;
                    count=0;
                }
            }

            else{
                count=0;
            }
   
        }
        if(bouquets>=m) return true;
        else return false;


    }
}