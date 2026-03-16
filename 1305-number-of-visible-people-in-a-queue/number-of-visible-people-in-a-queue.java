class Solution {
    public int[] canSeePersonsCount(int[] arr) {
        int n=arr.length;
        Stack<Integer> s= new Stack<>();
        s.push(arr[n-1]);
        int [] ans = new int[n];
        ans[n-1]=0;
        for(int i=n-2;i>=0;i--) {
            int count=0;
            while(s.size()>0 && s.peek()<=arr[i]) {
                count++;
                s.pop();    
            }
            if(s.size()>0) count++;//most Important!
            ans[i]=count;
            s.push(arr[i]);
        }
        return ans;


        
    }
}