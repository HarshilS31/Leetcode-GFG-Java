class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int lo=0,hi=arr.length-1;
        for(int i=0;i<=arr.length-1;i++) {
            if(arr[i]>arr[i+1] && arr[i]>arr[i-1] && i!=0) {
               return i;

            }
            


        }
        return -1;
        

       


        }
        



        
    }
