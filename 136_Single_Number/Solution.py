class Solution(object):
    def singleNumber(self, nums):
        resultado = 0
        for num in nums:
            resultado ^= num
        return resultado