class Solution {
    
    static List<Integer> firstNegInt(int arr[], int k) {
        int n=arr.length;
        List<Integer> l= new ArrayList<>();
        Queue<Integer> q= new LinkedList<>();
        for(int i=0;i<n;i++)  {
            if(arr[i]<0) q.add(i);
            
        }
        for(int i=0;i<n-k+1;i++) {
            while(q.size()>0 && q.peek()<i) q.remove();
            if (q.size()>0 && q.peek()<=i+k-1) l.add(arr[q.peek()] );
            else l.add(0);
            
        }
        return l;
        
        
          
        
        
    }
}