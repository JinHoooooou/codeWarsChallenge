package codeWars.integersRecreationOne;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SumSquaredDivisorsTest {

  SumSquaredDivisors sumSquaredDivisors = new SumSquaredDivisors();

  @Test
  public void testShouldReturnList1And1WhenInputBoundIs1To41() {
    // Given: Set start 1, end 41
    long givenStart = 1;
    long givenEnd = 41;
    // When: Call listSquared method
    String actual = sumSquaredDivisors.listSquared(givenStart, givenEnd);
    // Then: Should return [[1, 1]]
    assertEquals("[[1, 1]]", actual);
  }

  @Test
  public void testShouldReturnList1With1And42With2500WhenInputBoundIs1To42() {
    // Given: Set start 1, end 42
    long givenStart = 1;
    long givenEnd = 42;
    // When: Call listSquared method
    String actual = sumSquaredDivisors.listSquared(givenStart, givenEnd);
    // Then: Should return [[1, 1], [42, 2500]]
    assertEquals("[[1, 1], [42, 2500]]", actual);
  }

  @Test
  public void testShouldReturnList1With1And42With2500And246With84100WhenInputBoundIs1To250() {
    // Given: Set start 1, end 250
    long givenStart = 1;
    long givenEnd = 250;
    // When: Call listSquared method
    String actual = sumSquaredDivisors.listSquared(givenStart, givenEnd);
    // Then: Should return [[1, 1], [42, 2500], [246, 84100]]
    assertEquals("[[1, 1], [42, 2500], [246, 84100]]", actual);
  }

}