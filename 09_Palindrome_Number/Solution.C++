class Solution {
public:
    bool isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int metadeReversa = 0;
        while (x > metadeReversa) {
            metadeReversa = (metadeReversa * 10) + (x % 10);
            x /= 10;
        }
        return x == metadeReversa || x == metadeReversa / 10;
    }
};