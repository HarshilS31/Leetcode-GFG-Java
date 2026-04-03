
class Solution {
    static int i,j;
    public static void convertToMaxHeapUtil(Node root) {
        
        int len=size(root);
        i=0;
        j=0;
        int[] arr = new int[len];
        inOrder(root,arr);
         postOrder(root,arr);
        
        

   }
   static int size(Node root) {
       return (root==null) ? 0:1+size(root.left)+size(root.right);
       
   }
   static void inOrder(Node root,int[] arr) {
       if (root==null) return;
       inOrder(root.left,arr);
       arr[i++]=root.data;
       inOrder(root.right,arr);
  
   }
   static void postOrder(Node root,int[] arr) {
       if(root==null) return;
       postOrder(root.left,arr);
       postOrder(root.right,arr);
       root.data=arr[j++];

   }
  
   

     
}