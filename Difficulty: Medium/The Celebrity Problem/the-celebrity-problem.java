class Solution {
    public int celebrity(int arr[][]) {
                int n =arr.length;
        Stack<Integer> s= new Stack<>();
        for (int i=0;i<n;i++) s.push(i);
        while(s.size()>1) {
            int a=s.pop();
            int b=s.pop();
            boolean aflag=true,bflag=true;
            if(arr[a][b]==1) {//if a knows b,therefore a is not a celebrity
            aflag=false;
           
            }
            else{//a deosnt know b,therefore b is not a celebrity!
            bflag=false;
            
            }
            if(arr[b][a]==1) {///if b knows a,therefore b is not a celebrity!
            bflag=false;
                
            }
            else {//b doesnt know a,therefore a is not a celebrity!
            aflag=false;
                
            }
            if(aflag) s.push(a);
            if(bflag) s.push(b);

        }
        if(s.size()==0) return -1;
        int ele=s.pop();
        for(int j=0;j<n;j++) {
            if(j==ele) continue;
            if (arr[ele][j]==1) return -1;
            
        }
        for(int i=0;i<n;i++) {
            if(i==ele) continue;
            if (arr[i][ele]==0) return -1;
        }
        return ele;
        

    }

}
