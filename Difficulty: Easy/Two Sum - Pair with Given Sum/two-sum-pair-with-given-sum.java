class Solution {
    boolean twoSum(int arr[], int target) {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int rem=target-arr[i];
            if (set.contains(rem)) return true;
            else set.add(arr[i]);
            
        }
        return false;
        
        
    }
}