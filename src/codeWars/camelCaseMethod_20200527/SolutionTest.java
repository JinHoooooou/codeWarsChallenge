package codeWars.camelCaseMethod_20200527;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  @DisplayName("test should return 'HelloCase' when input 'hello case'")
  public void test1() {
    // Given: Set String
    String given = "hello case";

    // Then: should return HelloCase
    assertEquals("HelloCase", Solution.camelCase(given));
  }

  @Test
  @DisplayName("test should return 'CamelCaseMethod' when input '   camel    case    method  '")
  public void test2() {
    // Given: Set String
    String given = "   camel    case    method  ";

    // Then: should return CamelCaseMethod
    assertEquals("CamelCaseMethod", Solution.camelCase(given));
  }

  @Test
  @DisplayName("test should return '' when input ''")
  public void test3() {
    // Given: Set String
    String given = "";

    // Then: should return ''
    assertEquals("", Solution.camelCase(given));
  }
}