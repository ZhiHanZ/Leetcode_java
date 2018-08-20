class Solution {
    public boolean judgeCircle(String moves) {
        int[] can = new int[26];
        for(char c: moves.toCharArray())
            can[c-'A']++;
        return (can['R'-'A'] == can['L'-'A']&&can['U'-'A']==can['D'-'A'])? true: false;
    }
}