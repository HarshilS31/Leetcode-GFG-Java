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
    static int max;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root==null) return 0;
        max=0;
        levels(root);
        return max;  
    }
    public static int levels(TreeNode root) {
        if(root==null) return 0;
        int leftlvl=levels(root.left);
        int rightlvl=levels(root.right);
        int dia=leftlvl+rightlvl;
        max=Math.max(max,dia);
        return 1+Math.max(leftlvl,rightlvl);


    }
}