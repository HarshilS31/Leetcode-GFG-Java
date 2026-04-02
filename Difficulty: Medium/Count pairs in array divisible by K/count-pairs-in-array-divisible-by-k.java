// User function Template for Java

class Solution {
    public static long countKdivPairs(int arr[], int n, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        long pairs=0;
        for(int ele:arr) {
            int x = ele%k;
            map.put(x,map.getOrDefault(x,0)+1);
        }
        //check for remainder 0;
        long Zcount=map.getOrDefault(0,0);
        pairs+=Zcount*(Zcount-1)/2;
        map.remove(0);


        //check for remainders k/2;
        //only for k-> even
        if(k%2==0 && map.containsKey(k/2)) {
            long halfcount=map.get(k/2);
            pairs+=halfcount*(halfcount-1)/2;
            map.remove(k/2);//Important!
            
        }
        pairs*=2;//Because all of them will be divided by 2 before returning!
        
        
        for(int ele:map.keySet()) {
            int r = k-ele;
            if (map.containsKey(r)) pairs+=map.get(r)*map.get(ele);
            
        }
        pairs/=2;

        return pairs;
        
        
    }
}