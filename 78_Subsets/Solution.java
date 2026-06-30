class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultado = new ArrayList<>();
        resultado.add(new ArrayList<>());
        
        for (int num : nums) {
            int tamanhoAtual = resultado.size();
            for (int i = 0; i < tamanhoAtual; i++) {
                List<Integer> novoSubconjunto = new ArrayList<>(resultado.get(i));
                novoSubconjunto.add(num);
                resultado.add(novoSubconjunto);
            }
        }
        
        return resultado;
    }
}