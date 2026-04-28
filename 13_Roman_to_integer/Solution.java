class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> valores = new HashMap<>();
        valores.put('I', 1);
        valores.put('V', 5);
        valores.put('X', 10);
        valores.put('L', 50);
        valores.put('C', 100);
        valores.put('D', 500);
        valores.put('M', 1000);
        
        int resultado = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int atual = valores.get(s.charAt(i));
            if (i < s.length() - 1 && valores.get(s.charAt(i + 1)) > atual) {
                resultado -= atual;
            } else {
                resultado += atual;
            }
        }
        
        return resultado;
    }
}