class Solution {
    public int removeDuplicates(int[] arr) {
        int unique =0;
        for ( int j=0;j<arr.length;j++) {
            if(arr[j]!=arr[unique]) {
                unique++;
                arr[unique]=arr[j];

            
            }
            

        }
        return unique+1;

     

 }
}