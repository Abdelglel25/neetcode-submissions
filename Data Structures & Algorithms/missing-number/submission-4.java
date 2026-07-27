class Solution {
    public int missingNumber(int[] nums) {
        // need to sort first
        // then for loop and check if nums[i] == i
        // time complexity: n log(n) (best sort algo)
        // space complexity: depends on the sort algo
        Arrays.sort(nums);
        for (int i = 0; i < nums.length ; i++) {
            if (i != nums[i])
                return i;
        }
        return nums[nums.length - 1] + 1;
    }
}
