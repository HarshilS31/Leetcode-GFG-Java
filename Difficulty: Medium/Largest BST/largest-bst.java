class Quad {
    int max;
    int min;
    int size;
    boolean isBST;
    Quad(int max,int min,int size,boolean isBST) {
        this.max=max; this.min=min; this.size=size; this.isBST=isBST;
        
    }
    
}
class Solution {

    // Return the size of the largest sub-tree which is also a BST
    static int maxSize;
    static int largestBst(Node root) {
        maxSize=0;
        helper(root);
        return maxSize;
        
        
        
        
    }
    static Quad helper(Node root) {
        if (root==null) return new Quad(Integer.MIN_VALUE,Integer.MAX_VALUE,0,true);
        Quad lst=helper(root.left);
        Quad rst = helper(root.right);
        int max=Math.max(root.data,Math.max(lst.max,rst.max));
        int min=Math.min(root.data,Math.min(lst.min,rst.min));
        boolean isBST=lst.isBST && rst.isBST && (root.data>lst.max) && (root.data<rst.min);
        int size=1+lst.size+rst.size;
        if(isBST) maxSize=Math.max(size,maxSize);
        return new Quad(max,min,size,isBST);
        
        
        
        
    }
}