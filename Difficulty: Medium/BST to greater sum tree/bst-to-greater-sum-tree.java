/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
} */

class Solution {
    public static void transformTree(Node root) {
        ArrayList<Node> arr= new ArrayList<>();
        inorder(root,arr);
        Collections.reverse(arr);
        int sum=0;
        for(int i=0;i<arr.size();i++) {
            int val=arr.get(i).data;
            arr.get(i).data=sum;
            sum+=val;
            
        }
        
        
        
        
        
        
    }
    public static void inorder(Node root,ArrayList<Node> arr) {
        if(root==null) return;
        inorder(root.left,arr);
        arr.add(root);
        inorder(root.right,arr);
        
        
    }
}