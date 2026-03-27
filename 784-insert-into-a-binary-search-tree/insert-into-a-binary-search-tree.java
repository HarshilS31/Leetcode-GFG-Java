class Solution {
    public TreeNode insertIntoBST(TreeNode root, int key) {
        if(root==null) {
            TreeNode temp= new TreeNode(key);
            return temp;
        }
        attach(root,key);
        return root;
    }
    void attach(TreeNode root,int key)  {
        if(root==null) return;
        if(root.val==key) return;
        if(root.val<key) {
            if(root.right==null) {
                TreeNode temp= new TreeNode(key);
                root.right=temp;


            }
            else attach(root.right,key);

        }
        else {
            if(root.left==null) {
                TreeNode temp=new TreeNode(key);
                root.left=temp;
            }
            else attach(root.left,key);
        }
        



    }
}