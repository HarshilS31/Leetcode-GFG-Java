/*
class Node {
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    static int s;
    public boolean isHeap(Node root) { 
        s = size(root);
        return isCBT(root,1) && isMaxHeap(root);
            
        
     

    
    }
    public int size(Node root) {
        return (root==null) ?0:1 +size(root.left)+size(root.right);
        
    }
    public boolean isMaxHeap(Node root) {
        if (root==null) return true;
        int left=(root.left!=null) ? root.left.data :Integer.MIN_VALUE;
        int right=(root.right!=null) ? root.right.data:Integer.MIN_VALUE;
        if(root.data<=left || root.data<=right) return false;
        return isMaxHeap(root.left) && isMaxHeap(root.right);
   
    }
    public boolean isCBT(Node root,int idx) {
        if(root==null) return true;
        if (idx>s) return false;
        return isCBT(root.left,2*idx) && isCBT(root.right,2*idx+1); 
    }
}