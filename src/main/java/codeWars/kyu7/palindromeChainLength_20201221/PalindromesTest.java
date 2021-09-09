package codeWars.kyu7.palindromeChainLength_20201221;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromesTest {

  @Test
  public void testWhenInputDigitLengthIs1() {
    assertThat(Palindromes.palindromeChainLength(1), is(0));
    assertThat(Palindromes.palindromeChainLength(2), is(0));
    assertThat(Palindromes.palindromeChainLength(0), is(0));
    assertThat(Palindromes.palindromeChainLength(9), is(0));
  }

  @Test
  public void testWhenInputDigitLengthLargerThan1() {
    assertThat(Palindromes.palindromeChainLength(10), is(1));
    assertThat(Palindromes.palindromeChainLength(134), is(1));
    assertThat(Palindromes.palindromeChainLength(87), is(4));
    assertThat(Palindromes.palindromeChainLength(2897), is(7));
    assertThat(Palindromes.palindromeChainLength(89), is(24));
  }
}