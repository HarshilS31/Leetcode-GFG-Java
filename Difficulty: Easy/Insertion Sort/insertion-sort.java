class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        int n =arr.length;
        for (int i =0;i<n;i++) {
            int min=Integer.MAX_VALUE;
            int minindex=0;
            for(int j=i;j<n;j++) {
                if (min>arr[j]) {
                    min=arr[j];
                    minindex=j;
                    
                }
            }
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
            
            
            
        }
        
        
    }
}