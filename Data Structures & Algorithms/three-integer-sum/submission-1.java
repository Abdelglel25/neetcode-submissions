class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        Set<String> as = new HashSet<>(nums.length);
        for (int i =0; i < nums.length ; i++) {
            int remaining = -nums[i];

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int sum = nums[l] + nums[r];
                if (sum > remaining) {
                    r--;
                } else if (sum < remaining) {
                    l++;
                } else {
                    List<Integer> list = new ArrayList<>();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(nums[i]);
                    stringBuilder.append(nums[l]);
                    stringBuilder.append(nums[r]);
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    if (as.add(stringBuilder.toString())) ans.add(list);
                    l++;
                }
            }

        }

        return ans;
    }

}
