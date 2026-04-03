class Pair{
    int num;
    int diff;
    Pair(int num,int diff) {
        this.num=num;
        this.diff=diff;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a, b) -> {
    if (b.diff != a.diff) return b.diff - a.diff;
    return b.num - a.num; 
});
        List<Integer> ans = new ArrayList<>();
        
        for(int ele:arr) {
            maxHeap.add(new Pair(ele,Math.abs(ele-x)));
            if(maxHeap.size()>k) maxHeap.remove();
        }
        while(maxHeap.size()>0) {
            Pair p=maxHeap.remove();

            ans.add(p.num);

        }
        Collections.sort(ans);
        return ans;

   
    }
}