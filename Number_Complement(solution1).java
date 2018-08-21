class Solution {
    public int findComplement(int num) {
        int ans = 0;
        int pow = 0;
        while (num != 0)
        {
            int d = (num%2)^1;
            ans += d*Math.pow(2,pow);
            pow+=1;
            num/=2;
        }
        return ans;
    }
}