package codeWars.kyu6.longestPalindrome_20200908;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PalindromesTest {

  @Test
  public void testWhenInputLength0() {
    assertEquals(0, Palindromes.longestPalindrome(""));
  }

  @Test
  public void testWhenInputNotHasPalindromes() {
    assertEquals(1, Palindromes.longestPalindrome("abcdefgh"));
  }

  @Test
  public void testWhenInputIsPalindromesWord() {
    assertEquals(7, Palindromes.longestPalindrome("racecars"));
  }

  @Test
  public void testWhenInputIsAnySentence() {
    assertEquals(7, Palindromes.longestPalindrome("I like racecars that go fast"));
  }

}