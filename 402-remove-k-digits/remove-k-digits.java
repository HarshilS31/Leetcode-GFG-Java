class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> temp = new Stack<>();
        for (char digit : num.toCharArray()) {
            while (temp.size() > 0 && k > 0 && digit - '0' < temp.peek() - '0') {
                temp.pop();
                k--;
            }
            temp.push(digit);
        }
        while (k > 0) {
            temp.pop();
            k--;
        }
        if (temp.size() == 0) return "0";
        StringBuilder ans = new StringBuilder();
        while (temp.size() > 0) {
            ans.append(temp.pop());
        }
        ans.reverse();
        int nonZero = 0;
        while (nonZero < ans.length() && ans.charAt(nonZero) == '0') {
            nonZero++;
        }
        return nonZero == ans.length() ? "0" : ans.substring(nonZero);
    }
}