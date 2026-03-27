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

    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> arr= new ArrayList<>();
        attach(root,arr);
        for (int i = 0; i < arr.size() - 1; i++) {
        if (arr.get(i) >= arr.get(i + 1)) {
            return false;
        }
    }
        return true;




    }
    public static void attach(TreeNode root,ArrayList<Integer> arr) {
        if(root==null) return;
        attach(root.left,arr);
        arr.add(root.val);
        attach(root.right,arr);
    }
}