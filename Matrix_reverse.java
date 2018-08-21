class Solution {
    public int[][] transpose(int[][] A) {
        int R = A.length;
        int C = A[0].length;
        int[][] AC = new int[C][R];
        for (int i = 0; i < R; i++)
        {
            for(int j = 0; j < C; j++)
                AC[j][i] = A[i][j];
        }
        return AC;
    }
}