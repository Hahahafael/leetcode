class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] ultimaPosicao = new int[128];
        int maiorComprimento = 0;
        int inicio = 0; 

        for (int frente = 0; frente < s.length(); frente++) {
            char caractereAtual = s.charAt(frente);
            inicio = Math.max(inicio, ultimaPosicao[caractereAtual]);
            maiorComprimento = Math.max(maiorComprimento, frente - inicio + 1);
            ultimaPosicao[caractereAtual] = frente + 1;
        }

        return maiorComprimento;
    }
}