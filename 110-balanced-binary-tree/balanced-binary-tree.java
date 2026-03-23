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
    public boolean isBalanced(TreeNode root) { 
        if (root==null) return true;
        int leftlevels=levels(root.left);
        int rightlevels=levels(root.right);
        if(Math.abs(leftlevels-rightlevels)>1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public static int levels(TreeNode root){
        return (root==null) ? 0:1+Math.max(levels(root.right),levels(root.left));


    }

}
