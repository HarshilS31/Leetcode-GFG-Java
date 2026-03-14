class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> s =new Stack<>();
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            String s1=arr[i];
            if(s1.equals("C")) s.pop();
            else if(s1.equals("D")) s.push(2*s.peek());
            else if(s1.equals("+")) {
                int top=s.pop();
                int second=s.peek();
                int sumof2=top+second;
                s.push(top);
                s.push(sumof2); 
            }
            else s.push(Integer.parseInt(s1));

        }    
        while(s.size()>0) {
            sum+=s.pop();
        }
        return sum;   
    }
}