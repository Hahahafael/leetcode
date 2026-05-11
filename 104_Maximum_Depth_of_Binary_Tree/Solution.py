class Solution(object):
    def maxDepth(self, root):
        if root is None: return 0
        lcount = self.maxDepth(root.left)
        rcount = self.maxDepth(root.right)
        return max(lcount,rcount) + 1
        