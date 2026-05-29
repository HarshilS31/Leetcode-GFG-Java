class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() == k) return "0";
        StringBuilder stack = new StringBuilder();
        for (char digit : num.toCharArray()) {
            while (k > 0 && stack.length() > 0 && stack.charAt(stack.length() - 1) > digit) {
                stack.deleteCharAt(stack.length() - 1);
                k--;
            }
            stack.append(digit);
        }
        while (k > 0 && stack.length() > 0) {
            stack.deleteCharAt(stack.length() - 1);
            k--;
        }
        int nonZero = 0;
        while (nonZero < stack.length() && stack.charAt(nonZero) == '0') {
            nonZero++;
        }
        String result = stack.substring(nonZero);
        return result.isEmpty() ? "0" : result;
    }
}