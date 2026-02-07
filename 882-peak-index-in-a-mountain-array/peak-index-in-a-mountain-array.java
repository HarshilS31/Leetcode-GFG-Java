class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int lo=1,hi=arr.length-2;
        while(hi>=lo) {
            int m=(hi+lo)/2;
            if(arr[m]>arr[m+1] && arr[m]>arr[m-1]) return m;
            else if(arr[m]>arr[m-1] && arr[m]<arr[m+1]) lo=m+1;
            else hi=m-1;

        }
        return -1;

       
        

       


        }
        



        
    }
