// User function Template for Java
class Solution {
    int countPairs(int[] arr, int k) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int ele:arr) {
           if(!map.containsKey(ele)) map.put(ele,1);
           else map.put(ele,map.get(ele)+1);
   
        }
        int pairs=0;
        for(int ele:map.keySet()) { 
            int rem1=ele-k;
            int rem2=ele+k;
            
            if(map.containsKey(rem1)) pairs+=map.get(rem1)*map.get(ele);
            if(map.containsKey(rem2)) pairs+=map.get(rem2)*map.get(ele);
        }
        pairs/=2; //IMPORTANT!!
        return pairs;
        

        
    }
}