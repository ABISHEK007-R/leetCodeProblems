class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int hash[] = new int[nums.length + 1];
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;
        }
        for (int i = 1; i < hash.length; i++) {
            if (hash[i] == 0) {
                ans.add(i);
            }
        }
        return ans;
    }
}