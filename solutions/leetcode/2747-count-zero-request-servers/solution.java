class Solution {
    public int in_interval(int i, int x, int[] queries, int n, int[][] logs) {
        int count=0;
        int tmp = queries[i] - x;
        for (int j=0; j<n; j++) {
            if (tmp<logs[j][1] && logs[j][1]<queries[i]) {
                continue;
            }
            count++;
        }
        return count;
    }

    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        int len = queries.length;
        int[] arr = new int[len];
        int[] res = new int[1];

        for (int i=0; i<len; i++) {
        }
        res[0] = in_interval(0, x, queries, n, logs);
        return res;
    }
}