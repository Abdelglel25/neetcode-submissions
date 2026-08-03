class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int mid = r/2;

        while (l <= r) {
            if (nums[mid] == target) return mid;

            if (target > nums[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
            mid = l + (r-l) /2;
        }
        return -1;
    }
}
