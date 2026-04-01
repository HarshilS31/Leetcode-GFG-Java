class Pair{
    Node node;
    int dist;
    Pair(Node node,int dist) {
        this.node=node;
        this.dist=dist;
    }
    
}

class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map= new HashMap<>();//HashMap<Horizontal Distance,Data>
        Queue<Pair> q= new LinkedList<>();
        q.add(new Pair(root,0));
        int minDist=Integer.MAX_VALUE;
        int maxDist=Integer.MIN_VALUE;
        
        while(q.size()>0) {
            Pair front =q.remove();
            Node node =front.node;
            int level=front.dist;
            minDist=Math.min(level,minDist);
            maxDist=Math.max(level,maxDist); 
            map.put(level,node.data);
            if(node.left!=null) q.add(new Pair(node.left,level-1));
            if(node.right!=null) q.add(new Pair(node.right,level+1));
   
        }
        for(int i=minDist;i<=maxDist;i++) {
            ans.add(map.get(i));
            
        }
        return ans;
       
        
    }
}