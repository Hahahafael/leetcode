class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int somaEsperada = (n * (n + 1)) / 2;
        int somaReal = 0;
        for (int num : nums) {
            somaReal += num;
        }
        return somaEsperada - somaReal;
    }
}