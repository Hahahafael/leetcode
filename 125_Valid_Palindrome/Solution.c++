class Solution {
public:
    bool isPalindrome(string s) {
        int frente = 0;
        int final = s.length() - 1;

        while (frente < final) {
            if (!std::isalnum(s[frente])) {
                frente++;
            }
            else if (!std::isalnum(s[final])) {
                final--;
            }
            else {
                if (std::tolower(s[frente]) != std::tolower(s[final])) {
                    return false;
                }
                frente++;
                final--;
            }
        }
        return true;
    }
};