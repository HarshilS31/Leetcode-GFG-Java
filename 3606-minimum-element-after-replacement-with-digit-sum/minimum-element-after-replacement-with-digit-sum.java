class Solution {
    public int minElement(int[] nums) {
        int minNum=Integer.MAX_VALUE;
        for(int num:nums) {
            int check=SOD(num);
            if(check<minNum) minNum=check;

        }
        return minNum;
        
    }
    public int SOD(int num) {
        int sum=0;
        while(num>0) {
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        return sum;

    }
}