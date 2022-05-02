class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int size = nums.length;
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        int i = 1; // [1 ; size]
        for (int j = 0; i <= size && j < size;) {
            // 1
            if (i == nums[j]) {
                i++;
                j++;
            }
            
            // 2 
            else if (i > nums[j]) {
                j++;
            }
            
            // 3
            else if (i < nums[j]) {
                res.add(i);
                i++;
            }
        }
        // 1 2 3 3 3 3 3
        // 1 2 3 4 5 6 7
        while (i <= size) { 
            res.add(i);
            i++;
        }
        return res;
    }
}
