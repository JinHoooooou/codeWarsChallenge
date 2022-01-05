package codeWars.kyu3.calculator_20200721;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

  @Test
  @DisplayName("test should return 127 when input=127")
  public void test1() {
    assertEquals(new Double(127), Calculator.evaluate("127"));
  }

  @Test
  @DisplayName("test when input has only add and subtract")
  public void test2() {
    assertEquals(6.0, Calculator.evaluate("2.4 + 3.6"));
    assertEquals(-5, Calculator.evaluate("2 - 3 - 4"));
  }

  @Test
  @DisplayName("test when input has multiply and division")
  public void test3() {
    assertEquals(10.0, Calculator.evaluate("10 * 5 / 5"));
  }

  @Test
  @DisplayName("test when operation order is left to right")
  public void test4() {
    assertEquals(9.0, Calculator.evaluate("10 * 5 / 5 + 2 - 3"));
  }

  @Test
  @DisplayName("test when operation order is mixed")
  public void test5() {
    assertEquals(7, Calculator.evaluate("2 / 2 + 3 * 4 - 6"));
  }
}