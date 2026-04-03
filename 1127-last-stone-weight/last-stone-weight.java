class Solution {
    public int lastStoneWeight(int[] arr) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:arr) heap.add(ele);
        while(heap.size()>1) {
            int stone1=heap.remove();
            int stone2=heap.remove();
            heap.add(Math.abs(stone1-stone2));

        }
        return heap.peek();  
    }
}