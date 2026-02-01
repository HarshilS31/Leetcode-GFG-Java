class Solution {//solved by Harshil!
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;  // Simple increment
                return digits; // Return immediately
            }
            digits[i] = 0; 
        }
        
       
        int[] newArray = new int[n + 1];  // Create new array with size +1
        newArray[0] = 1;                  // Set first digit to 1
        return newArray;
    }
}