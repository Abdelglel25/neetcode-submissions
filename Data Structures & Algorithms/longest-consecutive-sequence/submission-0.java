class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }

        int longest = 0;
        for(int num : set) {
            int lonng = 1;
            while(set.contains(num + lonng)) {
                lonng++;
            }
            longest = Math.max(longest, lonng);
        }
        return longest;
    }
}
