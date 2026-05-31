class Solution {
    public boolean asteroidsDestroyed(int mass, int[] arr) {
        Arrays.sort(arr);
        long aMass=mass;
        for(int a:arr) {
            if(aMass>=a) aMass+=a;
            else return false;
        }
        return true;
        
    }
}