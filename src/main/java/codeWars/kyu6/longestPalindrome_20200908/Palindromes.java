package codeWars.kyu6.longestPalindrome_20200908;

public class Palindromes {

  public static int longestPalindrome(final String s) {
    int length = 0;
    for (int start = 0; start < s.length(); start++) {
      for (int end = s.length(); end >= start; end--) {
        String subString = s.substring(start, end);
        if (isPalindromes(subString) && subString.length() > length) {
          length = s.substring(start, end).length();
          break;
        }
      }
    }
    return length;
  }

  private static boolean isPalindromes(String subString) {
    String reverse = new StringBuilder(subString).reverse().toString();
    return subString.equals(reverse);
  }
}
