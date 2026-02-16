class Solution {
    public int[][] transpose(int[][] arr) {
        int row=arr.length,col=arr[0].length;
        int [][] newmat=new int[col][row];
        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                newmat[j][i]=arr[i][j];
            }
        }
        return newmat;
       
        


        
    }
}