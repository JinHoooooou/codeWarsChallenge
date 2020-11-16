package codeWars.kyu8.wilsonPrimes_20201116;

import static org.junit.Assert.*;

import org.junit.Test;

public class WilsonPrimeTest {

  @Test
  public void testFalseWhenInputIs1() {
    assertFalse(WilsonPrime.am_i_wilson(1));
  }

  @Test
  public void testTrueWhenInputIs5() {
    assertTrue(WilsonPrime.am_i_wilson(5));
  }

  @Test
  public void testFalseWhenInputIs42() {
    assertFalse(WilsonPrime.am_i_wilson(42));
  }
}