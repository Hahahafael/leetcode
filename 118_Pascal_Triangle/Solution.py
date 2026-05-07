class Solution(object):
    def generate(self, numRows):
        listona = []
        for i in range(numRows):
            linha = [1] * (i + 1)
            for j in range(1, i):
                linha[j] = listona[i-1][j-1] + listona[i-1][j]
            listona.append(linha)
        return listona
        