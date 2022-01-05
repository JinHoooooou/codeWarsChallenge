package codeWars.isNumberPrime_20200419;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PrimeTest {

  @Test
  public void testShouldFalseWhenInputIsNegativeInteger() {
    // Then: Should return false
    assertFalse(Prime.isPrime(-3));
  }

  @Test
  public void testShouldFalseWhenInputIs1() {
    // Then: Should return false
    assertFalse(Prime.isPrime(1));
  }

  @Test
  public void testShouldTrueWhenInputIs2() {
    // Then: Should return true
    assertTrue(Prime.isPrime(2));
  }

  @Test
  public void testShouldFalseWhenInputIs4() {
    // Then: Should return false
    assertFalse(Prime.isPrime(4));
  }

  @Test
  public void testShouldTrueWhenInputIs11() {
    // Then: Should return true
    assertTrue(Prime.isPrime(11));
  }

}