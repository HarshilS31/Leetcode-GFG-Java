class Solution {
    public char getMaxOccuringChar(String s) {
        char[] arr = s.toCharArray();
        int maxfreq = -1;
        char result = arr[0];
        Arrays.sort(arr);
        int i = 0, j = 0;
        
        while (j < arr.length) {
            if (arr[i] == arr[j]) {
                j++;
            } else {
                int freq = j - i;
                if (freq > maxfreq) {
                    maxfreq = freq;
                    result = arr[i];
                }
                i = j;
            }
        }
        
        int freq = j - i;
        if (freq > maxfreq) {
            maxfreq = freq;
            result = arr[i];
        }
        return result;
    }
}