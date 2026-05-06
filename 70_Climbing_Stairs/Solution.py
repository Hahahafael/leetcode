class Solution(object):
    def climbStairs(self, n):
        n1 = 1
        n2 = 1
        if n <= 2:
            return n
        for i in range (1,n):
            n3 = n1 + n2
            n1 = n2
            n2 = n3
        return n2