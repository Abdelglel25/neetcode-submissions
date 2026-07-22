class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int counter = 0;
            int num = i;
            while ( num != 0) {
                num &= (num - 1);
                counter++;
            }
            result[i] = counter;
        }
        return result;
    }
}
