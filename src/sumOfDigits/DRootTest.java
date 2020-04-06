package sumOfDigits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DRootTest {

  @Test
  public void testWhenParameterIsOneDigit() {
    //Given
    int given = 7;
    //When
    int actual = DRoot.digital_root(given);
    //Then
    assertEquals(7, actual);
  }

  @Test
  public void testWhenParameterIsMoreThanDigits() {
    //Given
    int given = 132189;
    //When
    int actual = DRoot.digital_root(given);
    //Then
    assertEquals(6, actual);
  }

}