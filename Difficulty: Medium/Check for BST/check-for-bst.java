class Pair {
    int max;
    int min;
    Pair(int max,int min) {
        this.max=max;
        this.min=min;
        
    }
}

class Solution {
    static boolean flag;
    public boolean isBST(Node root) {
        flag=true;
        maxMin(root);
        return flag;
        
        
    }
    Pair maxMin(Node root) {
        if(root==null)  return new Pair(Integer.MIN_VALUE,Integer.MAX_VALUE);
        Pair lst=maxMin(root.left);
        Pair rst=maxMin(root.right);
        int max=Math.max(root.data,Math.max(lst.max,rst.max));
        int min=Math.min(root.data,Math.min(lst.min,rst.min));
        if(lst.max>=root.data || rst.min<=root.data) flag=false;
        return new Pair(max,min);
        
        
        
        
         
    }
}