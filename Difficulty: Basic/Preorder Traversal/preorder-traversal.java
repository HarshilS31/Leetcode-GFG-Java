/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> a = new ArrayList<>();
        dfs(a,root);
        return a;
    }
    public void dfs(ArrayList<Integer> a,Node root) {
        if(root==null) return;
        a.add(root.data);
        dfs(a,root.left);
        dfs(a,root.right);
         
    }
    
}