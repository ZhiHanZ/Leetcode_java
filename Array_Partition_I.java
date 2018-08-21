class Solution {
    public int arrayPairSum(int[] nums) {
        //sort them all, and all the lowest nnd numbers;
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i+=2)
        {
            sum+=nums[i];
        }
        return sum;
    }
}