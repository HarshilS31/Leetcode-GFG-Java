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
    public int diameterOfBinaryTree(TreeNode root) {
        if (root==null) return 0;
        int d1=levels(root.left)+levels(root.right);
        int d2=diameterOfBinaryTree(root.left);
        int d3 = diameterOfBinaryTree(root.right);
        return Math.max(d1,(Math.max(d2,d3)));

        
    
        
    }
    public static int levels(TreeNode root) {
        return (root==null) ? 0:1+Math.max(levels(root.right),levels(root.left));
    }
}