class Solution {
public:
    string addBinary(string a, string b) {
        string resultado;
        resultado.reserve(max(a.size(), b.size()) + 1);
        int i = a.size() - 1;
        int j = b.size() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry) {
            int soma = carry;
            if (i >= 0) soma += a[i--] - '0';
            if (j >= 0) soma += b[j--] - '0';
            resultado.push_back((soma % 2) + '0');
            carry = soma / 2;
        }
        reverse(resultado.begin(), resultado.end());
        return resultado;
    }
};