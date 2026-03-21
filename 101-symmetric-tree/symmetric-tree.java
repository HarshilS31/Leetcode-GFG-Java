/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        reverse(root.left);//reverse either one subtree to compare!
        if(root==null) return true;
        
        return isSameTree(root.left,root.right);       
    }
     public static void reverse(TreeNode root) {
        TreeNode temp= new TreeNode();
        if (root==null) return;
        temp=root.left;
        root.left=root.right;
        root.right=temp;
        reverse(root.left); reverse(root.right);


    }
    public boolean isSameTree(TreeNode p,TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;;
        if(p.val!=q.val) return false;
        return(isSameTree(q.right,p.right) && isSameTree(q.left,p.left));
    }
}