class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int l = 0;
        int r = heights.length - 1;
        while (l < r) {
            int left = heights[l];
            int right = heights[r];
            int width = r - l;
            int height = Math.min(left, right);
            int area = width * height;
            max = Math.max(area, max);
            if (left > right) {
                r--;
            } else {
                l++;
            }
        }
        return max;
    }
}
