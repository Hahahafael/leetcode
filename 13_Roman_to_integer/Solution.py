class Solution(object):
    def romanToInt(self, s):
        valores = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }
        resultado = 0
        n = len(s)
        for i in range(n):
            valor_atual = valores[s[i]]
            if i < n - 1 and valores[s[i+1]] > valor_atual:
                resultado -= valor_atual
            else:
                resultado += valor_atual
                
        return resultado