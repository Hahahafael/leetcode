class Solution {
    public int findGCD(int[] nums) {
        int low = nums[0];
        int high = nums[0];

        for (int num : nums) {
            if (num > high) {
                high = num;
            }
            if (num < low) {
                low = num;
            }
        }
        return gcd(low, high);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}