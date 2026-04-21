class Solution {
    int[] parent;

    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int n = source.length;
        parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
        for (int[] swap : allowedSwaps)
            union(swap[0], swap[1]);
        Map<Integer, Map<Integer, Integer>> comp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int root = find(i);
            comp.computeIfAbsent(root, k -> new HashMap<>())
                .merge(source[i], 1, Integer::sum);
        }
        int hamming = 0;
        for (int i = 0; i < n; i++) {
            int root = find(i);
            int remaining = comp.get(root).merge(target[i], -1, Integer::sum);
            if (remaining < 0) hamming++;
        }

        return hamming;
    }

    int find(int x) {
        if (parent[x] != x) parent[x] = find(parent[x]);
        return parent[x];
    }

    void union(int a, int b) {
        parent[find(a)] = find(b);
    }
}