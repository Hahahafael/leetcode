class Solution {
public:
    int mySqrt(int x) {
        if(2>x) {
            return x;
        }
        long y = x;
        while(y*y>x){
            y = (y + x / y) / 2;
        }
        return (int) y;
    }
};