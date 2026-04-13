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
        int[] dia = new int[1];
        levels(root,dia);
        return dia[0];

    }
    public int levels(TreeNode root,int[] dia) {
        if(root==null) return 0;
        int left=levels(root.left,dia);
        int right=levels(root.right,dia);
        int path=left+right;
        dia[0]=Math.max(dia[0],path);
        return 1+Math.max(left,right);
    }
}