class Solution {
    public int getSum(int a, int b) {
        
        while (b != 0) {
            int carry = (a & b) << 1;
            a ^=b;
            b = carry;
        }
        
        return a;
        // 1 ==> 0001
        // 1 ==> 0001
        // 2 ==> 0010
        // 3 ==> 0011
        // 4 ==> 0100
    }
}
