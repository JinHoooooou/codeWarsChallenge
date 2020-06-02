package codeWars.writeNumberInExpandedForm_20200513;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  @DisplayName("test should return 10 + 2 when input is 12")
  public void test1() {
    // Then: should return 10 + 2
    assertEquals("10 + 2", Kata.expandedForm(12));
  }

  @Test
  @DisplayName("test should return 70000 + 300 + 4 when input is 70304")
  public void test2() {
    // Then: should return 70000 + 300 + 4
    assertEquals("70000 + 300 + 4", Kata.expandedForm(70304));
  }

  @Test
  @DisplayName("test should return 90000 when input is 90000")
  public void test3() {
    // Then: should return 90000
    assertEquals("90000", Kata.expandedForm(90000));
  }
}