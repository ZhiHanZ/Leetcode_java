class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++)
        {
             if(isSD(i))
                 ans.add(i);
        }
        return ans;
           
        
    }
    public boolean isSD(int i)
    {
        if (i <= 9)
            return true;
        int d = i;
        while (d > 0)
        {
            int m = d%10;
            if (m==0||i%m!=0)
                return false;
            d=d/10;
        }
        return true;
    }
}