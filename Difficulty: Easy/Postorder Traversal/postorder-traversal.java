/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack <Node> temp= new Stack<>();
        temp.push(root);
        while(temp.size()>0) {
            Node curr=temp.pop();
            ans.add(curr.data);
            if(curr.left!=null) temp.push(curr.left);
            if(curr.right!=null) temp.push(curr.right);
            
        }
       Collections.reverse(ans);
       return ans;
       
        
        
        
        
    }
}