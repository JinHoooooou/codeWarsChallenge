package codeWars.kyu7.palindromeChainLength_20201221;

public class Palindromes {

  public static int palindromeChainLength(long n) {
    String reverse = new StringBuilder(String.valueOf(n)).reverse().toString();
    return reverse.equals(String.valueOf(n)) ? 0
        : 1 + palindromeChainLength(n + Long.parseLong(reverse));
  }
}
