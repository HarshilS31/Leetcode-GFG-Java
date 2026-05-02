class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean[] row=new boolean[n];
        boolean[] col=new boolean[m];

        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                if (matrix[i][j]==0) {
                    row[i]=true;
                    col[j]=true;
                }
                
            }
        }
         for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                if (row[i] == true || col[j]==true) matrix[i][j]=0;
            }
        }
    }
            
}