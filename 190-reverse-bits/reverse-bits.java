class Solution {
    public int reverseBits(int n) {
        int res = 0;
        for(int j = 0; j<32; j++) {
            int b = n % 2 ;
            if(b == 1) res += Math.pow(2,31-j);

            n = (int)n/2;
        }
        return res;
    }
}