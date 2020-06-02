package codeWars.basicMathematicalOperations_20200416;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BasicOperationsTest {

  @Test
  public void testShouldReturnNullWhenOpIsNotOperation() {
    // Given: Set operation not + - * / and two numbers 4, 7
    String givenOp = "asda";
    int givenNumber1 = 4;
    int givenNumber2 = 7;
    // When: Call basicMath method
    Integer actual = BasicOperations.basicMath(givenOp, givenNumber1, givenNumber2);
    // Then: Should return null
    assertEquals(null, actual);
  }

  @Test
  public void testShouldReturn11WhenOpIsAddAndNumber4And7() {
    // Given: Set operation + and two numbers 4, 7
    String givenOp = "+";
    int givenNumber1 = 4;
    int givenNumber2 = 7;
    // When: Call basicMath method
    int actual = BasicOperations.basicMath(givenOp, givenNumber1, givenNumber2);
    // Then: Should return 11
    assertEquals(11, actual);
  }

  @Test
  public void testShouldReturnMinus3WhenOpIsSubtractAndNumber4And7() {
    // Given: Set operation + and two numbers 4, 7
    String givenOp = "-";
    int givenNumber1 = 4;
    int givenNumber2 = 7;
    // When: Call basicMath method
    int actual = BasicOperations.basicMath(givenOp, givenNumber1, givenNumber2);
    // Then: Should return 11
    assertEquals(-3, actual);
  }

  @Test
  public void testShouldReturn28WhenOpIsMultiplyAndNumber4And7() {
    // Given: Set operation + and two numbers 4, 7
    String givenOp = "*";
    int givenNumber1 = 4;
    int givenNumber2 = 7;
    // When: Call basicMath method
    int actual = BasicOperations.basicMath(givenOp, givenNumber1, givenNumber2);
    // Then: Should return 11
    assertEquals(28, actual);
  }

  @Test
  public void testShouldReturn0WhenOpIsDivideAndNumber4And7() {
    // Given: Set operation + and two numbers 4, 7
    String givenOp = "/";
    int givenNumber1 = 4;
    int givenNumber2 = 7;
    // When: Call basicMath method
    int actual = BasicOperations.basicMath(givenOp, givenNumber1, givenNumber2);
    // Then: Should return 11
    assertEquals(0, actual);
  }

}