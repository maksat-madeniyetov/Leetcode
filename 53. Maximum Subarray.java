class Solution {
    
    public int maxSubArray(int[] nums) {
        return maxSubArray(nums, 0, nums.length - 1);
    }
    
    private int maxSubArray(int[] nums, int l, int h) {
        if (l == h) {
            return nums[l];
        }
        int m = l + (h - l) / 2;
        return Math.max(Math.max(maxSubArray(nums, l, m), maxSubArray(nums, m + 1, h)), 
        maxCrossingSum(nums, l, m, h));
    }
    
    private int  maxCrossingSum(int[] nums, int l, int m, int h) {
        int sum = 0, left_sum = Integer.MIN_VALUE;
        for (int i = m; i >= l; i--) {
            sum += nums[i];
            left_sum = Math.max(sum, left_sum);
        }
        sum = 0;
        int right_sum = Integer.MIN_VALUE;
        for (int i = m + 1; i <= h; i++) {
            sum += nums[i];
            right_sum = Math.max(sum, right_sum);
        }
        return Math.max(left_sum + right_sum, Math.max(left_sum, right_sum));
    }
}
