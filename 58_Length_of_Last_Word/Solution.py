class Solution(object):
    def lengthOfLastWord(self, s):
        palavras = s.rstrip().split(' ')
        return len(palavras[-1])