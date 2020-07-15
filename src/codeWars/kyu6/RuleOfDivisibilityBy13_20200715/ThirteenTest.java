package codeWars.kyu6.RuleOfDivisibilityBy13_20200715;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ThirteenTest {

  @Test
  @DisplayName("test should return 87 when input=1234567")
  public void test1() {
    assertEquals(87, Thirteen.thirt(1234567));
  }

  @Test
  @DisplayName("test should return 79 when input=8529")
  public void test2() {
    assertEquals(79, Thirteen.thirt(8529));
  }

  @Test
  @DisplayName("test should return 31 when input=85299258")
  public void test3() {
    assertEquals(31, Thirteen.thirt(85299258));
  }

  @Test
  @DisplayName("test should return 57 when input=5634")
  public void test4() {
    assertEquals(57, Thirteen.thirt(5634));
  }

  @Test
  @DisplayName("test should return 71 when input=1111111111")
  public void test5() {
    assertEquals(71, Thirteen.thirt(1111111111));
  }

  @Test
  @DisplayName("test should return 30 when input=987654321")
  public void test6() {
    assertEquals(30, Thirteen.thirt(987654321));
  }
}