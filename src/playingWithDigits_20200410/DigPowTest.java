package playingWithDigits_20200410;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DigPowTest {

  @Test
  public void testShouldSplitFirstParameterByDigit() {
    // Given: Set first parameter
    int given = 89;
    // When: Call split method
    String[] actual = DigPow.split(given);
    // Then: Should return {8, 9}
    assertArrayEquals(new String[]{"8", "9"}, actual);
  }

  @Test
  public void testShouldCalculateWithDigitAndPow() {
    // Given: Set digit array and pow
    int givenNumber = 89;
    int givenPow = 1;
    String[] givenArray = DigPow.split(givenNumber);
    // When: Call calculate method
    long actual = DigPow.calculate(givenArray, givenPow);
    // Then: Should return 89
    assertEquals(89, actual);
  }

  @Test
  public void testShouldReturnQuotientWhenDivisionCalculateResultFirstParameterIsNoReminder() {
    // Given: Set number and pow
    int givenNumber = 89;
    int givenPow = 1;
    // When: Call calculate method
    long actual = DigPow.digPow(89, 1);
    // Then: Should return 1 --> 8^1 + 9^2 = 89 --> 89 = 89*1 --> 1
    assertEquals(1, actual);
  }




}