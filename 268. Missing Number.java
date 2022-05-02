class Solution {
    public int missingNumber(int[] nums) {
        int res = nums[0], size = nums.length;
        for (int i = 1; i < size; i++) {
            res ^= nums[i];
        }
        for (int i = 0; i <= size; i++) {
            res ^= i;
        }
        // 3 ^ 0 ^ 1
        // 3 ^ 0 ^ 1 ^ 0 ^ 1 ^ 2 ^ 3 = 2
        return res;
    }
}
