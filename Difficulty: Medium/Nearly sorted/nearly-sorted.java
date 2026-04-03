class Solution {
    public void nearlySorted(int[] arr, int k) {
        PriorityQueue<Integer> heap= new PriorityQueue<>();
        int idx=0;
        for(int ele:arr) {
            heap.add(ele);
            if(heap.size()>k) arr[idx++]=heap.remove();
        }
        //NOW WE MUST EMPTY THE QUEUE AS K ELEMENTS ARE STILL THERE!
        while(heap.size()>0) arr[idx++]=heap.remove();
        
        
        
    }
}
