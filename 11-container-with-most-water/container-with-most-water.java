class Solution {
    public int maxArea(int[] arr) {
    
        int area=0;
        int n =arr.length;
        int i=0,j=n-1;
        while(i<j) {
            int currH=Math.min(arr[i],arr[j]);
            int currArea=currH*(j-i);
            area=Math.max(currArea,area);
            if(arr[i]<arr[j]) i++;
            else j--;
            
        }
        return area;


        
    }
}