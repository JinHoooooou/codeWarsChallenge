package codeWars.kyu5.primesInNumbers_20200627;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PrimeDecompTest {

  @Test
  @DisplayName("test should return 2 when input=2")
  public void test1() {
    // Then: Should return (2)
    assertEquals("(2)", PrimeDecomp.factors(2));
  }

  @Test
  @DisplayName("test should return (2**2)(3) when input=12")
  public void test2() {
    // Then: Should return (2**2)(3)
    assertEquals("(2**2)(3)", PrimeDecomp.factors(12));
  }

  @Test
  @DisplayName("test should return (2**5)(5)(7**2)(11) when input=86240")
  public void test3() {
    // Then: Should return (2**5)(5)(7**2)(11)
    assertEquals("(2**5)(5)(7**2)(11)", PrimeDecomp.factors(86240));
  }

  @Test
  @DisplayName("test should return (2**2)(3**3)(5)(7)(11**2)(17) when input=7775460")
  public void test4() {
    // Then: Should return (2**2)(3**3)(5)(7)(11**2)(17)
    assertEquals("(2**2)(3**3)(5)(7)(11**2)(17)", PrimeDecompBestPractice.factors(7775460));
  }


}