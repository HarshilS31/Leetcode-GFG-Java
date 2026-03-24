// FUNCTION CODE
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

/* Should return minimum distance between a and b
   in a tree with given root*/
class GfG {
    int findDist(Node root, int a, int b) {
        Node ancestor=lca(root,a,b);
        int path1=levels(ancestor,a);
        int path2=levels(ancestor,b);
        return path1+path2;
        
        

        
    }
        Node lca(Node root, int p, int q) {
        if(root==null) return null;
        if(root.data==p || root.data==q) return root;
        Node l=lca(root.left,p,q);
        Node r=lca(root.right,p,q);
        if(l!=null && r!=null) return root;
        return (l==null) ? r:l;
 
    }
    int levels(Node start, int target) {
    if(start == null) return -1;              
    if(start.data == target) return 0;

    int left = levels(start.left, target);
    if(left != -1) return 1 + left;        

    int right = levels(start.right, target);
    if(right != -1) return 1 + right;         
    return -1;                                 
}

    
}