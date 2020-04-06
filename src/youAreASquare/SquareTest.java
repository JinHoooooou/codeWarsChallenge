package youAreASquare;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

  @Test
  public void testShouldFalseWhenParameterIsNegativeInteger() {
    //Given
    int given = -1;
    //when
    boolean actual = Square.isSquare(given);
    //Then
    assertEquals(false, actual);
  }

  @Test
  public void testShouldTrueWhenParameterIsSquare() {
    //Given
    int given = 4;
    //when
    boolean actual = Square.isSquare(given);
    //Then
    assertEquals(true, actual);
  }
}