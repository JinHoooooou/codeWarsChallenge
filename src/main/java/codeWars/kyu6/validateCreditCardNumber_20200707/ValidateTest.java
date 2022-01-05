package codeWars.kyu6.validateCreditCardNumber_20200707;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ValidateTest {

  @Test
  @DisplayName("test should false when input '1714'")
  public void test1() {
    assertFalse(Validate.validate("1714"));
  }

  @Test
  @DisplayName("test should false when input '12345'")
  public void test2() {
    assertFalse(Validate.validate("12345"));
  }

  @Test
  @DisplayName("test should false when input '891'")
  public void test3() {
    assertFalse(Validate.validate("891"));
  }

  @Test
  @DisplayName("test should true when input '315'")
  public void test4() {
    assertTrue(Validate.validate("315"));
  }
}