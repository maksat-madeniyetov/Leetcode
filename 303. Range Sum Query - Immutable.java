class NumArray {
    
    private int[] arr;

    public NumArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        arr = nums;
        // time O(n) 
    }
    
    public int sumRange(int left, int right) {
        // time O(1)
        if (left == 0) {
            // to avoid -1 index
            return arr[right];
        }
        return arr[right] - arr[left - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
