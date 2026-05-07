class Solution {
public:
    int reverse(int x) {
        int reverso = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (reverso > INT_MAX/10 || (reverso == INT_MAX/10 && pop > 7)) return 0;
            if (reverso < INT_MIN/10 || (reverso == INT_MIN/10 && pop < -8)) return 0;
            reverso = reverso * 10 + pop;
        }
        return reverso;
    }
};