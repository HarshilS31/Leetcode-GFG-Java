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
    static int ans;
    public int findBottomLeftValue(TreeNode root) {
        bfs(root,0);
        return ans;
   
    }
    public void bfs(TreeNode root,int currLevel) {
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while(q.size() > 0) {
        int size = q.size();  
        for(int i = 0; i < size; i++) {
            TreeNode front = q.remove();
            if(i == 0) ans = front.val; 
            if(front.left != null) q.add(front.left);
            if(front.right != null) q.add(front.right);
    }
    currLevel++;
}

 
        
    }

}