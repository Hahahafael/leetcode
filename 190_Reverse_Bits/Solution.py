class Solution(object):
    def reverseBits(self, n):
        reverse = 0
        for i in range(32): 
            reverse <<= 1
            reverse |= (n & 1) 
            n >>= 1
        return reverse