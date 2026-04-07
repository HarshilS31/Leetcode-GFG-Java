class Solution {
    public int countSquares(int[][] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                if(arr[i][j]==0) continue;
                if(i>0 && j>0) arr[i][j]+=min(arr[i-1][j],arr[i][j-1],arr[i-1][j-1]);
                count+=arr[i][j];
            }
        }
        return count;
    }
    public int min(int i1,int i2,int i3) {
        return Math.min(i1,Math.min(i2,i3));
    }
    

}