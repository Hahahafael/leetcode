class Solution(object):
    def searchInsert(self, nums, target):
        cont = 0
        while cont < len(nums) and nums[cont] < target:
            cont+=1
        return cont
        