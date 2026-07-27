class Solution {
    public int missingNumber(int[] nums) {
        // Solution 3
        // we loop over the nums and do xor with the iteration variable i
        // all the same numbers will cancel each other and the one left is the missing number
        int xor = nums.length;
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i] ^ i;
        }
        return xor;
    }
}
