class Solution {
    public int minCostToMoveChips(int[] arr) {
        int n = arr.length;
        int e=0,o=0;
        for(int ele:arr) {
            if(ele%2==0) e+=1;
            else o+=1;
            
        }
        return Math.min(e,o);        
    }
 
}