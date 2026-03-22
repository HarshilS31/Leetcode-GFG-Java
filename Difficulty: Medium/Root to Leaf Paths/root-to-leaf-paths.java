

class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(root,arr,ans);
        return ans;
        
        
         

        
    }
    public static void dfs(Node root, ArrayList<Integer> arr,ArrayList<ArrayList<Integer>> ans) {
        if(root==null) return;
        if(root.left==null && root.right==null) {
            arr.add(root.data);
            ArrayList<Integer> list= new ArrayList<>();
            list.addAll(arr);
            ans.add(list);
            arr.remove(arr.size()-1);
            
            
        }
        arr.add(root.data);
        dfs(root.left,arr,ans);
        dfs(root.right,arr,ans);
        arr.remove(arr.size()-1);//BackTracking!
       
        
        
        
    }
}