class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int count = 0;
        while(count < nums.size() && nums[count] < target){
            count ++;
        }
        return count;
    }
};