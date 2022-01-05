package codeWars.kyu7.countTheDigit_20200611;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CountDigTest {

  @Test
  @DisplayName("test should return 4 when n=10, d=1")
  public void test1() {
    // Then: Should return 4
    assertEquals(4, CountDig.nbDig(10, 1));
  }

  @Test
  @DisplayName("test should return 10 when n=25, d=1")
  public void test2() {
    // Then: Should return 11
    assertEquals(11, CountDig.nbDig(25, 1));
  }

  @Test
  @DisplayName("test should return 4700 when n=5750, d=0")
  public void test3() {
    // Then: Should return 4700
    assertEquals(4700, CountDig.nbDig(5750, 0));
  }
}