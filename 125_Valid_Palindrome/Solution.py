class Solution(object):
    def isPalindrome(self, s):
        frente = 0
        final = len(s) - 1
        while frente < final:
            if not s[frente].isalnum():
                frente += 1
            elif not s[final].isalnum():
                final -= 1
            else:
                if s[frente].lower() != s[final].lower():
                    return False
                frente += 1
                final -= 1
                
        return True