class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }
        // 2 1 2
        // 2 ^ 1 ^ 2 = 1
        return res;
    }
}
