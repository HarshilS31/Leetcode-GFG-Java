 class Solution {
    static int max;
    public int linearSum(TreeNode root) { 
        if(root==null) return 0;
        int rightLine=linearSum(root.right);
        int leftLine=linearSum(root.left);
        int pathSum=root.val;
        if(leftLine>0) pathSum+=leftLine;      
        if(rightLine>0) pathSum+=rightLine;
        max=Math.max(max,pathSum);
        return root.val+Math.max(rightLine,Math.max(0,leftLine));
    }

    public int maxPathSum(TreeNode root) { 
        max=Integer.MIN_VALUE;
        linearSum(root);
        return max;  
    }
}