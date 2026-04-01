class Pair {
    TreeNode node;
    int time;
    Pair(TreeNode node, int time) {
        this.node = node;
        this.time = time;
    }
}

class Solution {
    TreeNode startNode;                          
    HashMap<TreeNode, TreeNode> parent;          

    public int amountOfTime(TreeNode root, int start) {
        parent = new HashMap<>();               
        dfs(root, start);
        Queue<Pair> q = new LinkedList<>();
        HashSet<TreeNode> burned = new HashSet<>();
        burned.add(startNode);
        q.add(new Pair(startNode, 0));
        int maxTime = 0;

        while (q.size() > 0) {
            Pair front = q.remove();
            int time = front.time;
            maxTime = Math.max(maxTime, time);
            TreeNode node = front.node;

            if (node.left != null && !burned.contains(node.left)) {  
                q.add(new Pair(node.left, time + 1));                  
                burned.add(node.left);
            }                                                         

            if (node.right != null && !burned.contains(node.right)) { 
                q.add(new Pair(node.right, time + 1));                 
                burned.add(node.right);
            }

            if (parent.containsKey(node) && !burned.contains(parent.get(node))) {
                q.add(new Pair(parent.get(node), time + 1));          
                burned.add(parent.get(node));
            }
        }
        return maxTime;
    }

    public void dfs(TreeNode root, int start) {  
        if (root == null) return;                
        if (root.val == start) startNode = root;
        if (root.left != null) parent.put(root.left, root);
        if (root.right != null) parent.put(root.right, root);
        dfs(root.left, start);
        dfs(root.right, start);
    }
}