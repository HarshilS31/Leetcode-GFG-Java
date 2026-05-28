class Solution {
    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        int bestWordIdx = -1; 
    }

    public int[] stringIndices(String[] wordsContainer, String[] targetQueries) {
        TrieNode root = new TrieNode();
        int globalDefaultIdx = 0;
        for (int i = 1; i < wordsContainer.length; i++) {
            if (wordsContainer[i].length() < wordsContainer[globalDefaultIdx].length()) {
                globalDefaultIdx = i;
            }
        }
        root.bestWordIdx = globalDefaultIdx;
        for (int i = 0; i < wordsContainer.length; i++) {
            String word = wordsContainer[i];
            TrieNode curr = root;
            for (int j = word.length() - 1; j >= 0; j--) {
                int charIdx = word.charAt(j) - 'a';
                if (curr.children[charIdx] == null) {
                    curr.children[charIdx] = new TrieNode();
                }
                
                curr = curr.children[charIdx];
                if (curr.bestWordIdx == -1) {
                    curr.bestWordIdx = i;
                } else {
                    int existingIdx = curr.bestWordIdx;
                    if (word.length() < wordsContainer[existingIdx].length()) {
                        curr.bestWordIdx = i;
                    }
                }
            }
        }
        int[] ans = new int[targetQueries.length];
        for (int i = 0; i < targetQueries.length; i++) {
            String query = targetQueries[i];
            TrieNode curr = root;
            int lastValidIdx = root.bestWordIdx;
            for (int j = query.length() - 1; j >= 0; j--) {
                int charIdx = query.charAt(j) - 'a';
                if (curr.children[charIdx] == null) {
                    break;
                }
                curr = curr.children[charIdx];
                lastValidIdx = curr.bestWordIdx; 
            }
            
            ans[i] = lastValidIdx;
        }

        return ans;
    }
}