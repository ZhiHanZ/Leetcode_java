class Solution {
    public int projectionArea(int[][] grid) {
        int res = 0;
        int N = grid.length;
        for (int y = 0; y < N; ++y) {
            int max1 = 0;
            int max2 = 0;
            for (int x = 0; x < N; ++x) {
                max1 = Math.max(max1, grid[x][y]);//iteration through x-axis
                max2 = Math.max(max2, grid[y][x]);//iteration through y-axis
                if (grid[x][y] > 0) {
                    ++res;//Z projection area;
                }
            }
            res += max1;
            res += max2;
        }
        
        return res;
    }
}