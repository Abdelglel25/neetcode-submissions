class Solution {
    public int missingNumber(int[] nums) {
        // Solution 4
        // the sum from 0 to N is known

        long sum = 0;
        long arraySum = 0;
        for (int i =0; i < nums.length; i++) {
            sum += i;
            arraySum += nums[i];
        }

        sum += nums.length;

        return (int) (sum - arraySum);
    }
}
