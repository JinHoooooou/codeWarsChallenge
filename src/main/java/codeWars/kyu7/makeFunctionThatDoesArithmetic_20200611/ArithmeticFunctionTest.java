package codeWars.kyu7.makeFunctionThatDoesArithmetic_20200611;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ArithmeticFunctionTest {

  @Test
  @DisplayName("test should return 7 when input 2, 5, 'add'")
  public void test1() {
    // Then: Should return 7
    assertEquals(7, ArithmeticFunction.arithmetic(2, 5, "add"));
  }

  @Test
  @DisplayName("test should return -3 when input 2, 5, 'subtract'")
  public void test2() {
    // Then: Should return -3
    assertEquals(-3, ArithmeticFunction.arithmetic(2, 5, "subtract"));
  }
}