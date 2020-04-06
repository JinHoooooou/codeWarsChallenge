package createPhoneNumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void testWithIntArray() {
    //Given
    int[] given = {1,2,3,4,5,6,7,8,9,0};
    //When
    String actual = Kata.createPhoneNumber(given);
    //Then
    assertEquals("(123) 456-7890", actual);
  }
}