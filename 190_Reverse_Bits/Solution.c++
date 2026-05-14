class Solution {
public:
    int reverseBits(int n) {
        uint32_t reverse = 0;
        int i = 0;
        for(i;i<32;i++){
            reverse <<= 1;
            reverse |= (n & 1);
            n >>= 1;
        }
        return reverse;
    }
};