package codeWars.squareEveryDigit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareDigitTest {

  @Test
  public void testWhenParameterIsOneDigit() {
    //Given
    int given = 2;
    //When
    int actual = new SquareDigit().squareDigit(given);
    //Then
    assertEquals(4, actual);
  }

  @Test
  public void testWhenParameterIsTwoDigit() {
    //Given
    int given = 9119;
    //When
    int actual = new SquareDigit().squareDigit(given);
    //Then
    assertEquals(811181, actual);
  }

}