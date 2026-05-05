class Solution {
    public boolean isHappy(int n) {
        int tartaruga = n;
        int lebre = n;
        do {
            tartaruga = proximoNumero(tartaruga);            
            lebre = proximoNumero(proximoNumero(lebre));    
        } while (tartaruga != lebre);
        return tartaruga == 1;
    }

    private int proximoNumero(int n) {
        int somaTotal = 0;
        while (n > 0) {
            int digito = n % 10;     
            somaTotal += (digito * digito);
            n = n / 10;                
        }
        return somaTotal;
    }
}