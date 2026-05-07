class Solution {
    public int reverse(int x) {
        int reverso = 0;
        while (x != 0) {
            int pop = x % 10; 
            x /= 10;          
            if (reverso > Integer.MAX_VALUE / 10 || (reverso == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (reverso < Integer.MIN_VALUE / 10 || (reverso == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            
            reverso = reverso * 10 + pop;
        }
        
        return reverso;
    }
}