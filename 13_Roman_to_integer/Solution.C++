class Solution {
public:
    int romanToInt(string s) {
        unordered_map<char, int> valores = {
            {'I', 1},
            {'V', 5},
            {'X', 10},
            {'L', 50},
            {'C', 100},
            {'D', 500},
            {'M', 1000}
        };
        
        int resultado = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && valores[s[i]] < valores[s[i + 1]]) {
                resultado -= valores[s[i]];
            } 
            else {
                resultado += valores[s[i]];
            }
        }
        return resultado;
    }
};