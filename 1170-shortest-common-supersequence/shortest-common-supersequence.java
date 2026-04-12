class Solution {
    public String shortestCommonSupersequence(String a, String b) {
        String lcs = LCS(a, b);
        int i = 0, j = 0, k = 0;
        StringBuilder scs = new StringBuilder();
        while (i < a.length() && j < b.length() && k < lcs.length()) {
            while (i < a.length() && a.charAt(i) != lcs.charAt(k)) scs.append(a.charAt(i++));
            while (j < b.length() && b.charAt(j) != lcs.charAt(k)) scs.append(b.charAt(j++));
            scs.append(lcs.charAt(k));
            i++;
            j++;
            k++;
        }
        while (i < a.length()) scs.append(a.charAt(i++));
        while (j < b.length()) scs.append(b.charAt(j++));  
        return scs.toString();
    }
    
    public String LCS(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }

        StringBuilder lcsBuilder = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                lcsBuilder.append(str1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        
        return lcsBuilder.reverse().toString();
    }
}