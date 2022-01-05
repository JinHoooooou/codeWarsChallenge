package codeWars.IsThisATriangle_20200329;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TriangleTesterTest {

  @Test
  public void testWhenSumOfTwoSidesGreaterThanLongestSideShouldReturnTrue() {
    //Given
    int givenA = 1;
    int givenB = 2;
    int givenC = 2;
    //When
    boolean actual = TriangleTester.isTriangle(givenA, givenB, givenC);
    //Then
    assertTrue(actual);
  }
  @Test
  public void testWhenSumOfTwoSidesLessThanLongestSideShouldReturnFalse() {
    //Given
    int givenA = 7;
    int givenB = 2;
    int givenC = 2;
    //When
    boolean actual = TriangleTester.isTriangle(givenA, givenB, givenC);
    //Then
    assertFalse(actual);
  }

}