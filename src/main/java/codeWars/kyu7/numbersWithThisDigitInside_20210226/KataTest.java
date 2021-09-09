package codeWars.kyu7.numbersWithThisDigitInside_20210226;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class KataTest {

  @Test
  public void testShouldReturnZeros() {
    assertThat(Kata.NumbersWithDigitInside(5, 6), is(new long[]{0, 0, 0}));
    assertThat(Kata.NumbersWithDigitInside(6, 8), is(new long[]{0, 0, 0}));
  }

  @Test
  public void testShouldReturnOneSixSix() {
    assertThat(Kata.NumbersWithDigitInside(7, 6), is(new long[]{1, 6, 6}));
  }
}