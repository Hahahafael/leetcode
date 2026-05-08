class Solution {
    public int searchInsert(int[] nums, int target) {
    int cont = 0;
        while(cont < nums.length && nums[cont] < target){
            cont++;
        }
        return cont; 
    }
}