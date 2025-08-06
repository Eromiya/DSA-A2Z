package com.striver.a2z.contest.jul19;

public class Q2CountIslandswithTotalValueDivbyK {
    static int rows, cols;
    static boolean[][] visited;

    public int countIslands(int[][] grid, int k) {
        rows = grid.length;
        cols = grid[0].length;
        visited = new boolean[rows][cols];
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] != 0 && !visited[i][j]) {
                    int[] sum = new int[1]; // to accumulate sum via DFS
                    dfs(grid, i, j, sum);
                    if (sum[0] % k == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private static void dfs(int[][] grid, int r, int c, int[] sum) {
        if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == 0 || visited[r][c]) {
            return;
        }

        visited[r][c] = true;
        sum[0] += grid[r][c];

        // Explore 4 directions
        dfs(grid, r + 1, c, sum);
        dfs(grid, r - 1, c, sum);
        dfs(grid, r, c + 1, sum);
        dfs(grid, r, c - 1, sum);
    }
}
