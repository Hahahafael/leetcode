class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] hasMinuscula = new boolean[26];
        boolean[] hasMaiuscula = new boolean[26];
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c >= 'a' && c <= 'z') {
                hasMinuscula[c - 'a'] = true; 
            } else if (c >= 'A' && c <= 'Z') {
                hasMaiuscula[c - 'A'] = true;
            }
        }
        
        int contador = 0;
        for (int i = 0; i < 26; i++) {
            if (hasMinuscula[i] && hasMaiuscula[i]) {
                contador++;
            }
        }
        
        return contador;
    }
}