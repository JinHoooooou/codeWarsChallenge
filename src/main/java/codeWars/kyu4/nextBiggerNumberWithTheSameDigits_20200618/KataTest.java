package codeWars.kyu4.nextBiggerNumberWithTheSameDigits_20200618;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  @DisplayName("test should return 21 when input 12")
  public void test0() {
    // Then: Should return 21
    assertEquals(21, Kata.nextBiggerNumber(12));
  }

  @Test
  @DisplayName("test should return 531 when input 513")
  public void test1() {
    // Then: Should return 531
    assertEquals(531, Kata.nextBiggerNumber(513));
  }

  @Test
  @DisplayName("test should return 2071 when input 2017")
  public void test2() {
    // Then: Should return 2071
    assertEquals(2071, Kata.nextBiggerNumber(2017));
  }

  @Test
  @DisplayName("test should return 1952808689 when input 1952806988")
  public void test3() {
    // Then: Should return 1952808689
    assertEquals(1952808689, Kata.nextBiggerNumber(1952806988));
  }
}