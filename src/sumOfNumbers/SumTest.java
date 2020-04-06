package sumOfNumbers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTest {

  @Test
  public void testWhenStartNumberIsSameWithEndNumber() {
    //Given
    int givenStart = 2;
    int givenEnd = 2;
    //When
    int actual = Sum.getSum(givenStart, givenEnd);
    //Then
    assertEquals(2, actual);
  }

  @Test
  public void testWhenStartNumberIsSmallerThanEndNumber() {
    //Given
    int givenStart = 1;
    int givenEnd = 10;
    //When
    int actual = Sum.getSum(givenStart, givenEnd);
    //Then
    assertEquals(55, actual);
  }

  @Test
  public void testWhenStartNumberIsBiggerThanEndNumber() {
    //Given
    int givenStart = 10;
    int givenEnd = 1;
    //When
    int actual = Sum.getSum(givenStart, givenEnd);
    //Then
    assertEquals(55, actual);
  }
}