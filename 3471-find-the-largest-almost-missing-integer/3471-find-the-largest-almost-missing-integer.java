class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int maxVal = -1;
        if (k == n) {
            for (int num : nums) {
                maxVal = Math.max(maxVal, num);
            }
            return maxVal;
        }
        if (k == 1) {
            for (int num : nums) {
                if (freq.get(num) == 1) {
                    maxVal = Math.max(maxVal, num);
                }
            }
            return maxVal;
        }
        if (freq.get(nums[0]) == 1) {
            maxVal = Math.max(maxVal, nums[0]);
        }
        if (freq.get(nums[n - 1]) == 1) {
            maxVal = Math.max(maxVal, nums[n - 1]);
        }
        return maxVal;
    }
}