class Solution {
    public boolean judgeCircle(String moves) {
        int i = 0;
        int j = 0;
        for (char move: moves.toCharArray())
        {
            if(move == 'R')
                --i;
            if(move == 'L')
                ++i;
            if(move == 'U')
                --j;
            if (move == 'D')
                ++j;
        }
        return (i == 0 && j == 0)? true: false;
        
    }
}