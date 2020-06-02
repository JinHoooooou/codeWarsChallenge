package codeWars.validBraces_20200511;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BraceCheckerTest {

  BraceChecker braceChecker = new BraceChecker();

  @Test
  @DisplayName("(], {]등 괄호가 쌍이 아니라면 false")
  public void test1() {
    // Given: Set braces
    String given = "{]";
    // Then: should false
    assertFalse(braceChecker.isValid(given));
  }

  @Test
  @DisplayName("(), {}등 괄호가 쌍이 맞다면 true")
  public void test2() {
    // Given: Set braces
    String given = "{}";
    // Then: should true
    assertTrue(braceChecker.isValid(given));
  }

  @Test
  @DisplayName("([{}])처럼 괄호순서가 맞다면 true")
  public void test3() {
    // Given: Set braces
    String given = "([{}])";
    // Then: should true
    assertTrue(braceChecker.isValid(given));
  }

  @Test
  @DisplayName("(})처럼 괄호 짝이 없다면 false")
  public void test4() {
    // Given: Set braces
    String given = "(})";
    // Then: should false
    assertFalse(braceChecker.isValid(given));
  }

  @Test
  @DisplayName("(){}[] 처럼 떨어져 있다면 true")
  public void test5() {
    // Given: Set braces
    String given = "(){}[]";
    // Then: should true
    assertTrue(braceChecker.isValid(given));
  }
}