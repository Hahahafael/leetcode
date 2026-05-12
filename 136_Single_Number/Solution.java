class Solution {
    public int singleNumber(int[] nums) {
        int resultado = 0;
        for (int num : nums) {
            resultado ^= num; 
        }
        return resultado;
    }
}