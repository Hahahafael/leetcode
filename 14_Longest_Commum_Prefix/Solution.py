class Solution(object):
    def longestCommonPrefix(self, strs):
        if not strs:
            return ""
        prefixo = strs[0]
        for i in range(1, len(strs)):
            while strs[i].find(prefixo) != 0:
                prefixo = prefixo[:-1]
                if not prefixo:
                    return ""        
        return prefixo