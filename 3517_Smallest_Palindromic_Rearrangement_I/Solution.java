public class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        
        int[] freq = new int[26];
        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
        }
        
        StringBuilder leftHalf = new StringBuilder();
        char middleChar = 0;
        
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                char c = (char) ('a' + i);

                int halfCount = freq[i] / 2;
                for (int j = 0; j < halfCount; j++) {
                    leftHalf.append(c);
                }
                
                if (freq[i] % 2 != 0) {
                    middleChar = c;
                }
            }
        }
        
        String leftStr = leftHalf.toString();
        String rightStr = leftHalf.reverse().toString();
        
        if (middleChar != 0) {
            return leftStr + middleChar + rightStr;
        } else {
            return leftStr + rightStr;
        }
    }
}