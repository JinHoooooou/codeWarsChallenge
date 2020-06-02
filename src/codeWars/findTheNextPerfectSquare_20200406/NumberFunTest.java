package codeWars.findTheNextPerfectSquare_20200406;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberFunTest {

  @Test
  public void testShouldReturnMinus1WhenInputIsNotPerfectSquare() {
    // Given: Set input integer not perfect square
    int given = 114;
    // When: Call findNextSquare method
    long actual = NumberFun.findNextSquare(given);
    // Then: Should return -1
    assertEquals(-1, actual);
  }

  @Test
  public void testShouldReturn676WhenInputIs625() {
    // Given: Set input integer 625(25 square)
    int given = 625;
    // When: Call findNextSquare method
    long actual = NumberFun.findNextSquare(given);
    // Then: Should return 676(26 square)
    assertEquals(676, actual);
  }




}