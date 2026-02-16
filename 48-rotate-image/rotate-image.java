class Solution {
    public void rotate(int[][] arr) {
        
        for(int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            int startcol = 0;
            int endcol = arr[0].length - 1;
            while(startcol < endcol) {
                int temp = arr[i][startcol];
                arr[i][startcol] = arr[i][endcol];
                arr[i][endcol] = temp;
                startcol++;
                endcol--;
            }
        }
    }
}