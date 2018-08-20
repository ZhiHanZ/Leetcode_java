import java.util.*;

//Brute force
class Solution {
    public int numJewelsInStones(String J, String S) {
        int ans = 0;
        for (char s: S.toCharArray()) // For each stone...
            for (char j: J.toCharArray()) // For each jewel...
                if (j == s) {  // If the stone is a jewel...
                    ans++;
                    break; // Stop searching whether this stone 's' is a jewel
                }
        return ans;
    }
}
//HashSet
class Solution_2 {
    public int numJewelsInStones(String J, String S) {
        int ans = 0;
        Set<Character> JSet = new HashSet();
        for (char j: J.toCharArray())
            JSet.add(j);
        for (char s: S.toCharArray())
            if (JSet.contains(s))
                ans++;
        return ans;
    }
}