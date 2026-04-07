// User function Template for Java

class Solution {
    // Function to find total number of unique paths.
    public static int NumberOfPath(int a, int b) {
        int [][] arr = new int[a][b];
        for(int i=0;i<a;i++) {
            for(int j=0;j<b;j++) {
                if(i==0 || j==0) arr[i][j]=1;
                else arr[i][j]=arr[i][j-1]+arr[i-1][j];
                
            }
        }
        return arr[a-1][b-1];
        
    }
}