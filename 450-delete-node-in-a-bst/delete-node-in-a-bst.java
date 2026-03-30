class Solution {
    public TreeNode deleteNode(TreeNode root, int target) {
        return deleteTreeNode(root, target);
    }

    TreeNode deleteTreeNode(TreeNode root, int target) {
        if (root == null) return null;
        
        if (root.val > target) {
            root.left = deleteTreeNode(root.left, target);
        } else if (root.val < target) {
            root.right = deleteTreeNode(root.right, target);
        } else {
            // No children
            if (root.left == null && root.right == null) {
                return null;
            }
            // One child
            else if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            // Two children
            else {
                TreeNode pred = root.left;
                while (pred.right != null) pred = pred.right;
                root.val = pred.val;
                root.left = deleteTreeNode(root.left, pred.val);
                return root;
            }
        }
        return root;
    }
}
