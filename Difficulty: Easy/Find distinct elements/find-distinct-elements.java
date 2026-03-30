// User function Template for Java
class Solution {
    static int distinct(int arr[]) {
        HashSet<Integer> temp = new HashSet<>();
        for(int i=0;i<arr.length;i++) {
            temp.add(arr[i]);
            
        }
        return temp.size();
        
        
    }
}