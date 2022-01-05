package codeWars.kyu6.reverseOrRotate_20200701;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RevRotTest {

  @Test
  @DisplayName("test should empty string when input is empty string")
  public void test1() {
    // Given: Set input
    String string = "";
    int sz = 5;

    // Then: Should return ""
    assertEquals("", RevRot.revRot(string, sz));
  }

  @Test
  @DisplayName("test should empty string when input sz is greater than string length")
  public void test2() {
    // Given: Set input
    String string = "1235";
    int sz = 5;

    // Then: Should return ""
    assertEquals("", RevRot.revRot(string, sz));
  }

  @Test
  @DisplayName("test should return '234561' when string='123456' and sz=6")
  public void test3() {
    // Given: Set input
    String string = "123456";
    int sz = 6;

    // Then: Should return "234561"
    assertEquals("234561", RevRot.revRot(string, sz));
  }

  @Test
  @DisplayName("test should return '123457' when string='754321' and sz=6")
  public void test4() {
    // Given: Set input
    String string = "123457";
    int sz = 6;

    // Then: Should return "754321"
    assertEquals("754321", RevRot.revRot(string, sz));
  }

  @Test
  @DisplayName("test should return '234561876549' when string='123456987654' and sz=6")
  public void test5() {
    // Given: Set input
    String string = "123456987654";
    int sz = 6;

    // Then: Should return "234561876549"
    assertEquals("234561876549", RevRot.revRot(string, sz));
  }

  @Test
  @DisplayName("test should return '234561876549' when string='123456987654' and sz=6")
  public void test6() {
    // Given: Set input
    String string = "123456987654";
    int sz = 6;

    // Then: Should return "234561876549"
    assertEquals("234561876549", RevRot.revRot(string, sz));
  }

}