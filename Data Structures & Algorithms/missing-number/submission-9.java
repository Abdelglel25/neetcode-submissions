class Solution {
    public int missingNumber(int[] nums) {
        // solution 4 - better
        int n = nums.length;
        int res = (n * (n + 1)) / 2;

        for (int num : nums) {
            res -= num;
        }

        return res;
    }
}
