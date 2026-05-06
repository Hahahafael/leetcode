class Solution {
    public int climbStairs(int n) {
        int n1 = 1;
        int n2 = 1;
        if (n <= 2) return n;
        for(int i = 1;i<n;i++){
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n2;
    }
}