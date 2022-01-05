package codeWars.isNDivisibleByXAndY_20200428;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DivisibleNbTest {

  @Test
  public void testShouldTrueWhenNIs3AndXIs1AndYIs3() {
    // Given: Set input value
    int givenN = 3;
    int givenX = 1;
    int givenY = 3;

    // Then: Should return true
    assertTrue(DivisibleNb.isDivisible(givenN, givenX, givenY));
  }
}