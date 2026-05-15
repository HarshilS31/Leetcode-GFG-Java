class Solution {
    public void nextPermutation(int[] nums) {
        int pivot=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--) {
            if(nums[i]<nums[i+1]) {
                pivot=i;
                break;
            }
           
        }
        if(pivot!=-1) {
            int idx=n-1;
            while(nums[pivot]>=nums[idx]) idx--;

        
        int temp=nums[idx];
        nums[idx]=nums[pivot];
        nums[pivot]=temp;  
        }
        int left=pivot+1;
        int right=n-1;
        while(left<right) {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;

        }

    }
    
}