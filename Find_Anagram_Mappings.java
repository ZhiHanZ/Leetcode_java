class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        Map<Integer, Integer> AnaMap = new HashMap();
        for (int i = 0; i < B.length; i++)
            AnaMap.put(B[i], i);
        int[] ans = new int[A.length];
        for (int j = 0; j < A.length; j++)
            ans[j] = AnaMap.get(A[j]);
        return ans;
    }
}