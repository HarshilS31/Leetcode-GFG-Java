class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int counter = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (counter > 0) ans.append(c);
                counter++;
            } else {
                counter--;
                if (counter > 0) ans.append(c);
            }
        }
        return ans.toString();
    }
}