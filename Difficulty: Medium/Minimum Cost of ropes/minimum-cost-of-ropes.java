class Solution {
    public static int minCost(int[] arr) {
        int cost=0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int ele:arr) heap.add(ele);
        while(heap.size()!=1) {
            int rope1=heap.remove();
            int rope2=heap.remove();
            cost+=rope1+rope2;
            heap.add(rope1+rope2);
        }
        return cost;
        
        
 
    }    
        
}