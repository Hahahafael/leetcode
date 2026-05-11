class Solution(object):
    def isBalanced(self, root):
        return self.obter_altura(root) != -1

    def obter_altura(self, no):
        if not no:
            return 0

        altura_esq = self.obter_altura(no.left)
        if altura_esq == -1:
            return -1

        altura_dir = self.obter_altura(no.right)
        if altura_dir == -1:
            return -1

        if abs(altura_esq - altura_dir) > 1:
            return -1

        return max(altura_esq, altura_dir) + 1