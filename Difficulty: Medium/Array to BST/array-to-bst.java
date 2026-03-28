/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    public Node sortedArrayToBST(int[] arr) {
        int n =arr.length-1;
        return  ArrToBST(arr,0,n);
    }
    public static Node ArrToBST(int [] arr,int lo,int hi) {
        if(lo>hi) return null;
        int m= lo+(hi-lo)/2;
        Node root= new Node(arr[m]);
        root.left=ArrToBST(arr,lo,m-1);
        root.right=ArrToBST(arr,m+1 ,hi);
        return root;
        
        
        
        
    }
}
