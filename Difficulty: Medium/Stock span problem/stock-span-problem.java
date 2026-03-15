class Solution {
    public class Pair{
        int value;
        int idx;
        Pair(int value,int idx) {
            this.value=value;
            this.idx=idx;
        }
    }
    public ArrayList<Integer> calculateSpan(int[] arr) {
        int n =arr.length;
        int [] span= new int [n];
        span[0]=1;
        Stack<Pair> s= new Stack<>();
        s.push(new Pair(arr[0],0));
        for(int i=1;i<n;i++) {
            while( s.size()>0   && arr[i]>=s.peek().value ) s.pop();
            if(s.size()==0) span[i]=i-(-1);
            else span[i]=i-s.peek().idx;
            s.push(new Pair(arr[i],i));
            
        }
        ArrayList <Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++) {
            ans.add(span[i]);
        }
        return ans;
    }
}