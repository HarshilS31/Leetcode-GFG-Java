import java.util.HashMap;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair> {
    int ele;
    int freq;
    Pair(int ele, int freq) {
        this.ele = ele;
        this.freq = freq;
    }
    public int compareTo(Pair p) {
        if(this.freq == p.freq) 
            return this.ele - p.ele;
        else 
            return this.freq - p.freq;
    }
}

class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        
        PriorityQueue<Pair> heap = new PriorityQueue<>(); // MinHeap
        for(int ele : map.keySet()) {
            heap.add(new Pair(ele, map.get(ele))); // Fixed constructor call
            if(heap.size() > k) 
                heap.remove();
        }
        
        int[] ans = new int[k];
        int idx = k - 1; // To maintain order if needed
        while(heap.size() > 0) {
            Pair top = heap.remove();
            ans[idx--] = top.ele;
        }
        return ans;
    }
}