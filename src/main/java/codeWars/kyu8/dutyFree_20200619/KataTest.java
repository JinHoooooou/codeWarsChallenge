package codeWars.kyu8.dutyFree_20200619;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  @DisplayName("test should return 166 when normPrice=12, discount=50, hol=1000")
  public void test1() {
    // Given: Set input
    int normPrice = 12;
    int discount = 50;
    int hol = 1000;

    // Then: Should return 166
    assertEquals(166, Kata.dutyFree(normPrice, discount, hol));
  }

  @Test
  @DisplayName("test should return 294 when normPrice=17, discount=10, hol=500")
  public void test2() {
    // Given: Set input
    int normPrice = 17;
    int discount = 10;
    int hol = 500;

    // Then: Should return 294
    assertEquals(294, Kata.dutyFree(normPrice, discount, hol));
  }
}