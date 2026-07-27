class Solution {
    public int missingNumber(int[] nums) {
        // solution 2
        Set<Integer> numsSet = new HashSet<>(nums.length);
        for(int num : nums) {
            numsSet.add(num);
        }

        for (int i = 0; i <= nums.length; i++) {
            if (numsSet.add(i)) return i;
        }
        return 0;
    }
}
