class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1; 
        int j = b.length() - 1; 
        int carry = 0;      
        while (i >= 0 || j >= 0 || carry > 0) {
            int soma = carry;
            if (i >= 0) soma += a.charAt(i--) - '0'; 
            if (j >= 0) soma += b.charAt(j--) - '0'; 
            sb.append(soma % 2); 
            carry = soma / 2;  
        }
        return sb.reverse().toString();
    }
}