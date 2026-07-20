class Solution {
    public int getSum(int a, int b) {
        if(a ==0) return b;
        return getSum((a&b) << 1, a^b);
        // 1 ==> 0001
        // 1 ==> 0001
        // 2 ==> 0010
        // 3 ==> 0011
        // 4 ==> 0100
    }
}
