class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int MaxDist=1;
        for(int i=0;i<n;i++) {
            int dist=0;
            for(int j=i+1;j<n;j++) {
                if(colors[i]!=colors[j]) dist=Math.abs(j-i);
                MaxDist=Math.max(dist,MaxDist);
            }
            
        }
        return MaxDist;  
    }
}