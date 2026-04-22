class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            for (int k = 0; k < dictionary.length; k++) {
                int diff = 0;
                for (int j = 0; j < queries[i].length(); j++) {
                    if (queries[i].charAt(j) != dictionary[k].charAt(j)) diff++;
                }
                if (diff <= 2) {
                    ans.add(queries[i]);
                    break;
                }
            }
        }
        return ans;
    }
}