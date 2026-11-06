class Solution {
    public int in_interval(int i, int x, int[] queries, int n, int[][] logs) {
        int count = 0;
        boolean[] seen = new boolean[n + 1];
        int tmp = queries[i] - x;

        for (int j = 0; j < logs.length; j++) {
            int time = logs[j][1];

            if (time < tmp || time > queries[i]) {
                continue;
            }

            int server = logs[j][0];
            if (!seen[server]) {
                seen[server] = true;
                count++;
            }
        }

        return n - count;
    }

    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        int len = queries.length;
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = in_interval(i, x, queries, n, logs);
        }
        return arr;
    }
}