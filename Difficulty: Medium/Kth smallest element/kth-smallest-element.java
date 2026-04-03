class Solution {
    public static int kthSmallest(int arr[], int k) {
        PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:arr) {
            heap.add(ele);
            if(heap.size()>k) heap.remove();
            
        }
        return heap.peek();
       
        
    }
}
