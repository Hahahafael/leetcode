class Solution {
    public int reverseBits(int n) {
        int reverso = 0;
        
        for (int i = 0; i < 32; i++) {
            reverso <<= 1;
            reverso |= (n & 1);
            n >>= 1;
        }
        
        return reverso;
    }
}