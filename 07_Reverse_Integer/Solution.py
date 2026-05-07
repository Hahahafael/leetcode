class Solution(object):
    def reverse(self, x):
        sinal = (x > 0) - (x < 0)
        reverso = int(str(abs(x))[::-1])
        return sinal * reverso * (reverso < 2147483648)