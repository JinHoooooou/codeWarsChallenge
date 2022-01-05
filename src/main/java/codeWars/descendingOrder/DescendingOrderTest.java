package codeWars.descendingOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DescendingOrderTest {

  @Test
  public void testWhenParameterIsOneDigit() {
    //Given
    int given = 2;
    //Then
    int actual = DescendingOrder.sortDesc(given);
    //Then
    assertEquals(2, actual);
  }

  @Test
  public void testWhenParameterIsTwoDigits() {
    //Given
    int given = 785629502;
    //Then
    int actual = DescendingOrder.sortDesc(given);
    //Then
    assertEquals(321, actual);
  }
}