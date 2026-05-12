class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int resultado = 0;
        for(int num : nums){
            resultado ^= num;
        }
        return resultado;
    }
};