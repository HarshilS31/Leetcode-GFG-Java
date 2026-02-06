class Solution {
    public int binarysearch(int[] arr, int k) {
        int lo=0,hi=arr.length-1,index=-1;
        while(hi>=lo) {
            int m=(lo+hi)/2;
            if(k>arr[m]) lo=m+1;
            else if(k<arr[m]) hi=m-1;
            else{//arr[m]==k
               
                index=m;
                hi=m-1;
                
            
            
            }
            
        }
        return index;
 
        
        
    }
}