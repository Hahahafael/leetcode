class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listona = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> linhaAtual = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    linhaAtual.add(1);
                } else {
                    List<Integer> linhaAnterior = listona.get(i - 1);
                    int soma = linhaAnterior.get(j - 1) + linhaAnterior.get(j);
                    linhaAtual.add(soma);
                }
            }
            listona.add(linhaAtual);
        }

        return listona;
    }
}