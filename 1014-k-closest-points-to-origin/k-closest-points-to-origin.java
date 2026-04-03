class Solution {
    public int[][] kClosest(int[][] arr, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((x,y)->((y[0]*y[0]+y[1]*y[1])-(x[0]*x[0]+x[1]*x[1])));
        for(int[] point: arr) {
            heap.add(point);
            if(heap.size()>k)
                heap.remove();
        }
        int[][] ans = new int[k][2];
        int i=0;
        while(!heap.isEmpty()) {
            ans[i++] = heap.poll();
        }
        return ans;
    }
}