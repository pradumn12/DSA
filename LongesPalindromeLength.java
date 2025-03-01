/*Understand the solution, not yet got to know */

public class LongesPalindromeLength {
    public static void main(String[] args) {
        
    }

    public class Solution{
    public static String expandAroundCenter(String s, int c1, int c2) {
        int l = c1, r = c2;
        int n = s.length();
        while (l >= 0 && r <= n - 1 && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }
    public static String longestPalindrome(String A) {
        int n = A.length();
        if (n == 0)
            return "";
        String longest = A.substring(0, 1); // a single char itself is a palindrome
        for (int i = 0; i < n - 1; i++) {
            String p1 = expandAroundCenter(A, i, i);
            if (p1.length() > longest.length())
                longest = p1;
            String p2 = expandAroundCenter(A, i, i + 1);
            if (p2.length() > longest.length())
                longest = p2;
            }
            return longest;
    }
        }
}
