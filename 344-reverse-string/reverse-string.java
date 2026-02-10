class Solution {
    public void reverseString(char[] arr) {
        int i=0,j=arr.length-1;
        char temp;
        while(j>i) {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
         
        
    }
}