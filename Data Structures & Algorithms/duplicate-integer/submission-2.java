class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;

        HashSet<Integer> seen = new HashSet<>();

        for (int i = 0; i < n; i++) {
            // check if current element is there in set
            // and if it's there return true
            if (seen.contains(nums[i])) {
                return true;
            } else {
                seen.add(nums[i]);
            }
        }

        return false;
    }
}