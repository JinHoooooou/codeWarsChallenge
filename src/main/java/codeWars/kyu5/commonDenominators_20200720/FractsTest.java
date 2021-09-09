package codeWars.kyu5.commonDenominators_20200720;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FractsTest {

  @Test
  @DisplayName("test should return (6,12)(4,12)(3,12) when input=[1,2][1,3][1,4]")
  public void test1() {
    // Given: Set input
    long[][] lst = {{1, 2}, {1, 3}, {1, 4}};

    // Then: Should return (6,12)(4,12)(3,12)
    assertEquals("(6,12)(4,12)(3,12)", Fracts.convertFrac(lst));
  }

  @Test
  @DisplayName("test should return (6,12)(4,12)(3,12) when input=[1,2][1,3][10,40]")
  public void test2() {
    // Given: Set input
    long[][] lst = {{1, 2}, {1, 3}, {10, 40}};

    // Then: Should return (6,12)(4,12)(3,12)
    assertEquals("(6,12)(4,12)(3,12)", Fracts.convertFrac(lst));
  }

  @Test
  @DisplayName("test should return (18078,34060)(2262,34060)(25545,34060) when input=[69130],[87,1310],[30,40]")
  public void test3() {
    // Given: Set input
    long[][] lst = {{69, 130}, {87, 1310}, {30, 40}};

    // Then: Should return (18078,34060)(2262,34060)(25545,34060)
    assertEquals("(18078,34060)(2262,34060)(25545,34060)", Fracts.convertFrac(lst));
  }
}